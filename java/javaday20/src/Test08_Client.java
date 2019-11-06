import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test08_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",7777);
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();
        OutputStream out = socket.getOutputStream();
        out.write(info.getBytes());
        out.write("\r\n".getBytes());
        out.flush();
        //写完给服务端之后，需要shutdown socket输出流
        socket.shutdownOutput();
        InputStream in = socket.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        while (-1!=(len = in.read(bytes))){
            System.out.println(new String(bytes,0,len));
        }
        in.close();
        out.close();
        socket.close();
    }
}
