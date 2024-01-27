package StringBuffer;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
public class BufferClass {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer buffer = new StringBuffer();
        //constructor 2
        StringBuffer sb2 = new StringBuffer("Rohit Kumar");
        //constructor 3
        StringBuffer sb3 = new StringBuffer(30);


        //methods

        buffer.append("i am Rohit");
        buffer.append(" we are nice");
//        buffer.insert(2,"Rahul");
        buffer.replace(0,5,"I will be ");
//        buffer.delete(10,12);
        buffer.reverse();


        String  str = buffer.toString();
        System.out.println(str);
        String name = Buffer.generate(5);
        System.out.println(name  );

        //remove whiteSpaces
        String newSentence = "jsdjdsv  jjdsv  dfjdf  ";
        System.out.println(newSentence);
        System.out.println(newSentence.replaceAll(" ", ""));
        String names = "Kunal Rohit Apporv";
        String[] arr = names.split(" ");
        System.out.println(Arrays.toString(arr));

        //rounding off
        DecimalFormat df  = new DecimalFormat("0.0000");
        System.out.println(df.format(7.2));
    }
}
