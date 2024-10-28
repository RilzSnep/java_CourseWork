public class Employee {
    String fullName;
    int department;
    int salary;
    int id = 0;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = 0;

    }

    public int conterId() {
        this.id++;
        return this.id;
    }

    public String getfullName() {
        return fullName;
    }

    public int getId(int id) {
        id += 1;
        return id;
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