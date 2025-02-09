import java.util.Scanner;
import java.util.UUID;

public class Employees extends Dealerships {
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void getDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Age: " + emp_age);
        System.out.println("Employee Department: " + emp_department);
        System.out.println("Dealership Name: " + dealership_name);

    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("======================= *** Enter Employee Details *** =======================");
        System.out.println();
        System.out.print("Employee Name : ");
        emp_name = sc.nextLine();
        System.out.print(("Employee Age : "));
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Department: ");
        emp_department = sc.nextLine();
        System.out.print("Dealership Name: ");
        dealership_name = sc.nextLine();
        total_employees++;
      
    }
}