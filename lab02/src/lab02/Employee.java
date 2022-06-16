package lab02.src.lab02;


public class Employee {
    private final int id;
    private final String Firstname;
    private final String Lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.Firstname;
    }

    public String getLastname() {
        return this.Lastname;
    }

    public String getName(){
        return  this.Firstname + " " + this.Lastname;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnuallySalary(){
        return this.salary * 12;
    }

    public int raiseSalary(int percent){
        int raise = (int) (this.salary*(percent/100d));
        this.salary += raise;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + Firstname + " " + Lastname + '\'' +
                ", salary=" + salary +
                ']';
    }



}
