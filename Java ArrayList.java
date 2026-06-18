package VScode;
import java.util.*;
public class JavaArrayList 
{
    public static void main(String[] args) 
    {
        int n,num;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<ArrayList<Integer>> Num= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> sub=new ArrayList<>();
            int k;
            k=sc.nextInt();
            for(int j=0;j<k;j++)
            {
                num=sc.nextInt();
                sub.add(num);
            }
            Num.add(sub);
        }
        System.out.println(Num);
        n=sc.nextInt();
        //System.out.println(Num.get(n));
        int Mat,ind;
        for(int i=0;i<n;i++)
        {
            Mat=sc.nextInt();
            ind=sc.nextInt();
            //System.out.println("Size:"+Num.size());
            if(Num.size()!=0 && Num.size()>Mat)
            {
                if((Num.get(Mat-1)).size()!=0 && (Num.get(Mat-1)).size()>=ind)
                {
                    System.out.println((Num.get(Mat-1)).get(ind-1));
                }
                else
                    System.out.println("ERROR!");
            }
            else
                System.out.println("ERROR!");

        }
    }
    
}
