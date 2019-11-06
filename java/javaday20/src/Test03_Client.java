import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Test03_Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String data = "我爱JAVA";
        byte[] bytes = data.getBytes();
        //数据包(字节，长度)UDP就是发数据包
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //给数据包设置发送的地址和端口号
        dp.setSocketAddress(new InetSocketAddress("127.0.0.1",8888));
        //发送数据
        ds.send(dp);
        //关闭资源
        ds.close();
    }
}
