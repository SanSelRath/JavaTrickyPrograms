import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String args[])
    {
        System.out.println("System counter program  \n");
        Scanner scan = new Scanner(System.in);
        String paragraph = scan.nextLine();
        Map map = new HashMap();
        String word = "";
        int num ;
        char character;
        for(int i=0;i< paragraph.length();i++)
        {
         character = paragraph.charAt(i);
         if(character=='.')
            {}
         else if(character==' '||i==paragraph.length()-1)
         {

            if(null == map.get(word.toLowerCase()))
            num =0;
            else
                num = (Integer) map.get(word.toLowerCase());
                map.put(word.toLowerCase(), num + 1 );
            word="";
         }
         else
           word = word + character;
        }
        System.out.println("The words and the count is  "+map);
    }
}
