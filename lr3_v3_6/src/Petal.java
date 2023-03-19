import java.util.Arrays;
import java.util.Objects;

class Petal {
    private Boolean isBloomed = true;

    public void blooming() {
        this.isBloomed = true;
        System.out.println("petal blossomed");
    }

    public void withering() {
        this.isBloomed = false;
        System.out.println("petal withered");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Petal petal)) return false;
        return Objects.equals(isBloomed, petal.isBloomed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBloomed);
    }

    @Override
    public String toString() {
        return "Petal {" + " isBloomed:" + isBloomed + " }";
    }
}
