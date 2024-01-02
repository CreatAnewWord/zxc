import sun.awt.image.PixelConverter;



public class Main {
    private static Main instance;

    private Main() {
        // private constructor to prevent instantiation
    }

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

}



