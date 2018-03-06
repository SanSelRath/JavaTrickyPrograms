import java.util.Scanner;
import java.lang.*;
public class reverse_number {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int temp;
        double reverse=0;
        while(number>0)
        {
            temp = number%10;
            reverse = reverse*10 + temp;
            number = number/10;
            System.out.println(reverse);
        }
        System.out.println(reverse);
    }

}
