import java.util.Arrays;

public class arrange_number {
    // First number is maximum and second number is minimum
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        int temp;
        for (int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(i%2==0) {
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
                else
                {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[1];
                    arr[1] = temp;
                }

                }
            }
        }

       System.out.println("Hence the array value is "+ Arrays.toString(arr));
    }
}
