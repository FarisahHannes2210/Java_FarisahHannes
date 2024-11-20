// 2- Create a Switch which is going to obtain the car model from the terminal and give back the price,
// if the price is greater than 100,000 RM shows the buyer is VIP

import java.util.Scanner;

public class SecondAssignment {
    

    private String car_model;
    private double car_price; //private
   
    

    private SecondAssignment(String car_model, double car_price)
    {
        this.car_model = car_model;
        this.car_price = car_price;
    }

    public void showDetail()
    {
        System.out.println("Car model: " + car_model);
        System.out.println("Car price: RM" + car_price);
    }

    public void defineInput()
    {
        int sigma;
        double num = 100000;

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

        switch (sigma) {
            case 0 -> {
                
                System.out.println("This buyer is not a VIP.");
            }
            case 1 -> {
                
                System.out.println("This buyer is a VIP.");
            }
        
            default -> System.out.println("Invalid. Must be something wrong :(");
        }

         
        
    }
    

    public static void main(String[] args) {
        
        String car_model;
        double car_price;
       
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter car model: ");
        car_model = scanner.nextLine();

        System.out.print("Enter car price: ");
        car_price = scanner.nextDouble();

        System.out.println();
        SecondAssignment cv = new SecondAssignment(car_model, car_price);
        cv.showDetail();
        cv.defineInput();

      
        
    }
}
