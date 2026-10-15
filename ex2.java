public class ex2 {
    public static void main(String[] args) {
        int x=10;
        int k=3;
        int y=7;
        while(x<k){
            while(y>k){
            if(y%2==0){
                k+=3;
            }
            }
    }
    if(k%2==0){
        System.out.println(x+y+k);

    }else{
        System.out.println(x+y);

    }
}
}