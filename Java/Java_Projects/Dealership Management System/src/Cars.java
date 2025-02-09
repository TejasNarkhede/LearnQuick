import java.util.Scanner;

public class Cars extends Dealerships {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void getDetails() {
        System.out.println("Car Name : " + car_name);
        System.out.println("Car Color : " + car_color);
        System.out.println("Car Fuel Type : " + car_fuel_type);
        System.out.println("Car Price : " + car_price);
        System.out.println("Car Type : " + car_type);
        System.out.println("Car Transmission : " + car_transmission);

    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================ *** Enter Car Details *** ================");
        System.out.println();
        System.out.print("Car Name : ");
        car_name = sc.nextLine();
        System.out.print("Car Color : ");
        car_color = sc.nextLine();
        System.out.print("Car Fuel Type : ");
        car_fuel_type = sc.nextLine();
        System.out.print("Car Price : ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("Car Type : ");
        car_type = sc.nextLine();
        System.out.print("Car Transmission");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;
   
    }
}
