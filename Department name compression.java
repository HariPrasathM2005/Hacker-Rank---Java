package VScode;
import java.util.*;
public class Departmentnamecompression 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String inp;
        inp=sc.nextLine();
        String Res="";
        int c=1,ind=0;
        while(ind<inp.length()-1)
        {
            if(inp.charAt(ind)==inp.charAt(ind+1))
            {
                c=c+1;
                ind=ind+1;
            }
            else
            {
                Res=Res+inp.charAt(ind)+String.valueOf(c);
                c=1;
                ind=ind+1;
            }
        }
        Res=Res+inp.charAt(ind)+String.valueOf(c);
        System.out.println(Res);
        
    }
    
}
