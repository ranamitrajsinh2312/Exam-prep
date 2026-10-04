public class movezero {
    public static void main(String[] args) {
        int [] arr ={4,5,0,1,9,0,8,0,0,0,0,8,3,6,8,0,0,0,0};
        int j =0;
        for(int i = 0 ; i<arr.length;i++){
            if ( arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
