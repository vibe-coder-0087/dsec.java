public class array5 {
    public static void main(String[] args) {
        int arr[]={7,4,9,1,8};
        int odd=0;
        int even=0;
        for(int i:arr){
            if(i%2==0){
                even+=i;

            }else{
                odd+=i;
            }
        } 
        System.out.println(even + "");
        System.out.println(odd + "");
    }
}
