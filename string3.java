import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        Boolean isPalindrome = true;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=str.charAt(str.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }  
sc.close();
        if(isPalindrome){
            System.out.println(str+": true");
        }
        else{
            System.out.println(str+": false");
        }
}
}
