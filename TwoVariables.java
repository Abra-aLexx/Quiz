public class TwoVariables {
    public static void main(String[] args) {
        /*
        * Мне в голову пришла идея изпользовать массив стартовых параметров args
        * он уже создан и не считается как создание новой переменной.
        * Чтобы массив не был null, я добавил в него всего один аргумент "0"
        * */
        int a = 5;
        int b = 3;
        args[0] = Integer.toString(a);
        a = b;
        b = Integer.parseInt(args[0]);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
