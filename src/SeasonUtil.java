import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {

    // Array containing all possible Season enum values
    public static final Season[] SEASONS = Season.values();

    /**
     * Sorts an array of objects that implement Comparable.
     *
     * @param seasonables the array to sort
     */
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    /**
     * Builds and returns a single string containing the string
     * representation of every Seasonable object in the array.
     * Each object appears on its own line.
     *
     * @param seasonables the array of Seasonable objects
     * @return a formatted string with all objects, one per line
     */
    static String reportAll(Seasonable[] seasonables) {
        StringBuilder sb = new StringBuilder();

        // Go through every object in the array
        for (int i = 0; i < seasonables.length; i++) {

            // Add the current object's string representation
            sb.append(seasonables[i].toString());

            // Add a newline after every item except the last one
            if (i < seasonables.length - 1) {
                sb.append("\n");
            }
        }

        // Return the completed string
        return sb.toString();
    }
}