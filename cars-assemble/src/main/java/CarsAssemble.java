public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double percentage;
        if(speed >= 1 && speed <= 4) {
            percentage = 1.0;
        } else if(speed >= 5 && speed <= 8) {
            percentage = 0.9;
        } else if(speed == 9) {
            percentage = 0.8;
        } else {
            percentage = 0.77;
        }

        return speed * 221 * percentage;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
