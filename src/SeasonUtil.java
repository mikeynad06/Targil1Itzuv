import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        // TODO: Implement.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < seasonables.length; i++) {
            sb.append(seasonables[i].toString());
            if (i < seasonables.length - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
