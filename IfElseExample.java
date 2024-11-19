public class IfElseExample {
    public static void main(String[] args) {
        int num = 5;

        if (num >0)
        {
            System.out.println("positive number.");
            if(num %2 ==0)
            {
                System.out.println("even number.");
            }

        }
        else
        {
            System.out.println("negative number");
        }
    }
}
