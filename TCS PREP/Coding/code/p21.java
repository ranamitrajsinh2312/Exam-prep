import java.util.Scanner;
// N = 10 K= 15
// arr : 5 3 7 14 18 1 18 4 8 3
//op : 
public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum =0,max=0,count=0;

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (sum + arr[i] <= k) {
                sum += arr[i];
                count++;
            } else {
                    if (sum > max) {
                        max = sum;
                    }
                    sum = 0;
                   i = i - count;
                   count = 0;

            }

        }
        if (sum > max) {
            max = sum;
        }
        System.out.println(max);
        
    }
}
