package com.quintrix.jfs;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
