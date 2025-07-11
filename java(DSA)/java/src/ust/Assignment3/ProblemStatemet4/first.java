package ust.Assignment3.ProblemStatemet4;
import java.util.*;
import java.io.*;
public class first {
    public static void main(String[] args) {
        String fileName = "file.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a sample file created using Java.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred");

        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred ");

        }
    }
}
