class Manager{
    String dept;
    void managingDept(){
        System.out.println("dept: "+dept);
    }
}
class TeamLeader extends Manager{
    int teamSize;
    void leadTeam(){
        System.out.println("lead team of: "+teamSize);
    }
}
class Employee extends TeamLeader{
    String name;
    void work(){
        System.out.println("NAME: "+name);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        TeamLeader t1 = new TeamLeader();
        t1.dept = "HR";
        t1.teamSize = 5;
        t1.managingDept();
        t1.leadTeam();
        Employee e1 = new Employee();
        e1.dept = "HR";
        e1.teamSize = 5;
        e1.name = "Thiru";
        e1.managingDept();
        e1.leadTeam();
        e1.work();
    }
}