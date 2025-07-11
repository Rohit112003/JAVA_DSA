package ust.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {
    private int height ;
    private int width;

    //default constructor

    public Box() {

    }

    public Box(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setHeight(15);
        box.setWidth(15);


        try {
            FileOutputStream fs = new FileOutputStream("box.ser");//connection stream
            ObjectOutputStream os = new ObjectOutputStream(fs);//chain
            //it would provide the api to write the objects to file
            os.writeObject(box);
            os.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
