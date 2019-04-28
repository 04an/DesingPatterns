package Singelton;



public class SilgentonLoger {
    private static SilgentonLoger instance;

    private SilgentonLoger() {
    }

    public void log(String tekst) {
        System.out.println(tekst);

    }

    public static SilgentonLoger getLoger() {

        if (instance == null) {
            instance = new SilgentonLoger();
        }
        return instance;
    }
}
