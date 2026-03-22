public abstract class Tree implements Comparable, Seasonable {

    // The tree's height
    protected int height;

    // The tree's current season
    protected Season season;

    // The current color of the tree's leaves
    protected Color leavesColor;

    // TODO: Add auxiliary fields and functions if needed

    /**
     * Constructor for creating a Tree object.
     *
     * @param height      the tree's height
     * @param season      the tree's current season
     * @param leavesColor the color of the leaves
     */
    Tree(int height, Season season, Color leavesColor) {
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    /**
     * Returns the tree's current season.
     *
     * @return the current season
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Updates the tree's season.
     *
     * @param season the new season
     */
    public void setSeason(Season season) {
        this.season = season;
    }

    /**
     * Compares this tree to another object.
     * Comparison is based on height.
     *
     * @param o the object to compare to
     * @return 1 if this tree is taller,
     *        -1 if this tree is shorter,
     *         0 if equal or not a Tree
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Tree) {
            Tree other = (Tree) o;

            if (this.height > other.height) {
                return 1;
            } else if (this.height < other.height) {
                return -1;
            }
        }

        return 0;
    }
}