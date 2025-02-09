import java.util.Scanner;

public class Main {
    public static void main_menu() {
        System.out.println();
        System.out.println(
                "======================= *** Welcome To Dealership Management System *** =======================");
        System.out.println();
        System.out.println("=============================== *** Enter Your Choice *** ===============================");
        System.out.println();
        System.out.println("1].Add Dealership \t\t\t 2].Add Employees \t\t\t 3].Add Cars");
        System.out.println();
        System.out.println("4].Get Dealership \t\t\t 5].Get Employees \t\t\t 6].Get Cars");
        System.out.println();
        System.out.println("=============================== *** Enter 0 To Exit *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dealerships dealerships[] = new Dealerships[5];
        int dealership_counter = 0;
        Employees employees[] = new Employees[5];
        int employees_counter = 0;
        Cars cars[] = new Cars[5];
        int cars_counter = 0;

        int choice = 100;
        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        // Add Dealerships
                        dealerships[dealership_counter] = new Dealerships();
                        dealerships[dealership_counter].setDetails();
                        dealership_counter++;
                        System.out.println();
                        System.out.println("1] Add Dealerships");
                        System.out.println("9] Go Back To Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        // Add Employees
                        employees[employees_counter] = new Employees();
                        employees[employees_counter].setDetails();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2] Add Employees");
                        System.out.println("9] Go Back To Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        // Add Cars
                        cars[cars_counter] = new Cars();
                        cars[cars_counter].setDetails();
                        cars_counter++;
                        System.out.println();
                        System.out.println("3] Add Cars");
                        System.out.println("9] Go Back To Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        // Get Dealerships
                        for (int dealer = 0; dealer < dealership_counter; dealer++) {
                            dealerships[dealer].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Main Menu");
                        System.out.println("0] Exit");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        // Get Employees
                        for (int employee = 0; employee < employees_counter; employee++) {
                            employees[employee].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Main Menu");
                        System.out.println("0] Exit");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        // Get Cars
                        for (int car = 0; car < cars_counter; car++) {
                            cars[car].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Main Menu");
                        System.out.println("0] Exit");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
        sc.close();

    }
}