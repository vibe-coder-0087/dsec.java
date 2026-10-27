public class arr_to_boolean {
    public static void main(String[] args){
        int arr[]={9,15,1,6,3,7,2,4,5,6};
        int n = 1;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
        while (true) {
            boolean found = false;
            for (int x : arr) {
                if (x == n) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(n);
                break;
            }
            n++;
             System.out.print(" ," +found);
        }
        n++;
        
    }}
    
}
}
