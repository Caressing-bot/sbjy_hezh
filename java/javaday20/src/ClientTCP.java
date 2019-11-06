import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        Socket client = new Socket("localhost",6656);
        OutputStream os  = client.getOutputStream();
        Scanner scr= new Scanner(System.in);
        os.write(scr.next().getBytes());
        //os.close();
        //client.close();
    }
}
