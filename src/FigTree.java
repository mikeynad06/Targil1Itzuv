public class FigTree extends Tree {

    /**
     * Creates a FigTree object.
     * The leaf color depends on the season:
     * - WINTER: no leaves (null)
     * - FALL: yellow leaves
     * - SPRING/SUMMER: green leaves
     *
     * @param height the height of the fig tree
     * @param season the current season
     */
    public FigTree(int height, Season season) {
        super(height, season,
                (season == Season.WINTER) ? null :
                        (season == Season.FALL) ? Color.YELLOW :
                                Color.GREEN);
    }

    /**
     * Returns a string representation of the fig tree.
     * In summer it gives fruit.
     * In winter it has no leaves.
     *
     * @return a description of the fig tree
     */
    @Override
    public String toString() {
        // In summer the fig tree gives fruit
        if (season == Season.SUMMER) {
            return "Fig tree. I give fruit. My height is: " + height + " and my color is: " + leavesColor;
        }

        // In winter the fig tree has no leaves
        if (season == Season.WINTER) {
            return "Fig tree. My height is: " + height + " and I have no leaves";
        }

        // In spring and fall print the regular description
        return "Fig Tree. My height is: " + height + " and my color is: " + leavesColor;
    }

    /**
     * Changes the tree to the next season
     * and updates its height and leaf color.
     */
    @Override
    public void changeSeason() {
        switch (getCurrentSeason()) {

            // Spring -> Summer: grows by 30
            case SPRING:
                setSeason(Season.SUMMER);
                this.height += 30;
                break;

            // Summer -> Fall: grows by 20 and leaves turn yellow
            case SUMMER:
                setSeason(Season.FALL);
                this.height += 20;
                this.leavesColor = Color.YELLOW;
                break;

            // Fall -> Winter: grows by 20 and loses its leaves
            case FALL:
                setSeason(Season.WINTER);
                this.height += 20;
                this.leavesColor = null;
                break;

            // Winter -> Spring: grows by 30 and gets green leaves again
            case WINTER:
                setSeason(Season.SPRING);
                this.height += 30;
                this.leavesColor = Color.GREEN;
                break;
        }
    }
}