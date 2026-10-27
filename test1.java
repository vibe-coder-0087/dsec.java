public class test1 {
    public static void main(String[] args){
        int arr[]={10,20,10,40,20,20,10};
        int tar=10;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]== tar){
                count++;
            }
        }
        System.out.println("The number of occurrences of "+tar+" is: "+count);
    }
}
