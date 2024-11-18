public class privateVariable {
    private String name;
    private int age;
    private long phoneNumber;
    private boolean isAlive;


    public privateVariable(String name, int age, long phoneNumber, boolean isAlive)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.isAlive = isAlive;
    }

    public void DisplayDetail()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Is Alive: " + isAlive);
    }

    public static void main(String[] args) {
        
        privateVariable pv = new privateVariable("yesh", 32, 198278826L, true);
        pv.DisplayDetail();

    }


}
