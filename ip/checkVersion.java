package ip;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class checkVersion {
    public static void main(String[] args) {
        String ipAddressOrHost = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";

        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddressOrHost);

            if (inetAddress instanceof java.net.Inet4Address) {
                System.out.println(ipAddressOrHost + " is an IPv4 address.");
            } else if (inetAddress instanceof java.net.Inet6Address) {
                System.out.println(ipAddressOrHost + " is an IPv6 address.");
            } else {
                System.out.println(ipAddressOrHost + " is neither IPv4 nor IPv6.");
            }
        } catch (UnknownHostException e) {
            System.err.println("Unable to determine the IP version for " + ipAddressOrHost);
            e.printStackTrace();
        }
    }
}
