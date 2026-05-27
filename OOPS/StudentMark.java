class InvalidMarksException extends Exception{
    public InvalidMarksException(String msg) {
        super(msg);
    }
}
public class StudentMark{
    public static void checkMark(int n) throws InvalidMarksException{
        if(n>100 || n<0){
            throw new InvalidMarksException("Marks should be between 0 and 100");
        }
        System.out.println("Marks= "+n);
    }
    public static void main(String args[]){
        int n = 120;
        try{
            checkMark(n);
        }
        catch(InvalidMarksException e){
            System.out.println(e);
        }
    }
}