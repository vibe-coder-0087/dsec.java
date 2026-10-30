public class method2 {
    
    public static void main(String[] args) {
        
    int x=0;
    for(int i=x+1;i>x;i++){
        if(i%2==0){
            i++;
        } else {
            x+=2;
        }
        if(i==10){
            continue;
        }
        System.out.println(x);
    }
}
}
