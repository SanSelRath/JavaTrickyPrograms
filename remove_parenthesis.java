public class remove_parenthesis {
    public static void main(String arg[]) {
        char openPar = '(', closePar = ')';
//        boolean unwanted_open = false, double_close=false;
        int balanced_parenthesis = 0;
        String exp = "((abc)((de))", new_exp="";
//        for (int i=0;i<exp.length();i++)
//        {
//            if(exp.charAt(i)==openPar && need_close)
//                double_close = true;
//            else {
//                if(exp.charAt(i)==closePar&& double_close)
//                    double_close = false;
//                else {
//                    new_exp = new_exp + exp.charAt(i);
//                    if (exp.charAt(i) == openPar)
//                        need_close = true;
//                }
//            }
//
//        }
        for (int i=0;i<exp.length();i++) {
        if(exp.charAt(i)==openPar)
            balanced_parenthesis = balanced_parenthesis +1;
        if(exp.charAt(i)==closePar)
            balanced_parenthesis = balanced_parenthesis -1;
        }
        if(balanced_parenthesis>0)
        {
              new_exp = delete_open_parenthesis(exp,balanced_parenthesis);
        }

        System.out.println("The new expression is ");
        System.out.print(new_exp);

    }
    public static String delete_open_parenthesis(String new_str,int count)
    {
        String new_exp="";
        System.out.println(new_str);
        for(int i=new_str.length();i>0;i--)
        {
            if(new_str.charAt(i-1)=='(' && count >= 1)
                count--;
            else
            new_exp = new_exp + new_str.charAt(i-1);
        }
        return reverse(new_exp);
    }
    public static String reverse(String str)
    {
        String rev = "";
        for (int i = str.length(); i > 0; i--) {
            rev = rev + str.charAt(i-1);
        }
        return  rev;
    }
}
