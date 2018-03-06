import java.util.Scanner;
class stringmine
{

    String reverse(String str)
    {
        String rev = "";
        for (int i = str.length(); i > 0; i--) {
            rev = rev + str.charAt(i-1);
        }
        return  rev;
    }
};
public class reverse_words {
  public static void main(String arg[]) {
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      stringmine obj = new stringmine();
      String rev = "",temp="";
      for (int i = str.length(); i > 0; i--) {

          if(str.charAt(i-1) == ' ')
          {
              rev = rev + ' ' +obj.reverse(temp) ;
              temp ="";
          }
          else if(i==1)
          {
              temp = temp + str.charAt(i-1);
              rev = rev + ' ' +obj.reverse(temp);
          }
          else
          temp = temp + str.charAt(i-1);
      }

      System.out.println("the reverse string is "+rev);
  }

}
