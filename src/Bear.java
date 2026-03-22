public class Bear extends Animal {

    /**
     * Creates a Bear object.
     * A bear is always brown.
     *
     * @param weight the bear's weight
     * @param season the bear's current season
     */
    public Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    /**
     * Returns a string representation of the bear.
     * In winter, the bear is described as sleeping.
     *
     * @return a string describing the bear
     */
    @Override
    public String toString() {
        if (getCurrentSeason() == Season.WINTER) {
            return "Bear. I am sleeping. My weight is: " + weight + " and my color is: "+color+"";
        }
        return "Bear. My weight is: " + weight + " and my color is: "+color+"";
    }

    /**
     * Changes the bear's season to the next season
     * and updates its weight accordingly.
     */
    @Override
    public void changeSeason() {
        switch (getCurrentSeason()) {

            // Spring -> Summer: bear gains weight by 4/3
            case SPRING:
                setSeason(Season.SUMMER);
                this.weight = (int) Math.round(this.weight * (4.0 / 3.0));
                break;

            // Summer -> Fall: bear gains weight by 25%
            case SUMMER:
                setSeason(Season.FALL);
                this.weight = (int) Math.round(this.weight * 1.25);
                break;

            // Fall -> Winter: bear loses weight to 80% of current weight
            case FALL:
                setSeason(Season.WINTER);
                this.weight = (int) Math.round(this.weight * 0.8);
                break;

            // Winter -> Spring: bear loses weight to 75% of current weight
            case WINTER:
                setSeason(Season.SPRING);
                this.weight = (int) Math.round(this.weight * 0.75);
                break;
        }
    }
}