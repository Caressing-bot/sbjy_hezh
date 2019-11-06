import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test07_Server {
    public static void main(String[] args) throws IOException {
        while (true){
            ServerSocket ss = new ServerSocket(8887);
            Socket socket = ss.accept();
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            File file = new File(System.currentTimeMillis()+".jpg");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            int len;
            byte[] bytes = new byte[1024 * 8];
            while (-1 != (len = bis.read(bytes))){
                bos.write(bytes,0,len);
            }
            OutputStream os = socket.getOutputStream();
            os.write("上传成功 ".getBytes());
            os.close();
            bos.close();
            bis.close();
            socket.close();
        }
    }

}
