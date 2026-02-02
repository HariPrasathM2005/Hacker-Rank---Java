import java.io.*;
import java.util.*;

public class Solution 
{
    public static String comma(double num)
    {
        String cost="";
        double num2=num;
        String amt=String.valueOf((int)num2);
        int c=1;
        for(int i=amt.length()-1;i>=0;i--)
        {
            if(c==4)
            {
                cost="\u00A0"+cost;
                c=1;
            }
            cost=amt.charAt(i)+cost;
            c++;
        }
        double COST=num-(int)num2;
        String COST_String=String.valueOf(COST);
        cost=cost+",";
        String amt2=String.format("%,.2f",num);
        String dec="";
        for(int i=amt2.length()-1;i>amt2.length()-3;i--)
        {
            dec=amt2.charAt(i)+dec;

        }
        cost=cost+dec;
        return cost;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double payment;
        String amt;
        payment=sc.nextDouble();
        double payment2;
        
        payment=Math.round(payment*100.0)/100.0;

        String amt2;
        amt2=comma(payment);
        amt= String.format("%,.2f", payment);
        String china="\uFFE5";
        String euro="\u20AC";
        System.out.print("US: $"+amt);
        System.out.print("\nIndia: Rs."+amt);
        System.out.print("\nChina: "+china+amt);
        System.out.print("\nFrance: "+amt2+" ");
        System.out.print(euro);
    }
}
