public class array7 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int swap;
        for(int i=0;i<arr.length/2;i++){
            swap=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=swap;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    
    }
}
