package io.pragra.learning;


import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpressionMain {
    public static void mathCheck(Integer number, Predicate<Integer> IEvenChecker)
    {
        if(IEvenChecker.test(number))
        {
            System.out.println("The number " + number +" is even number");
        }
        else
        {
            System.out.println("The number " + number +" is odd number");
        }
    }
    public static void nameCheck(String name, Predicate<String> INameChecker)
    {
        if(INameChecker.test(name))
        {
            System.out.println(name + ":Name Approved");
        }
        else
        {
            System.out.println(name + ":Name Invalid");
        }
    }

    public static String nameEnhancer(String name, Function<String,String> INameEnhancer)
    {
        return INameEnhancer.apply(name);
    }
    public static void main(String[] args) {
//        LambdaExample1 le = i->i%2==0;
//        System.out.println(le.evenCheck(10));
//        System.out.println(le.evenCheck(57));
        String[] names = {"Madhumitha", "Rashmi", "Madhuri", "Madhu", "Raj"};
        mathCheck(34, i->i%2==0);

        for(String n: names)
        {
            nameCheck(n, s->s.length()>=4);
        }

        for(String n: names)
        {
            System.out.println(nameEnhancer(n, s->s.concat(s)));
        }
    }
}
