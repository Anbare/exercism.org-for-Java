public class Lasagna {
    public int expectedMinutesInOven() {
        int expectedMinutes = 40;
        return expectedMinutes;
    }

    public int remainingMinutesInOven(int time){
        int minutesInOven = expectedMinutesInOven() - time;
        return minutesInOven;
    }

    public int preparationTimeInMinutes(int layer){
        int preparationTime = layer * 2;
        return preparationTime;
    }

    public int totalTimeInMinutes(int layer, int time){
        int totalTime = preparationTimeInMinutes(layer) + time;
        return totalTime;
    }
}
