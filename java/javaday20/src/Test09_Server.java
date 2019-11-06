import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test09_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5555);
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Socket socket = ss.accept();
                        File file = new File("a.jpg");
                        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                        OutputStream out = socket.getOutputStream();
                        int len;
                        byte[] bytes = new byte[1024];
                        while (-1 != (len = bis.read(bytes))) {
                            out.write(bytes, 0, len);
                        }
                        out.close();
                        bis.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
}
