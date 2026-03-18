public class Bear extends Animal {

    Bear(int weight, Season season) {
        // TODO: Implement.
        super(weight,season,Color.BROWN);
    }
    @Override
    public String toString() {
        if(getCurrentSeason()==Season.WINTER){
            return("Bear: I am sleeping. My weight is: "+weight+" and my color is: BROWN");
        }
        return("Bear: My weight is: "+weight+" and my color is: BROWN");
    }
    @Override
    public void changeSeason() {
        switch(getCurrentSeason()) {
            case Season.SPRING:
                setSeason(Season.SUMMER);
                this.weight=(int)(weight*(1.33));
                break;
            case SUMMER:
                setSeason(Season.FALL);
                this.weight=(int)(weight*(1.25));
                break;
            case FALL:
                setSeason(Season.WINTER);
                this.weight=(int)(weight*(.8));
                //"The Bear is sleeping"
                break;
            case WINTER:
                setSeason(Season.SPRING);
                this.weight=(int)(weight*(.75));
                break;
        }
    }
}
