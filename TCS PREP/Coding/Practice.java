public class Practice {
    public static void main(String[] args) {
   int [] arr = {4,2,1,7,8,1,2};
   int n = arr.length;
   int max = arr[0];
   int min = Integer.MAX_VALUE;
   int k =3;
   // now i have to find the maximum in the subarray of size k
   for (int i = 0; i <  n - k + 1; i++){
    int sum =0;
    for (int j = i ; j <i+k;j++){
        
        // System.out.print("ARR:"+arr[j]+"...");
        if (sum >10){
           
            System.out.println("SUM:"+sum);
        }
        sum = sum + arr[j];
    }
     for (int j = i ; j <i+k;j++){
        
        // System.out.print("ARR:"+arr[j]+"...");
        if (sum >10){
           System.out.print("ARR:"+arr[j]+"...");
            
        }
        // if(sum>10){
        //     System.out.println("SUM:"+sum);
        // }
       
    }
    
    //System.out.println("SUM:"+sum);

   
    // continue;
   }
   //System.out.println(min);
    }
}
