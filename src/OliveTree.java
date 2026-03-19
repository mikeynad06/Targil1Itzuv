public class OliveTree extends Tree {


    OliveTree(int height, Season season) {

        super(height,season,Color.GREEN);
    }

    @Override
    public String toString() {
        if(season==Season.FALL){
            return("OliveTree: I give fruit. My height is: "+height+" and my color is: "+leavesColor+"");
        }else {
            return ("OliveTree: My height is: " + height + " and my color is: " + leavesColor + "");
        }}
    @Override
    public void changeSeason() {
        switch (getCurrentSeason()) {
            case SPRING:
                setSeason(Season.SUMMER);
                this.height += 10;

                break;

            case SUMMER:
                setSeason(Season.FALL);
                this.height += 5;
                //this.hasFruit = true;
                break;

            case FALL:
                setSeason(Season.WINTER);
                this.height += 5;

                break;

            case WINTER:
                setSeason(Season.SPRING);
                this.height += 10;

                break;
        }
    }
}

