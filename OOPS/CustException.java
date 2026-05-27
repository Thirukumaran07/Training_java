class InvalidAgeEXception extends Exception{
    InvalidAgeEXception(String msg) {
        super(msg);
    }
}
// public class CustException{
//     public static void checkAge(int a){
//         try {
//             if(a<18){
//                 throw new InvalidAgeEXception("Age should be above 18");
//             }
//             else{
//                 System.out.println("Eligible to vote");
//             }
//         } catch (InvalidAgeEXception e) {
//             System.out.println(e.getMessage());
//         }
//     }
//     public static void main(String[] args) {
//         int age = 15;
//         checkAge(age);
//     }
// }


public class CustException{
    public static void checkAge(int a) throws InvalidAgeEXception{
            if(a<18){
                throw new InvalidAgeEXception("Age should be above 18");
            }
            else{
                System.out.println("Eligible to vote");
            }
    }
    public static void main(String[] args) {
        int age = 15;
        try{
            checkAge(age);
        }
        catch(InvalidAgeEXception e){
            System.out.println(e);
        }
    }
}