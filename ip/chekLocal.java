package ip;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
public class chekLocal {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();

            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                String interfaceType = getInterfaceType(networkInterface);
                if (interfaceType != null) {
                    System.out.println("Interface Type: " + interfaceType);
                    System.out.println("Interface Name: " + networkInterface.getName());
                    System.out.println("Display Name: " + networkInterface.getDisplayName());
                    System.out.println("Is Up: " + networkInterface.isUp());
                    System.out.println("Is Loopback: " + networkInterface.isLoopback());
                    System.out.println("Is Virtual: " + networkInterface.isVirtual());
                    System.out.println();
                }
            }
        } catch (SocketException e) {
            System.err.println("Error while getting network interfaces.");
            e.printStackTrace();
        }
    }
    private static String getInterfaceType(NetworkInterface networkInterface) {
        String displayName = networkInterface.getDisplayName().toLowerCase();

        if (displayName.contains("eth") || displayName.contains("en")) {
            return "Ethernet";
        } else if (displayName.contains("bluetooth")) {
            return "Bluetooth";
        } else if (displayName.contains("wlan") || displayName.contains("wi-fi")) {
            return "WLAN";
        }
        return null;
    }
}

