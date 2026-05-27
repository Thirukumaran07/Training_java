class Emp {
    String name;
    int salary;

    void display() {
        System.out.println(name + " " + salary);
    }
}
class Manager extends Emp {
    int calcBonus() {
        return salary * 20 / 100;
    }
}
class Developer extends Emp {
    int calcBonus() {
        return salary * 10 / 100;
    }
}
public class Employee {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Arun";
        m.salary = 50000;
        m.display();
        System.out.println("Bonus: " + m.calcBonus());
        Developer d = new Developer();
        d.name = "Ravi";
        d.salary = 40000;
        d.display();
        System.out.println("Bonus: " + d.calcBonus());
    }
}