package Assignment;



import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PeertoPeer {
    private static boolean terminate = false;


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Thread(() -> startDayTimeService()).start();
        new Thread(() -> host1()).start();
        new Thread(() -> host2()).start();
    }
    // H2 retrieves data from H1 new Thread(()-> host2()).start();
    private static void startDayTimeService() {
        try {
            DatagramSocket dsSocket = new DatagramSocket(9876); // DS listens on port 9876
            System.out.println("DS: Waiting for requests...");
            while (!terminate) {
                byte[] buffer = new byte[256];
                DatagramPacket requestPacket = new DatagramPacket(buffer, buffer.length);
                dsSocket.receive(requestPacket);
                // Get the client's address and port
                InetAddress clientAddress = requestPacket.getAddress();
                int clientPort = requestPacket.getPort();
                // Get the current date and time
                String dateTime = java.time.LocalDateTime.now().toString();
                buffer = dateTime.getBytes();
                // Send the response back to the client
                DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length, clientAddress, clientPort);
                dsSocket.send(responsePacket);

                System.out.println("DS: Sent date and time to " + clientAddress + ":" + clientPort);
            }
            dsSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    private static void host1() {
        try {
            DatagramSocket socket = new DatagramSocket();
            // Connect to DS
            InetAddress dsAddress = InetAddress.getByName("localhost");
            int dsPort = 9876;
            // Request data and time from DS
            String request = "RequestDateTime";
            byte[] buffer = request.getBytes();
            DatagramPacket requestPacket = new DatagramPacket(buffer, buffer.length, dsAddress, dsPort); socket.send(requestPacket);
            // Receive response from DS
            buffer = new byte[256];
            DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(responsePacket);
            // Display the received data and time
            String dateTime = new String(responsePacket.getData(), 0, responsePacket.getLength()); System.out.println("H1: Received date and time from DS: " + dateTime);
            socket.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void host2() {
        try {
            DatagramSocket socket = new DatagramSocket();
            // H2 retrieves data from H1
            InetAddress hlAddress = InetAddress.getByName("localhost");
            int h1Port = 9876; // Assuming HI opens a different port
            // Request data and time from H1
            String request = "RequestDataFromH1";
            byte buffer[] = request.getBytes();
            DatagramPacket requestPacket = new DatagramPacket(buffer, buffer.length, hlAddress, h1Port);
            socket.send(requestPacket);
            // Receive response from H1
            buffer = new byte[256];
            DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(responsePacket);
            // Display the received data and time from HI
            String dataFromH1 = new String(responsePacket.getData(), 0, responsePacket.getLength()); System.out.println("H2: Received data from H1: " + dataFromH1);
            socket.close(); terminate = true; // Set termination flag
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


