import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class three_four {
    public static void main(String arg[])
    {
       int n;
       Scanner scan = new Scanner(System.in);
       n = scan.nextInt();
       int lastval = 3,count=0;

        System.out.println(lastval);
       for(int i=1;n>count;i++)
       {
           if(i%2==1)
           {
             lastval = lastval +1;
             if(check(lastval))
             {
                 System.out.println(lastval); count++;}
           }
           else {
               lastval = lastval +9;
               if(check(lastval)){
                   System.out.println(lastval); count++;}
           }

       }
    }
    public static boolean check(int num)
    {
        boolean a=true;
        while(num>0)
        {
            if(num%10!=3 && num%10!=4)
            a = false;
            num = num / 10;
        }
         return  a;
    }
}
