import java.util.Scanner;

public class repeat_alphabet {
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String new_str ="",temp;
        int num,num2,pointer=1;
        for (int i=0;i<str.length();i++)
        {
            pointer =1;
            num = str.charAt(i) - 48;
            if(num>0 && num <=9)
            {
                num2 = str.charAt(i-pointer) - 48;
                if(num2>0 && num2<=9)
                {
                    num = num*10 + num2;
                    pointer++;
                }
               temp = repeat(str.charAt(i-pointer),num);
               new_str = new_str + temp;
            }
            else
            new_str = new_str + str.charAt(i);
        }
        System.out.println("The new string is  is "+new_str);
    }
    public static String repeat(char a,int num)
    {
        String temp="";
        for(int i=1;i<num;i++)
        {
            temp = temp + a;
        }
        return  temp;
    }
}
