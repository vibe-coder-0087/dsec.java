public class array4 {
    public static void main(String args[])
    {
        int arr[]={45,78,12,67,55};
        int lar=arr[0];
        int secLar=arr[0];
        int small=arr[0];
        int secSmall=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
    
                lar=arr[i];
            } if (arr[i]>secLar && arr[i]<lar)
            {
                secLar=arr[i];
            }
        }
        System.out.println("Largest element in the array: " + lar);
        System.out.println("Second largest element in the array: " + secLar);
        for(int i=0;i<arr.length;i++)
        {   
            if(arr[i]<small)
            {
                small=arr[i];
            }
            if (arr[i]<secSmall && arr[i]>small)
            {
                secSmall=arr[i];
            }
        }
        System.out.println("Smallest element in the array: " + small);
        System.out.println("Second smallest element in the array: " + secSmall);
    }    
}
