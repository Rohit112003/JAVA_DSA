package ust.Assignment3.ProblemStatement5;
import java.io.*;
public class first {
    public static void main(String[] args) throws IOException {
        String fileName = "file.txt";


        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("Hello, this is a sample file created using Java.");
            readFile("file.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    static void readFile(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}
