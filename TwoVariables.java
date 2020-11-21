public class TwoVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        args[0] = Integer.toString(a);
        a = b;
        b = Integer.parseInt(args[0]);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
