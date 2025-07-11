package ust.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {
    //pond object can be serialized
    private transient Duck duck = new Duck();
    //class pond has one instance variable duck

    public static void main(String args[]){
        //1) create object of pond

        Pond pond = new Pond();
        try {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(pond);
            //when we serialzable pond object. it's duck instance variable automatically get serialized
            os.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
