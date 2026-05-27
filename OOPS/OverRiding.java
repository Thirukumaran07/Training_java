class Notification{
    void send(){
        System.out.println("Notification");
    }
}
class EmailNotify extends Notification{
    void send(){
        System.out.println("Email Notification");
    }
}
class SMSNotify extends Notification{
    void send(){
        System.out.println("SMS Notification");
    }
}
class PushNotify extends Notification{
    void send(){
        System.out.println("Push Notification");
    }
}
public class OverRiding{
    public static void main(String[] args) {
        Notification n;
        n = new EmailNotify();
        n.send();
        n = new SMSNotify();
        n.send();
        n = new PushNotify();
        n.send();
    }
}