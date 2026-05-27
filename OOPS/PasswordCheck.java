class WeakPasswordException extends Exception {
    WeakPasswordException(String msg) {
        super(msg);
    }
}
public class PasswordCheck {
    public static void check(String p) throws WeakPasswordException {
        if (p.length() < 8) {
            throw new WeakPasswordException("Password too weak");
        }
        boolean s = false;
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                s = true;
            }
        }
        if (!s) {
            throw new WeakPasswordException("Password too weak");
        }
        System.out.println("Strong password");
    }
    public static void main(String[] args) {
        String p = "abcd123";

        try {
            check(p);
        } 
        catch (WeakPasswordException e) {
            System.out.println("WeakPasswordException: " + e.getMessage());
        }
    }
}