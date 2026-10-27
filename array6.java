public class array6 {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,11,13};
        boolean check=true;
        for (int i =0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
            } else {
                check=false;
                break;
            }
        }
        System.out.println(check);
    }
}
