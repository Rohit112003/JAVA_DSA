package StringBuffer;

import java.util.Random;

public class Buffer {
    static  String generate(int size){
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomCharacter = 97+ (int)(random.nextFloat()*26);
            sb.append((char)(randomCharacter));
        }
        return sb.toString();
    }
}
