public class toglebinary {
    public static void main(String[] args) {

        int n = 16;

        int bits = (int)(Math.log(n) / Math.log(2)) + 1;

        int mask = (1 << bits) - 1;

        int ans = n ^ mask;

        System.out.println(ans);
    }
}