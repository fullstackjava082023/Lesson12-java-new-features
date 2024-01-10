import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello world!");
        var number = 10L;//long
        var fractionalNumber = 2.5f;//float*/

//        Cat kiss = new Cat();
//        kiss.print();
        /*printThing(new Printable() {
            @Override
            public void print() {
                System.out.println("meow");
            }
        });*/
      /*  Printable myPrintable = (pref, suf) -> pref + "meow" + suf;//we return result of expression

//        Printable otherPrintable = () -> System.out.println("woof woof");
        printThing(myPrintable);
//        printThing(otherPrintable);*/

        ArrayList<Double> numbers = new ArrayList();
        numbers.add(1d);
        numbers.add(3d);
        numbers.add(7d);
        numbers.add(5d);
       /* for (Integer num : numbers) {
            System.out.println(num);
        }*/
//        numbers.forEach(Main::printNum);//function
//        numbers.forEach(System.out::println);
        /*numbers.forEach(num -> {
            System.out.println(num + 5);
            num++;
        });*/

//        numbers.replaceAll(n -> n+5);
//        numbers.replaceAll(Math::sqrt);
//
//        numbers.forEach(System.out::println);

       /* Employee employee = new Employee(25, "Arja");
        System.out.println(employee.age());
        System.out.println(employee.name());
        System.out.println(employee.toString());
        Employee employee1 = new Employee(25, "John");
        System.out.println(employee.equals(employee1));*/


      /*  String arja = "123";
        char stamChar = 'a';

        Integer arjaInt = Integer.valueOf();
        System.out.println(arjaInt);*/


        List<Integer> number = Arrays.asList(1,2,3,4);
        number.stream().limit(6).peek(System.out::println);


    }













    public static Integer addFive(Integer n) {
        return n+5;
    }


    public static void printNum(Integer number) {
        System.out.println(number);
    }










    public static void printThing(Printable thing) {
        String result = thing.print("Hi " , "!");
        System.out.println(result);
    }



}