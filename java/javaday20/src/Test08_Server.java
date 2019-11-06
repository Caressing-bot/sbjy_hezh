import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Test08_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        while (true){
            Socket socket = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String info = br.readLine();
            File file = new File("a.txt");
            ArrayList<String> list = new ArrayList<>();
            BufferedReader br2 = new BufferedReader(new FileReader(file));
            String line2;
            while (null !=(line2 = br2.readLine())){
                list.add(line2);
            }
            String[] sp = info.split("=");
            String account = sp[0].trim();
            String password = sp[1].trim();
            boolean tag = false;
            String backData = "";
            for (String str:list) {
                if (str.startsWith(account)){
                    tag =true;
                    //找到了用户名,下一步比较密码
                    if (str.endsWith(password)){
                        //说明密码正确
                        backData = "密码正确";
                    }else {
                        //密码错误
                        backData = "密码错误";
                    }
                    break;
                }
            }
            if (!"".equals(backData)){
                //将反馈信息传给客户端
                OutputStream os = socket.getOutputStream();
                os.write(backData.getBytes());
                os.close();
            }
            if (!tag){
                list.add(account+"="+password);
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                for (String str:list) {
                    bos.write(str.getBytes());
                    bos.write("\r\n".getBytes());
                }
                bos.close();
                socket.shutdownInput();
                OutputStream out2 = socket.getOutputStream();
                out2.write("注册成功".getBytes());
                out2.write("\r\n".getBytes());
            }
            //关闭资源
            br2.close();
            br.close();
            socket.close();

        }
    }

}
