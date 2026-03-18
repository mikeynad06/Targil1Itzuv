public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight, season, season == Season.WINTER ? Color.WHITE : Color.BROWN);
    }

    @Override
    public String toString() {
        if(getCurrentSeason()==Season.WINTER){
            return("Caribou: I am migrating south. My weight is:" +weight+" and my color is: "+color+"");
        }else if(getCurrentSeason()==Season.SUMMER){
            return("Caribou: I am migrating north. My weight is:" +weight+" and my color is: "+color+"");
        }

        return ("Caribou: My weight is:" +weight+" and my color is: "+color+"");
    }

    @Override
    public void changeSeason() {
        switch(getCurrentSeason()) {
            case Season.SPRING:
                setSeason(Season.SUMMER);
                //moves north
                break;
            case SUMMER:
                setSeason(Season.FALL);
                break;
            case FALL:
                setSeason(Season.WINTER);
                this.color=Color.WHITE;
                //Caribou goes south
                break;
            case WINTER:
                setSeason(Season.SPRING);
                this.color=Color.BROWN;
                break;
    }
}}
