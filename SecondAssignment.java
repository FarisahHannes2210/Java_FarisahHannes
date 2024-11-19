// 2- Create a Switch which is going to obtain the car model from the terminal and give back the price,
// if the price is greater than 100,000 RM shows the buyer is VIP

import java.util.Scanner;

public class SecondAssignment {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String car_model;
        double car_price;
        int sigma;
        int num = 100000;
       

        System.out.print("Enter car model: ");
        car_model = scanner.nextLine();

        System.out.print("Enter car price: ");
        car_price = scanner.nextDouble();

        

        if(car_price > num)
        {
            sigma = 1;
        }
        else if (car_price < num && car_price >= 0)
        {
            sigma = 0;
            
        }
        else 
        {
            sigma = 98;
        }
        
        System.out.println();
        System.out.println("Car model: " + car_model);
        System.out.println("Car price: RM" + car_price);

        switch (sigma) {
            case 0 -> {
                
                System.out.println("You are not a VIP");
            }
            case 1 -> {
                
                System.out.println("You are a VIP!!");
            }
        
            default -> System.out.println("Invalid. Must be something wrong :(");
        }

    }
}
