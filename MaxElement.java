import java.util.*;
class array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter an elements in array");
        for(int i=0; i < arr.length; i++){
            arr[i]= sc.nextInt();
            //oSystem.out.println(sc.next());
         }
         System.out.println("Display Array elements:");
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
         }
         int max=arr[0];
         for(int i=0;i<arr.length;i++){
            while(max<arr[i]){
                max=arr[i];
             }
        }
        System.out.println("maximum num is"+max);
       // System.out.println("array elements are"+'1' +'2' +'3);
        
    }
}