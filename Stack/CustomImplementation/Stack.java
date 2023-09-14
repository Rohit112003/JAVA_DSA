package Stack.CustomImplementation;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public Stack(){
        //so which is the constructor which take the argument ,
        // so its point to second stack constructor
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data = new int[size];

    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }
//throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions.
// The caller to these methods has to handle the exception using a try-catch block.
    public int pop() throws StackException{
        if(isEmpty()){
            //The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
            // We can throw either checked or unchecked exception
            throw new StackException("cannot pop from an empty Stack");
        }
        int remove = data[ptr];
        ptr--;
        return remove;
    }


    public int peek() throws StackException{
        if(isEmpty()){

            throw new StackException("cannot peek from an empty Stack");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr ==data.length-1; //ptr is at last index
    }
    private boolean isEmpty(){
        return ptr==-1;
    }

}
