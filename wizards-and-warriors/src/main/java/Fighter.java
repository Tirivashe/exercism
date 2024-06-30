class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() { return false; }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(fighter.isVulnerable()) {
            return 10;
        }
        return 6;
    }
}

class Wizard extends Fighter {
    private boolean isSpellPrepared = false;
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !isSpellPrepared;
    }

    void prepareSpell() {
        this.isSpellPrepared = true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(isSpellPrepared) {
            return 12;
        }
        return 3;
    }
}