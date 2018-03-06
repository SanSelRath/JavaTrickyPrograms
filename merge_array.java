import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class merge_array {
    public static void main(String arg[])
    {
        int a[]={2,4,5,6,7,9,10,13},i;
        int b[]={2,3,4,5,6,7,8,9,11,15};
        Set<Integer> newset = new HashSet();
        int c[] = new int[a.length+b.length];
        for (i=0;i<a.length;i++)
        {
           newset.add(a[i]);
            c[i]=a[i];
        }
        for (int j=0;j<b.length;j++)
        {
            newset.add(b[j]);
            c[i+j] = b[j];
        }
        System.out.println("The set is "+Arrays.toString(c));
        System.out.println(newset);
    }
}
