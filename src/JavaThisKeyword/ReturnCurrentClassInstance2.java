package JavaThisKeyword;

// his video explains how this keyword is used for returning current class instance.

class Employee{

    int id;
    String name;
    int salary;
    String department;

    Employee(int id, String name, int salary, String department){

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void show() {

        System.out.println("id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
    }

    Employee compare(Employee e2){

        if(salary > e2.salary)
            return this;
        else
            return e2;
    }
}

public class ReturnCurrentClassInstance2 {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "A", 1000, "IT");
        Employee e2 = new Employee(2, "B", 2000, "IT");
        Employee e = e1.compare(e2);
        e.show();
    }
}
