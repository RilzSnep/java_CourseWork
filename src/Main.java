public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Ваня", 5, 5000);
        employees[1] = new Employee("Дмитриев Дима", 4, 5050);
        employees[2] = new Employee("Александров Саша", 3, 5001);
        employees[3] = new Employee("Алексеев Леша", 2, 5002);
        employees[4] = new Employee("Рыбаков Женя", 1, 5003);
        employees[5] = new Employee("Петров Петя", 5, 5004);
        employees[6] = new Employee("Симолкин Вадим", 1, 5005);
        employees[7] = new Employee("Владимиров Владимир", 2, 5006);
        employees[8] = new Employee("Сергеев Сергей", 3, 5007);
        employees[9] = new Employee("Рубиков Кубик", 4, 5008);
        allEmloyee();
        totalSalary();
        minSalary();
        maxSalary();
        averageSalary();
        allNamesEmloyee();
    }

    public static void allEmloyee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("id-" + employees[i].getId(i) + " " + employees[i].getfullName() + ", отдел: " + employees[i].getDepartment() + ", ЗП: " + employees[i].getSalary());
        }
        System.out.println(" ");
    }

    public static void totalSalary() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].salary;
        }
        System.out.println("Всего трат: " + total);
        System.out.println(" ");
    }

    public static void minSalary() {
        int num = 0;
        int toto = 1000000000;
        for (int i = 0; i < employees.length; i++) {
            if (toto > employees[i].salary) {
                num = i;
                toto = employees[i].salary;
            }
        }
        System.out.println("Минимальная ЗП у: " + employees[num].getfullName() + " - " + employees[num].salary);
        System.out.println(" ");
    }

    public static void maxSalary() {
        int num = 0;
        int toto = 0;
        for (int i = 0; i < employees.length; i++) {
            if (toto < employees[i].salary) {
                num = i;
                toto = employees[i].salary;
            }
        }
        System.out.println("Максимальная ЗП у: " + employees[num].getfullName() + " - " + employees[num].salary);
        System.out.println(" ");
    }

    public static void averageSalary() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].salary;
        }
        System.out.println("Средняя ЗП " + total / 10);
    }

    public static void allNamesEmloyee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getfullName());
        }
        System.out.println(" ");
    }
}