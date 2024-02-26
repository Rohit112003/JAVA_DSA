package Stack.CustomImplementation;

public class Stackmain {
    public static void main(String[] args) throws StackException {
        Stack stack = new Stack(5);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());






    }
}
