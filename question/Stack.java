public class Stack {
    int[] array;
    int maxSize;
    int top;

    public Stack(int MaxSize){
        this.maxSize = MaxSize;
        array = new int[maxSize];
        top =-1;
    }
    public boolean isEmpty(){
        return top==-1;

    }
    public void push(int number){
        if(top==array.length){
            System.out.println("stack is full");
        }else{
            array[++top] = number;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        int poppedElement = array[top--];
        return poppedElement;
    }
}
