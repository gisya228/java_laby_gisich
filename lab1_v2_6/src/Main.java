

import java.util.Scanner;
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
                        for (int i=0;i<arr.length; i++){
                                var number = arr[i];
                                var numbersCount = String.valueOf(number).length();
                               if (arr[i] /100 != arr[i]/10 % 10 && arr[i] / 100 != arr[i]%10 && arr[i]/10%10 != arr[i]%10)
                                       if (numbersCount == 3)
                                       System.out.println(arr[i]);}

                }
        }