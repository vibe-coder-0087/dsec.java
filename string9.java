
public class string9 {
    
    public static void main(String[] args){
        String s="Abc1D3";
        int upper=0;
        int lower=0;
        int digit=0;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper++;
            }
            else if(Character.isLowerCase(c)){
                lower++;
            } else if(Character.isDigit(c)){
                digit++;
            }
        }
        System.out.println("Uppercase letters: "+upper);
        System.out.println("Lowercase letters: "+lower);
        System.out.println("Digits: "+digit);
    }
}
