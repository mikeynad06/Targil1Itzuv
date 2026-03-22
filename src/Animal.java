public abstract class Animal implements Seasonable, Comparable {

    // The animal's weight
    protected int weight;

    // The animal's current season
    private Season season;

    // The animal's color
    protected Color color;

    // TODO: Add auxiliary fields and functions if needed

    /**
     * Constructor for creating an Animal object.
     *
     * @param weight the animal's weight
     * @param season the animal's current season
     * @param color  the animal's color
     */
    Animal(int weight, Season season, Color color) {
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    /**
     * Returns the animal's current season.
     *
     * @return the current season
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Updates the animal's season.
     *
     * @param season the new season
     */
    public void setSeason(Season season) {
        this.season = season;
    }

    /**
     * Compares this animal to another object.
     * Comparison is based on weight.
     *
     * @param o the object to compare to
     * @return 1 if this animal is heavier,
     *        -1 if this animal is lighter,
     *         0 if equal or not an Animal
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Animal) {
            Animal other = (Animal) o;

            if (this.weight > other.weight) {
                return 1;
            } else if (this.weight < other.weight) {
                return -1;
            }
        }

        return 0;
    }
}