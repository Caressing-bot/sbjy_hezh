import java.io.*;
import java.net.Socket;

public class Test09_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",5555);
        File file = new File("b.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        InputStream in = socket.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        while (-1 !=(len = in.read(bytes))){
            bos.write(bytes,0,len);
        }
        in.close();
        bos.close();
        socket.close();
    }
}
