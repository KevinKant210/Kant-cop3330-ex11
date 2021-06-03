package E_11;

import  java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("###.##");
        System.out.print( "How many Euros are you exchanging? " );
        float euros = reader.nextFloat();
        System.out.print("What is the conversion rate? ");
        float conversion = reader.nextFloat();

        float total = Float.parseFloat(formatter.format(euros*conversion));

        System.out.println(euros + " Euros at a rate of " + conversion + " is " + total + " U.S. Dollars");

    }
}
