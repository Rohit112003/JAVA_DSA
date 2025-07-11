package OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//          divide(a,b);
            String name  = "Kunal";
            if(name.equals("kunal")){
                throw new MyException("name is Kunal");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("normal Exceptions");
        }
        finally {
            System.out.println("this wll always be executed");
        }

    }

    static int divide(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("do not divide by zero");
        }
        return a/b;
    }
}
