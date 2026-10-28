public class string2 {
    public static void main(String [] args){
        String s="Hello World";
        String h=s.toLowerCase();
        String vowel="aeiou";
        String consonant="bcdfghjklmnpqrstvwxyz";
        int v=0;
        int c=0;
        for(int i=0;i<h.length();i++){
            char ch=h.charAt(i);
            if(vowel.indexOf(ch)!=-1){
                v++;
            }
            else if(consonant.indexOf(ch)!=-1){
                c++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
    }
}
