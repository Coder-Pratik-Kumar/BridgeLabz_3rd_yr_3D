public class Q1 {
    String name;
    int id;
    double salary;

    Q1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Q1 emp = new Q1("Rohan", 1, 500000);
        emp.displayEmployee();
    }
}