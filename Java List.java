package VScode;
import java.util.*;
public class Javalist 
{
    public static ArrayList<Integer> Insert(ArrayList<Integer> A,Scanner sc)
    {
        int ind,n;
        ind=sc.nextInt();
        n=sc.nextInt();
        A.add(ind,n);
        return A;
    }
    public static ArrayList<Integer> Remove(ArrayList<Integer> A,Scanner sc)
    {
        int ind;
        ind=sc.nextInt();
        A.remove(ind);
        return A;
    }
    public static void Display(ArrayList<Integer> A)
    {
        for(int i=0;i<A.size();i++)
        {
            System.out.print(A.get(i)+" ");
        }
    }
    /*
    5
    12 0 1 78 12
    2
    Insert
    5 23
    Delete
    0 */
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        /*String inp;
        inp=sc.nextLine();
        if(inp.isBlank())
            inp=sc.nextLine();
        String[] inp_list=inp.split(" ");
        for(int i=0;i<inp_list.length;i++)
        {
            num.add(Integer.parseInt(inp_list[i]));
        }*/
        int Num;
        for(int i=0;i<n;i++)
        {
            Num=sc.nextInt();
            num.add(Num);
        }
        //System.out.println(num);
        int k;
        k=sc.nextInt();
        String op;
        for(int i=0;i<k;i++)
        {
            op=sc.nextLine();
            if(op.isBlank())
            {
                op=sc.nextLine();
            }
            if(op.equals("Insert"))
            {
                num=Insert(num,sc);
            }
            else if(op.equals("Delete"))
            {
                num=Remove(num,sc);
            }
            //System.out.println(num);
        }
        //System.out.println("Final: "+num);
        Display(num);
    }
    
}
