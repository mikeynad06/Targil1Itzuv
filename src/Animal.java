public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
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
        if (o instanceof Animal) {
            Animal other = (Animal) o;
            if (this.weight> other.weight){
                return 1;
            }
            else if (this.weight< other.weight){
                return -1;
            }
        }
        return 0;  }
}
