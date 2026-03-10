import java.util.*;
public class FreqArr
{
    public static boolean auto(String s){
        int fre[]=new int[10];
        for(int i=0;i<s.length();i++)
        fre[s.charAt(i)-'0']++;
        for (int i=0;i<s.length() ;i++ ){
            int num=s.charAt(i)-'0';
            if(fre[i]!=num)return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    
	    if(auto(s))System.out.println("AutoBiography");
	    else System.out.print("Not Autobiography");
	}
}