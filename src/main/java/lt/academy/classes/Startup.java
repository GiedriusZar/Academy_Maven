package lt.academy.classes;

public class Startup implements Starter {

    @Override
    public String start(String startupName, String founderName) {
        return startupName + "-" + founderName;
    }
}