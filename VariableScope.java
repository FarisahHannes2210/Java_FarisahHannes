public class VariableScope {
    int instanceVariable = 10;
    static int staticVari = 20;
    String stringVar = "hello";

    public static void main(String[] args) {
        int local = 78;
        System.out.println("Local Variable: " + local);
        System.out.println("Static Variable: " + staticVari);

        VariableScope vs = new VariableScope();

        System.out.println("instance Variable: " + vs.instanceVariable);

        System.out.println(vs.stringVar);

    }
}
