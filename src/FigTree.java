public class FigTree extends Tree {


    public FigTree(int height, Season season) {
        super(height, season,
                (season == Season.WINTER) ? null :
                        (season == Season.FALL) ? Color.YELLOW :
                                Color.GREEN);
    }

    @Override
    public String toString() {
        if(season==Season.SPRING){
            return("FigTree: I give fruit. My height is: "+height+" and my leaves color is: "+leavesColor+"");
        }else {
        return ("FigTree: My height is: "+height+" and my leaves color is: "+leavesColor+"");
    }
    }
    @Override
    public void changeSeason() {
        switch (getCurrentSeason()) {
            case SPRING:
                setSeason(Season.SUMMER);
                this.height += 30;
                break;

            case SUMMER:
                setSeason(Season.FALL);
                this.height += 20;
                this.leavesColor = Color.YELLOW;
                break;

            case FALL:
                setSeason(Season.WINTER);
                this.height += 20;
                this.leavesColor = null;
                break;

            case WINTER:
                setSeason(Season.SPRING);
                this.height += 30;
                this.leavesColor = Color.GREEN;
                break;
        }
    }
}
