package Stack.CustomImplementation;

public class stackpractise {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int ptr = -1;
    public stackpractise(){
        this(DEFAULT_SIZE);

    }
    public stackpractise(int val){
        this.data = new int[val];
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("system is full");
            return false;

        }
        ptr++;
        data[ptr] = val;
        return true;

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        int remove  = data[ptr];
        ptr--;
        return remove;
    }
    public int peek() {
        if(isEmpty()){

            System.out.println("Stack is Empty");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }
}
