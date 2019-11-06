import java.io.*;
import java.net.Socket;

public class Test07_Client {
    public static void main(String[] args) throws IOException {
        File file = new File("a.jpg");
        Socket socket = new Socket("localhost",8889);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        OutputStream os = socket.getOutputStream();
        int len;
        byte[] bytes = new byte[1024 * 8];
        while (-1!=(len = bis.read(bytes))){
            os.write(bytes,0,len);
            os.flush();
        }
        InputStream in = socket.getInputStream();
        int l;
        byte[] b = new byte[1024];
        l = in.read(b);
        System.out.println(new String(b,0,l));
        in.close();
        os.close();
        bis.close();
        socket.close();
    }
}
