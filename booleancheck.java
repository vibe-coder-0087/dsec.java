public class booleancheck {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        int c=5;
        if(c<<2 > 15)
        {
            if(b){
                a=!a;
                if(a){
                    b=!b;
                    if(b){
                        c+=5;

                    }else{
                        c+=10;
                    }
                }
            }
        }

System.out.println(c);
}}