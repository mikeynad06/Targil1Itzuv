public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }
    public void setSeason(Season season) {
        this.season = season;
    }
    @Override
    public int compareTo(Object o) {
        if(o instanceof Tree) {
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
