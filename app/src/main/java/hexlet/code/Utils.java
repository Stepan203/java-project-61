package hexlet.code;
import java.util.Random;

public class Utils {
    public static int rnd (int minRnd, int maxRnd) {
        Random r = new Random();
        int getRnd = r.nextInt(maxRnd - minRnd) + minRnd;
        return getRnd;
    }
}
