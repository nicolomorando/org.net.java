/**
 * @author Morando Nicolò
 * Datagram version 1.1
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class dataClient{
  public static void main(String[] args) throws Exception {
    DatagramSocket ds = new DatagramSocket(3000);
    byte[] buf = new byte[516]; 
    DatagramPacket dp = new DatagramPacket(buf, 516);
    ds.receive(dp);   
    String strRecv = new String(dp.getData(), 0, dp.getLength());
    System.out.println("data received: " + "'" + strRecv + "'");
    ds.close();
  }
}
