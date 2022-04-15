package com.quintrix.jfs;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//TestFP testFP = (a, b) -> a+b;
    	
    	//TestFP testFP = {a,b} -> a+b;
    	TestFP testFP = (a,b) -> 1;
    	
    	//Predicate<type of list> p = (d) -> d;
    	
    	Predicate<Integer> p = d -> d > 10;
    	
    	Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
    	
    	stream.forEach(q -> System.out.println(q));
    	
    	Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4});
    	stream2.forEach(r-> System.out.println(r));
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int i = 1; i<10; i++) {
    		list.add(i);
    	}
    	
    	List<String> memberNames = new ArrayList<>();
    	memberNames.add("Amitabh");
    	memberNames.add("Shekhar");
    	memberNames.add("Aman");
    	memberNames.add("Rahul");
    	memberNames.add("Shahrukh");
    	memberNames.add("Salman");
    	memberNames.add("Yana");
    	memberNames.add("Lokesh");
    	
    	memberNames.stream().filter((s) -> s.startsWith("L")).forEach(System.out::println);
    	
    	memberNames.stream().filter((s) -> s.startsWith("R")).map(String::toUpperCase)
    	.forEach(System.out::println);
    	
    	memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
    	
    	memberNames.forEach(System.out::println);
    	
    	List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
    			.collect(Collectors.toList());
    	
    	System.out.print(memNamesInUppercase);
    	
    	long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
    	
    	System.out.println(totalMatched);
    	
    	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/DD);
    	//ZoneId is time zones!
    	
    	LocalDate localDate = LocalDate.now();
    	
    	LocalDateTime localDateTime = LocalDateTime.now();
    	
    	System.out.println(localDate);
    	
    	System.out.println(localDateTime);
    	
    	
    	
        System.out.println( "Hello World!" );
        Toolkit.getDefaultToolkit().beep();
        Integer carsCounter1 = 10;
        Integer carsCounter2 = 10;
        Date curDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh :mm");
        
        System.out.println("curDate is: " + curDate.getHours());
        if(carsCounter1 == carsCounter2)
        {
        	System.out.println("They are equal");
        	
        }
        else {
        	System.out.println("They are not equal");
        }
        
    }
}
