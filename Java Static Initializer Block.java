import java.io.*;
import java.util.*;
class User extends Exception
{
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int l,b;
        l=sc.nextInt();
        b=sc.nextInt();
        try{
            if(l<=0 || b<=0)
                throw new User();
            System.out.print(l*b);
        }
        catch(User e){
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
