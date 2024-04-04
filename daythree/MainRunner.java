package weekfour.daythree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainRunner {
    public static void main(String[] args) {



//        Filter even = new Filter() {
//            @Override
//            public boolean apply(int number) {
//                return number % 2 == 0;
//            }
//        };
//        System.out.println(even.apply(4));
//        System.out.println(even.apply(5));

     /*   Filter oddFilter = number -> number % 2 == 1;
        System.out.println(oddFilter.apply(4));
*/

//
//
//
//        Transform upper = new Transform() {
//            @Override
//            public String modify(String input) {
//                return input.toUpperCase();
//            }
//        };
//
//        System.out.println(upper.modify("hello world"));
//
//        Transform lower = input -> input.toLowerCase();
//
//        System.out.println(lower.modify("HEELO"));



//        multipleParameterDemo sObj1 = (st1, st2 ,st3) ->{
//            System.out.println("Hello");
//            System.out.println(st1+st2+st3);};
//        sObj1.concatString("hello | ", "Per Scholas ", "Students");
//


//        multipleDemo addObj1 = (a, b, c) -> a+b+c;
//
//
//        double resultObj1 = addObj1.Calculator(10,20,30);
//        System.out.println(resultObj1);



//        List<String> names = new ArrayList<String>();
//        names.add("Larry");
//        names.add ("Steve") ;
//        names.add ("James") ;
//        names.add ( "Conan") ;
//        names.add ( "Ellen") ;

//
//        for(String n: names){
//            System.out.println(n);
//        }
//
//        names.forEach (name -> {
//            System.out.println (name);
//        }
//        );

//
//        Consumer<String> display = (x) -> {
//            System.out.println(x);
//        };
//        display.accept("");
//


//        Predicate<Integer> lesserthan = i -> (i < 18);
//
//
//        System.out.println(lesserthan.test(100));

//
//        Function<Integer, Integer> f1 = i -> i*4;
//        System.out.println(f1.apply(3)); //output 12
//
//
//
//        Function<Integer, Integer> f2 = i -> i+4;
//        System.out.println(f2.apply(3)); // output 7
//
//
//
//
//        Function<String, Integer> f3 = s -> s.length();
//        System.out.println(f3.apply("Peter Jackson")); // output 5



        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        for(Integer n: numbers){
            System.out.println(n);
        }

        List<Integer> even = numbers.stream().filter(n -> n > 16 ).collect(Collectors.toList());

        System.out.println(even);
//        int sum = numbers.stream().reduce(100,Integer::sum);
//        System.out.println(sum);


        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Heyya");

        List<String> upper = words.stream().map(String::toLowerCase).collect(Collectors.toList());


//        System.out.println(upper);
//
//        NormalClass mObj = new NormalClass();
//        mObj.hObjone.say();
//        mObj.hObjTwo.say();
//
//        mObj.hObjone.sleep();
//        mObj.hObjTwo.sleep();
//        Human.communication();

//
//        MycomparingClass compareObj = new MycomparingClass();
//        int resultInteger = compareObj.compareTwoVar.compare(55,50);
//        System.out.println(resultInteger);
//        String resultString = compareObj.stCompare.compare("H", "H");
//        System.out.println(resultString);
    }
}
