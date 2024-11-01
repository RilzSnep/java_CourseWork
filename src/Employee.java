public class Employee {
    String fullName;
    int department;
    int salary;
    private static int idCounter = 0;

    private int id;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;

    }

    public int conterId() {
        return this.id;
    }

    public String getfullName() {
        return fullName;
    }

    public int getId() {
        this.id += 1;
        return this.id;
    }


    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}