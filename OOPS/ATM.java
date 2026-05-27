class InsufficientBalaException extends Exception {
    InsufficientBalaException(String msg) {
        super(msg);
    }
}

public class ATM {

    public static void withdraw(int bal, int wd) {
        try {
            if (wd < 0) {
                throw new IllegalArgumentException("Enter correct amount.");
            } 
            else if (bal - wd < 0) {
                throw new InsufficientBalaException("Not enough balance.");
            } 
            else {
                bal -= wd;
                System.out.println("Withdrawal successful. Remaining: " + bal);
            }
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } 
        catch (InsufficientBalaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        int bal = 3000;
        int wd = 2000;
        withdraw(bal, wd);
    }
}