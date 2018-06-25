package chapter10;
import java.util.Scanner;

public class showFactor {
    public static void main(String[] args)
    {
        Scanner sc=new  Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int tmp=1;
        boolean isfirst=true;
        while(tmp<=num)
        {
            int i=2;
            while(tmp*i<=num&&num%(tmp*i)!=0)
            {
                i++;
            }
            tmp=tmp*i;
            if(tmp<=num)
            {
                if(!isfirst)
                {
                    System.out.print(" ");
                }
                else {
                    isfirst=false;
                }
                System.out.print(i);
            }
        }
    }
}
