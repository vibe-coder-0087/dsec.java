public class test6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int even[]=new int[arr.length];
        int odd[]=new int[arr.length];
        int j=0;
        int k=0;
        for(int i:arr){
            if(i%2==0){
                even[j]=i;
                j++;
            } else {
                odd[k]=i;
                k++;
            }
        }
        System.out.print("Even numbers: ");
        for(int i=0;i<j;i++){
            System.out.print(even[i]+" ");
        }
        System.out.print("\nOdd numbers: ");
        for(int i=0;i<k;i++){
            System.out.print(odd[i]+" ");
        }
    }
}
