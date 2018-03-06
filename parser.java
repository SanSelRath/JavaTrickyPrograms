public class parser {
    public static void main(String arg[])
    {
        char operandA='a',operandB ='b',character;
        char plus='+',asterik='*';
        char openPar ='(', closePar = ')';
        boolean need_close=false,need_operator=false,need_operand=false;
        String expression = "((a+b)";
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)==openPar)
                need_close=true;
            if(expression.charAt(i)==closePar && need_close)
                need_close= false;
            if(expression.charAt(i)==closePar)
                need_close= true;
            if(expression.charAt(i)==operandA)
                need_operator = true;
            if((expression.charAt(i)==plus||expression.charAt(i)==asterik) &&
                    (expression.charAt(i-1)==operandA ||expression.charAt(i-1)==operandB))
            { need_operator = false; need_operand=true;}
            if(expression.charAt(i)== operandB && need_operand)
                need_operand=false;

        }
        if(need_close||need_operator||need_operand)
        {
            System.out.println(need_close);
            System.out.println(need_operator);
            System.out.println(need_operand);
            System.out.println("The expression is INVALID");
        }
        else
            System.out.println("The expression is VALID ...");
    }
}
