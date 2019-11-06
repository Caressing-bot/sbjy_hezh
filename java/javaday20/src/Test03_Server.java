import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test03_Server {
    public static void main(String[] args) throws IOException {
        //接收端启动一个端口号为8888的服务应用程序
        DatagramSocket ds = new DatagramSocket(8888);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        //接受数据包
        ds.receive(dp);
        //原本dp是没有数据，接收了之后就具备数据，然后打印
        String s = new String(bytes, 0, bytes.length);
        System.out.println(s);

        ds.close();
    }
}
