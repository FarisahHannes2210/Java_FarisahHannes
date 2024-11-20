public class OneDArray {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 10;
        //etc

            //normal way for students
        for (int i = 0; i< 10; i ++) { 
                System.out.println(i);
            
        }
            // programmer way
        for(int number: numbers)
        {
            System.out.println(number);
        }
        
    }
}
