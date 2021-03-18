package lt.academy.classes;


public class Main {
    public static void main(String[] args) {

        Interface simpleClass = new Class();
        System.out.println(simpleClass.sum(1, 4));

        Interface anonymousInterface = (a, b) -> a + b;
        Interface anonymousInterface1 = (a, b) -> a - b;

        System.out.println(anonymousInterface.sum(1, 4));
        System.out.println(anonymousInterface1.sum(5, 4));

        Interface anonymousInterface2 = (x, y) -> x * y;
        System.out.println(anonymousInterface2.sum(2, 3));
        anonymousInterface2.empty();

        Interface anonymousInterface3 = (x, y) -> x / y;

    }

}


