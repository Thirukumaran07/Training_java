import java.util.*;
public class RevVowel{
    public static boolean is(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public static String rev(String s){
        char[]c=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r&&!is(c[l]))l++;
            while(l<r&&!is(c[r]))r--;
            if(r!=l){
            char t=c[l];
            c[l]=c[r];
            c[r]=t;
                r--;
                l++;
            }
        }
        return new String(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(rev(s));
    }
}