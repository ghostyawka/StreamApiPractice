import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> task1 = Arrays.asList("lol","okay","bye","hi","hello","no");

        task1 = task1.stream().filter(item->item.length()<3)
                              .map(words->words.toUpperCase()).collect(Collectors.toList());
        System.out.println(task1);
        System.out.println("_______________________________");

        List <Integer> task2 = Arrays.asList(1,412,23,56,75,23,55,36,8,44);
        task2 = task2.stream().filter(numbers->numbers < 45 && numbers > 34)
                .map(numbers->(int) Math.round(numbers*0.6))
                .map(numbers->numbers+3).collect(Collectors.toList());
        System.out.println(task2);
        System.out.println("_______________________________");

        List <Double> task3 = Arrays.asList(20.11,10.15,13.29,13.44,4.99);
        List <String> task3toString = new ArrayList<>();
        task3toString = task3.stream().map(num->num*0.7)
                .map(num->(double)Math.round(num*100)/100)
                .filter(num->num < 23)
                .map(num->num.toString()).collect(Collectors.toList());
        System.out.println(task3toString);
    }
}