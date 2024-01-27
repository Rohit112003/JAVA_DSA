package ip;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class localIp {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("IP Address of the local machine: " + localhost.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Unable to determine the local machine's IP address.");
            e.printStackTrace();
        }
    }
}
