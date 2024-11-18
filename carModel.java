//Assignment 1.1


import java.util.Scanner;


public class carModel {
    private String car_model;
    private String car_country;
    private double car_price;
       

    private carModel(String car_model, String car_country, double car_price)
    {
        this.car_model = car_model;
        this.car_country = car_country;
        this.car_price = car_price;
    }

    
    public void showCarDetails()
    {

        System.out.println("Car Info: " + car_model + " from " + car_country);
        System.out.println("Price: " + car_price + " USD");
    }

    static void calculateAvgPrice(double car1_price, double car2_price, double car3_price)
    {
        double avg = (car1_price + car2_price + car3_price)/3;
        System.out.println("The average price of all cars is " + avg);
    }


    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String car1_model;
        String car1_country;
        double car1_price;

        String car2_model;
        String car2_country;
        double car2_price;

        String car3_model;
        String car3_country;
        double car3_price;

        System.out.print("Enter car1 Model: ");
        car1_model = scanner.nextLine();
        System.out.print("Enter car1 origin: ");
        car1_country = scanner.nextLine();
        System.out.print("Enter car1 price(double): ");
        car1_price = scanner.nextDouble();
        
        System.out.println();
        scanner.nextLine();

        System.out.print("Enter car2 Model: ");
        car2_model = scanner.nextLine();
        System.out.print("Enter car2 origin: ");
        car2_country = scanner.nextLine();
        System.out.print("Enter car2 price(double): ");
        car2_price = scanner.nextDouble();

        System.out.println();
        scanner.nextLine();

        System.out.print("Enter car3 Model: ");
        car3_model = scanner.nextLine();
        System.out.print("Enter car3 origin: ");
        car3_country = scanner.nextLine();
        System.out.print("Enter car3 price(double): ");
        car3_price = scanner.nextDouble();

        System.out.println();
        carModel car1 = new carModel(car1_model, car1_country, car1_price);
        car1.showCarDetails();
        System.out.println();

        carModel car2 = new carModel(car2_model, car2_country, car2_price);
        car2.showCarDetails();
        System.out.println();

        carModel car3 = new carModel(car3_model, car3_country, car3_price);
        car3.showCarDetails();
        System.out.println();

        calculateAvgPrice(car1_price, car2_price, car3_price);
        

    }
    
}
