public class Equal {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hell";
        String str3 = new String("hello");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));

        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
        System.out.println("str1.equals(str3): " + (str1.equals(str3)));




    }
}
