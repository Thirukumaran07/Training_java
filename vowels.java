public class vowels {
    public static void isVowel(char c){
        String s = "aeiouAEIOU";
        if(s.indexOf(c)!=-1){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    public static void main(String args[]){
        char c = 'A';
        isVowel(c);
    }
}
