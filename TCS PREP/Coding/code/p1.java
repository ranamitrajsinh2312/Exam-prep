import java.util.*;

public class p1{
    public static void main(String [] args){
       
        ArrayList <Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int next =0;
        int k =4;
        int left=0,count=0;
       

        for (int i = 1 ; i<=n;i++){
            // System.out.print(arr[i]+"  ");
           l1.add(i);
        }
        while (l1.size()!=1){
         for (int i = 0 ; i< l1.size();i++){
            
                count ++;
             System.out.println(" loop count "+count);

                if (count ==k){
                  int deleted = l1.remove(i);
             System.out.print(" Deleted Element count "+deleted);

                    count =1;
             System.out.println(" delete count "+count);
              if (i == l1.size()){
                    i =0;
                       System.out.println(" reverse count "+count);

                }
                continue;
                }
                else{
                    continue;
                }
        }}
         System.out.print(l1+"  ");
    }
}