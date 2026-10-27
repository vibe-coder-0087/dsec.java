public class test3 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,20};
        int tar=20;
        int fcount=0;
        int scount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                fcount=1;

            }
            if(arr[i]==tar){
                scount+=1;
            }
        }
         System.out.println("The first occurrence of "+tar+" is at count: "+fcount);
                 System.out.println("The second occurrence of "+tar+" is at count: "+scount);

        }
}
