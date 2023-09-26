
package lab4hometask;


public class Employee {
    private String name;
    private int id;
    private String department;
     private double cgpa;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public Employee(){
        name = "Shahadat Hossain";
        id = 2122431642;
        department= "ECE";
        cgpa=3.75;
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.getDepartment());
        System.out.println(employee.getCgpa());
    }
     
    
}
