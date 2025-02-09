import java.util.Scanner;

public class Dealerships implements Utility {
    String dealership_name;
    String dealership_address;
    String manager_name;
    int total_employees;
    int total_cars_in_stock;

    @Override
    public void getDetails() {
        System.out.println("Dealership Name : " + dealership_name);
        System.out.println("Dealership Address : " + dealership_name);
        System.out.println("Manager name : " + manager_name);
        System.out.println("Total Employees : " + total_employees);
        System.out.println("Total Cars In Stock : " + total_cars_in_stock);
    }

    @Override
    public void setDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("================ *** Enter Dealership Details *** ================");
        System.out.println();
        System.out.print("Dealership Name : ");
        dealership_name = sc.nextLine();
        System.out.print("Dealership Address : ");
        dealership_address = sc.nextLine();
        System.out.print("Manager name : ");
        manager_name = sc.nextLine();
        System.out.print("Total Employees : ");
        total_employees = sc.nextInt();
        System.out.print("Total Cars In Stock : ");
        total_cars_in_stock = sc.nextInt();
    }

}
