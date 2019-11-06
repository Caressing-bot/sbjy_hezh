import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test05 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8888);
        OutputStream os = client.getOutputStream();
        os.write("hello.服务器,我是客户端".getBytes());
        os.close();
    }
}
