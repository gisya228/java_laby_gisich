import java.util.Arrays;
import java.util.Objects;

class Cvetoc {
    private final Bud bud;
    private Boolean isBloomed = true;

    public Cvetoc(Bud bud) {
        this.bud = bud;
    }

    public void blooming() {
        this.bud.blooming();
        this.isBloomed = true;
        System.out.println("The Cvetoc has blossomed");
    }

    public void withering() {
        this.bud.withering();
        this.isBloomed = false;
        System.out.println("Cvetoc withered");
    }

    public void getColor() {
        System.out.println("Bud color: " + this.bud.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cvetoc rose)) return false;
        return bud.equals(rose.bud) && isBloomed.equals(rose.isBloomed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bud, isBloomed);
    }

    @Override
    public String toString() {
        return "Cvetoc {\n" +
                "bud: " + bud + ",\n" +
                "isBloomed: " + isBloomed + "\n" +
                "}";
    }
}
