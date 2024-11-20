//3- Create a Matrix with 3 rows and 3 columns
// which contains the car models and prices then fetch the car
//which values above 50,000 RM 
// and portray it in the terminal

public class ThirdAssignment {

    public static void main(String[] args) {

        //declare var with input.
        String[][] car_model = {
            {"Mazda", "Proton", "Toyota"},
            {"Merc", "Nissan", "Benz"},
            {"Tesla", "BYD", "Perodua"}
        };

        double[][] car_price = {
            {80999.45, 8748.76, 860384.3},
            {100922.56, 40900.8 , 3204923.98},
            {1000000.56, 400383.74, 1000.50}

        };


        System.out.println("PRICE OF CAR MORE THAN 500K");
        System.out.println("------------------------------------------");

        for(int row = 0; row < car_model.length; row ++ )
        {
            for(int col = 0; col < car_model[row].length; col++)
            {
                
                 if(car_price[row][col] > 500000)
                {
                     System.out.println(car_model[row][col] + " car with a price of RM" + car_price[row][col]);
                }
            }
            
            
        }
    }
        
}

