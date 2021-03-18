package lt.academy.classes;


@FunctionalInterface
public interface Interface {

    int sum( int a, int b);

    default void empty() {
        System.out.println("Default method");
    }
}
