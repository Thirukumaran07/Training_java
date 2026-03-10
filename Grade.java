public class Grade{
    public static void G(int marks){
        switch(marks/10){
            case 10:
                System.out.println("Grade O");
                break;
                case 9:
                    System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B");
                    break;
                case 7:
                    System.out.println("Grade C");
                    break;
                default:
                    System.out.println("Grade D");
        }
    }
    public static void Calc(int a, int b, char operator){
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(a==0 || b==0){
                    System.out.println("Cannot divide by zero");
                }
                else{
                    System.out.println(a/b);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    public static void main(String args[]){
        int marks = 90;
        G(marks);
        int a = 100;
        int b = 20;
        char operator = '/';
        Calc(a,b,operator);
    }
}