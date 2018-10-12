/**
 * @author Morando Nicolò
 * Datagram version 1.1
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.File;

public class dataSender{
  public static void main(String[] args) throws Exception {
    DatagramSocket ds = new DatagramSocket();
    String str = "I'm here!!";
    InetAddress ia = InetAddress.getByName("127.0.0.1");
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ia, 3000);
    System.out.println("Sended String: " + "'" + str + "'");
    ds.send(dp);
    ds.close();
  }
}
