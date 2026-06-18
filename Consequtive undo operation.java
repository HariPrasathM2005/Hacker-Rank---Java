package VScode;
import java.util.*;
public class Consequtiveundooperations 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String inp;
        inp=sc.nextLine();
        List<Character> Stack=new ArrayList<>();
        int ind=0;
        while(ind<inp.length())
        {
            if(inp.charAt(ind)!='#')
            {
                Stack.add(inp.charAt(ind));
            
            }
            else
            {
                Stack.remove(Stack.size()-1);
            }
            ind=ind+1;
        }    
        //Stack.remove(inp.length()-1);
        //System.out.println(Stack);
        for(int i=0;i<Stack.size();i++)
        {
            System.out.print(Stack.get(i));
        }

    }    
}
