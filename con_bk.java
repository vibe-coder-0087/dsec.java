public class con_bk {
    public static void main(String[] args){
        int sum=0;
        int k=3;
        boolean check=true;
        for(int i=sum;i<sum*k;i++){
            if(check){
                check=i%2==0;
            }else{
                sum+=5;
                check=!check;
        
            }
            k--;
            
        }
        System.out.println(sum);
    }
}
    

