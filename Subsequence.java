public class Subsequence{
    public static void subseq(String s, int index, String temp){
        if(s.length() == index){
            System.out.println(temp);
            return;
        }
        subseq(s , index+1 , temp+s.charAt(index));
        subseq(s, index+1 , temp);
    }
    public static void main(String[] args) {
        String s = "ACE";
        subseq(s,0,"");
    }
}