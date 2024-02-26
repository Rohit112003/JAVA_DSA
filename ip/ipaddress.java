package ip;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class ipaddress {
    public static void main(String[] args) {
        String website = "chat.openai.com";

        try {
            InetAddress ipAddress = InetAddress.getByName(website);
            System.out.println("IP Address of " + website + ": " + ipAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to find IP address for " + website);
            e.printStackTrace();
        }
    }
}
