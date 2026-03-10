public class NestedIf{
    public static void isVoter(int age , long Adr){
        String str = Long.toString(Adr);
        if(age>=18){
            if(str.length()==8){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("You are not eligible to vote");
            }
        }
    }
    public static void main(String args[]){
        int age = 20;
        long Adr = 812345678;
        isVoter(age,Adr);
    }
}