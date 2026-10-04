// public class Largest {
//     public static void main(String args[]){
//          int [] arr = {1, 2,2,2, 3, 4, 5};
//         Largest l = new Largest();

//         l.largest(arr);
     
//         l.secondlargest(arr);
//         l.checkArrSorted(arr);
// l.removeDuplicatesFromSorted(arr);
//     }

   
//     void removeDuplicatesFromSorted(int []arr){
//        // int j=0;
//         // for (int i=0; i<arr.length-1; i++){
//         //     if (arr[i]!= arr[i+1]){
//         //         System.out.print("arr:"+arr[i]);
//         //         arr[j++]= arr[i];
//         //         System.out.print("j: "+j);
//         //     }
//         // }
//         // arr[j++] = arr[arr.length-1];
//         int [] temp = new int[arr.length];
//         int j=0;
//         for (int i=0; i<arr.length-1; i++){
//             if (arr[i]!= arr[i+1]){
//                 temp[j++] = arr[i];
               
//             }
//         }
//         temp[j] = arr[arr.length-1]; // Add the last element
//         for (int i=0; i<=j; i++){
//             System.out.print(temp[i]+" ");
//         }
//     }

//     void checkArrSorted(int [] arr){
//         boolean isSorted = true;
//         for (int i = 0; i < arr.length-1; i++){
//             if (arr[i] > arr[i+1]){
//                 isSorted = false;
//                 break;
//             }
//         }
//         System.out.println(isSorted);
//     }
//     void secondlargest(int [] arr){
//         int max= Integer.MIN_VALUE;
//         int sec = Integer.MIN_VALUE;

//         for (int i =0; i < arr.length; i++){
//             if (arr[i]> max){
//                 sec = max;
//                 max = arr[i];
//             }
//             if(arr[i]> sec && arr[i]!=max){
//                 sec = arr[i];
//             }
//         }
//         System.out.println(sec);
//     }
//     void largest(int [] arr){
      
//         int max = Integer.MIN_VALUE;
//         for(int i = 0;i<arr.length; i++){
//             if (max < arr[i]){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

import java.util.*;
public class Largest{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();
if(s.startsWith("[")&& s.endsWith("]")){
    s = s.substring(1, s.length()-1);
}
    String [] arr = s.split(",");
    ArrayList<Integer> List = new ArrayList<>();
    for (int i=0; i<arr.length; i++){
        List.add(Integer.parseInt(arr[i]));
    }
    for (int a : List){
        System.out.print(a+" ");
    }
}

    

}