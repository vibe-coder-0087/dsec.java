public class String10 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        int[] first = new int[26];
        int[] second = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = Character.toLowerCase(s1.charAt(i));
            first[ch - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = Character.toLowerCase(s2.charAt(i));
            second[ch - 'a']++;
        }

        System.out.println("First string count:");
        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('a' + i) + " = " + first[i]);
        }

        System.out.println("\nSecond string count:");
        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('a' + i) + " = " + second[i]);
        }

        boolean isAnagram = true;

        for (int i = 0; i < 26; i++) {
            if (first[i] != second[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("\nAnagram");
        } else {
            System.out.println("\nNot Anagram");
        }
    }
}