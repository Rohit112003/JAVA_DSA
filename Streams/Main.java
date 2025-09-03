package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //lambda expression is anonymous function(no name, no return type no access modifier
        Thread t1 = new Thread(()->
                System.out.println("runnable"));
        t1.start();
        //ek function ko huml treate kar rahe hau ek variable se jisko hum kehte hai functional programming
        MathOperation sumOperation = (int a ,int b)-> a+b;
        int ans = sumOperation.operate(10,20);

        //predicate->Functional interface(Boolean value function)
        Predicate<Integer> isEven = x-> x%2==0;
        System.out.println(isEven.test(4));
        Predicate<String> isWordStartingWithA = x->x.startsWith("A");
        System.out.println(isWordStartingWithA.test("Ankit"));
        Predicate<String> isWordStartWithT = x->x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordStartWithT);
        System.out.println(and.test("viput"));


        //Function-> Fun ction interface(apply)  work for you
        //Function<Input,Return>
        Function<Integer,Integer> doubleIt = x-> x*2;
        Function<Integer,Integer> tripleIt = x-> x*3;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));//same
        System.out.println(doubleIt.compose(tripleIt).apply(20));//same
        System.out.println(doubleIt.apply(100));
        //jo doge wo return ho jayega
        Function<Integer,Integer> identity= Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);


        //Consumer
        //only consume not return
        Consumer<Integer> print = x->System.out.println(x);
        print.accept(51);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x->{
            for (int i : x){
                System.out.println(i);
            }

        };
        printList.accept(list);


        //Supplier don't take argument but return something
        //Supplier<String>
        Supplier<String> giveHelloWorld = ()->"hello world";
        System.out.println(giveHelloWorld.get());

        //combineExample
        Predicate<Integer> predicate = x->x%2==0;
        Function<Integer,Integer> function = x->x*x;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier = ()->100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
        //BiPredicate,BiConsumer,BiFunction
        //we can take 2 arguments later we take one argument

        BiPredicate<Integer,Integer> isSumEven = (x,y)-> (x+y)%2==0;
        System.out.println(isSumEven.test(5,13));

        //BiFunction<Input,Input,return>
        BiFunction<String,String,Integer> biFunction = (x,y)-> (x+y).length();
        System.out.println(biFunction.apply("zzz","cccc"));


        //Method Reference --use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Alice","Bob","Charlie");
        students.forEach(x->System.out.println(x));
        students.forEach(System.out::println);
        List<String> names = Arrays.asList("A","B","C");
       List<MobilePhone> mobilePhones =  names.stream().map(MobilePhone::new).collect(Collectors.toList());
    }

}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

class SumOperation implements MathOperation{
    @Override
    public int operate(int a, int b){
        return a+b;
    }
}


@FunctionalInterface
interface MathOperation{
    public int operate(int a, int b);
}
