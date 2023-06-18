public interface Ship {
    void move();
}

public abstract class WarShip implements Ship {
    private int armorLevel;

    public WarShip(int armorLevel) {
        this.armorLevel = armorLevel;
    }

    public int getArmorLevel() {
        return armorLevel;
    }

    public void setArmorLevel(int armorLevel) {
        this.armorLevel = armorLevel;
    }

    public abstract void attack();
}

public class Airship extends WarShip {
    public Airship(int armorLevel) {
        super(armorLevel);
    }

    @Override
    public void move() {
        // implementation
    }

    @Override
    public void attack() {
        // implementation
    }
}
