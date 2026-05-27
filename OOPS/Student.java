class Students {
    private String name;
    private int roll;
    private int marks;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setRoll(int r) {
        roll = r;
    }
    public int getRoll() {
        return roll;
    }
    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {
            marks = m;
        }
    }
    public int getMarks() {
        return marks;
    }
    public String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 50)
            return "C";
        else
            return "F";
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
public class Student {
    public static void main(String[] args) {
        Students s = new Students();
        s.setName("Ravi");
        s.setRoll(1);
        s.setMarks(82);
        s.display();
    }
}