public class CharCheck{
    static String check(char c){
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            return "Alphabet";
        }
        else if(c>='0' && c<='9'){
            return "Digit";
        }
        else{
            return "Special Character";
        }
    }
    public static void main(String args[]){
        char c = 'g';
        System.out.println(check(c));
    }
}