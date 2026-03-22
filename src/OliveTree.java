public class OliveTree extends Tree {

    /**
     * Creates an OliveTree object.
     * Olive trees always have green leaves.
     *
     * @param height the height of the olive tree
     * @param season the current season
     */
    OliveTree(int height, Season season) {
        super(height, season, Color.GREEN);
    }

    /**
     * Returns a string representation of the olive tree.
     * In fall it gives fruit.
     *
     * @return a description of the olive tree
     */
    @Override
    public String toString() {
        // In fall the olive tree gives fruit
        if (season == Season.FALL) {
            return "Olive tree. I give fruit. My height is: " + height + " and my color is: " + leavesColor;
        } else {
            // In all other seasons print the regular description
            return "Olive tree. My height is: " + height + " and my color is: " + leavesColor;
        }
    }

    /**
     * Changes the tree to the next season
     * and updates its height accordingly.
     */
    @Override
    public void changeSeason() {
        switch (getCurrentSeason()) {

            // Spring -> Summer: grows by 10
            case SPRING:
                setSeason(Season.SUMMER);
                this.height += 10;
                break;

            // Summer -> Fall: grows by 5
            case SUMMER:
                setSeason(Season.FALL);
                this.height += 5;
                break;

            // Fall -> Winter: grows by 5
            case FALL:
                setSeason(Season.WINTER);
                this.height += 5;
                break;

            // Winter -> Spring: grows by 10
            case WINTER:
                setSeason(Season.SPRING);
                this.height += 10;
                break;
        }
    }
}