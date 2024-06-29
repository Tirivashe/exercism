
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
       return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] ++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int days = 0;
        if(numberOfDays >= birdsPerDay.length) {
            days = birdsPerDay.length;
        } else {
            days = numberOfDays;
        }
        for(int i = 0; i < days; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int total = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5) {
                total ++;
            }
        }
        return total;
    }
}
