import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int numberOfPlanets = PLANET_CLASSES.length;
        return PLANET_CLASSES[random.nextInt(numberOfPlanets)];
    }

    String randomShipRegistryNumber() {
        int randomInt = random.nextInt(9000) + 1000;
        return String.format("NCC-%04d", randomInt);
    }

    double randomStardate() {
        return 41000.0 + random.nextDouble() * 1000.0;
    }
}
