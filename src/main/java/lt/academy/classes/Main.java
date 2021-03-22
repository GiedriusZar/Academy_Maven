package lt.academy.classes;


public class Main {

    public static void main(String[] args) {

//        Startup startUp = new Startup();
//        startUp.start("Starting", "Founder");
//        System.out.println(Starter.finish());
//
//        Starter starter = new Starter() {
//            @Override
//            public String start(String startupName, String founderName) {
//                return startupName + "-" + founderName;
//            }
//        };
//        starter.start("Starting", "Founder");
//        starter.progress();
//        Starter.finish();

//        Starter newStarter = (String startupName, String founderName) -> {
//            return startupName + "-" + founderName;
//        };
//
//        Starter shortStarter = ((startupName, founderName) -> startupName + "-" + founderName);
Translator translator = new Translator();

        System.out.println(translator.toLocale("logout"));
    }

}


