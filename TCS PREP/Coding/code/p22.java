public class p22 {
//     Product of the digits 5,2,4,4 
// 5*2*4*4= 160 
// Hence, output is 160. 
public static void main(String[] args) {
    int num = 5244;
    int product = 1;
    while (num > 0) {
        int digit = num % 10;
        product *= digit;
        num /= 10;
    }
    System.out.println(product);
}
}
