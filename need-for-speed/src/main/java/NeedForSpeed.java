class NeedForSpeed {
    public final int speed;
    public final int batteryDrain;
    private int distanceDriven;
    public int battery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery <= 0;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(this.battery >= this.batteryDrain) {
            this.battery -= this.batteryDrain;
            this.distanceDriven += this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    public final int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        int timeTaken = distance / car.speed;
        int totalConsumedBattery = timeTaken * car.batteryDrain;
        int remainingBattery = car.battery - totalConsumedBattery;
        return remainingBattery < 1;
    }
}
