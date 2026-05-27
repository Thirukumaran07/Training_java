class InvalidLoginException extends Exception {
    InvalidLoginException(String msg) {
        super(msg);
    }
}

public class Login {

    public static void withdraw(String name, String pass) {
        try {
            if (name==null) {
                throw new NullPointerException("Enter userid.");
            } 
            if (!name.equals("admin") || !pass.equals("pass123")) {
                throw new InvalidLoginException("INVALID CREDENTIALS.");
            } 
            System.out.println("Login successful.");
        } 
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } 
        catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]) {
        String name = null;
        String pass = "pass1";
        withdraw(name, pass);
    }
}