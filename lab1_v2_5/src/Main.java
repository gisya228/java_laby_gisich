import java.util.Scanner;
import java.util.Arrays;
public class Main {
        public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("введите размер массива");
        int l=in.nextInt();
        int[]arr=new int [l];
        System.out.println ("введите масив");
        for (int i=0;i<arr.length; i++)
        arr[i]=in.nextInt();
        for (int i=0; i<arr.length;i++)
        System.out.print (arr[i]+"");
        System.out.println();
            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                        isSorted = false;

                        buf = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
}