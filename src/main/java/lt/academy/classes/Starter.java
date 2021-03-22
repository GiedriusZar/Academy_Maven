package lt.academy.classes;

@FunctionalInterface
public interface Starter {

    String start(String startupName, String founderName);

    default void progress() {
        System.out.println("IN PROGRESS");
    }

    static String finish() {
        return "Startup Sold";
    }
}
