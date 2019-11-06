import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket sc = ss.accept();
        String address = sc.getInetAddress().getHostAddress();
        int port = sc.getPort();
        String client =address +":"+port;

        InputStream is = sc.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        while (-1!=len){
            System.out.println("来自"+client+"发信息："+new String(b,0,len));
        }
        is.close();
        ss.close();
    }
}
