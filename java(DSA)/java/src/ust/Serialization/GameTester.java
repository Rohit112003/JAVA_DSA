package ust.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameTester {
    public static void main(String[] args) {
        GameCharacter game1  =  new GameCharacter(50,"ELF", new String[]{"bow","tusk", "katana"});
        GameCharacter game2  =  new GameCharacter(20,"Troll", new String[]{"Stone","sand", "Rope"});

        try {
            FileOutputStream fs = new FileOutputStream("Game.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(game1);
            os.writeObject(game2);
            os.close();
        }catch (Exception e){
            System.out.println(e);
        }
        game1 =null;
        game2 =null;
        //we set them to null so we can't access them from heap
        try{
            FileInputStream fi= new FileInputStream("Game.ser");
            ObjectInputStream os = new ObjectInputStream(fi);
            GameCharacter oneRestore = (GameCharacter) os.readObject();
//            ✅ What's Happening Step-by-Step:
//            1. os.readObject()
//            This reads the first serialized object (in your case, game1) from the file "Game.ser".
//
//                    It returns it as a generic Object.
//
//                2. (GameCharacter)
//                        Since readObject() returns Object, you must cast it to its original type (GameCharacter) so you can access its fields and methods.
//
//                3. Assignment to oneRestore
//                Now you store the deserialized object in the oneRestore variable.
//
//                This is a new object in the heap, identical in content to the original game1.
            GameCharacter TwoStore = (GameCharacter) os.readObject();
            System.out.println(oneRestore.getType());


        }catch (Exception e){
            System.out.println(e);
        }


    }
}
