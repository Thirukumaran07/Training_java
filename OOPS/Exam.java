class ExamTimeoutException extends Exception{
    public ExamTimeoutException(String msg) {
        super(msg);
    }  
}
public class Exam{
    public static void time(double t) throws ExamTimeoutException{
        if(t>3.0){
            throw new ExamTimeoutException("Exam Submission timed out");
        }
        System.out.println("Submitted successfully");
    }
    public static void main(String[] args) {
        double t = 2.4;
        try{
            time(t);
        }
        catch(ExamTimeoutException e){
            System.out.println("ExamTimeoutException: "+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}