class ProductionRemoteControlCar implements RemoteControlCar, Comparable {
    int distanceTravelled = 0;
    int numberOfVictories = 0;
    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(Object o) {
        ProductionRemoteControlCar otherCar = (ProductionRemoteControlCar) o;
        return Integer.compare(otherCar.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
