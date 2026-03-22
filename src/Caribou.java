
public class Caribou extends Animal {

    /**
     * Creates a Caribou object.
     * In winter the caribou is white, otherwise it is brown.
     *
     * @param weight the caribou's weight
     * @param season the caribou's current season
     */
    Caribou(int weight, Season season) {
        super(weight, season, season == Season.WINTER ? Color.WHITE : Color.BROWN);
    }

    /**
     * Returns a string representation of the caribou.
     * In winter it migrates south, and in summer it migrates north.
     *
     * @return a string describing the caribou
     */
    @Override
    public String toString() {
        if (getCurrentSeason() == Season.WINTER) {
            return "Caribou: I am migrating south. My weight is: " + weight + " and my color is: " + color;
        } else if (getCurrentSeason() == Season.SUMMER) {
            return "Caribou: I am migrating north. My weight is: " + weight + " and my color is: " + color;
        }

        return "Caribou: My weight is: " + weight + " and my color is: " + color;
    }

    /**
     * Changes the caribou's season to the next season
     * and updates its color when needed.
     */
    @Override
    public void changeSeason() {
        switch (getCurrentSeason()) {

            // Spring -> Summer: caribou migrates north
            case SPRING:
                setSeason(Season.SUMMER);
                break;

            // Summer -> Fall: no color change
            case SUMMER:
                setSeason(Season.FALL);
                break;

            // Fall -> Winter: caribou turns white and migrates south
            case FALL:
                setSeason(Season.WINTER);
                this.color = Color.WHITE;
                break;

            // Winter -> Spring: caribou turns brown again
            case WINTER:
                setSeason(Season.SPRING);
                this.color = Color.BROWN;
                break;
        }
    }
}