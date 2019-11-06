import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动，等待连接...");
        ServerSocket ss = new ServerSocket(6656);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        while (-1!=len){
            System.out.println(new String(b,0,len));
        }
//        is.close();
//        server.close();
    }
}
