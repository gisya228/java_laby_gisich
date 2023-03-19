import java.util.Arrays;
import java.util.Objects;

class Bud {
    private Petal[] petal;
    private String color;
    private Boolean isBloomed = true;

    public Bud(Petal[] petal, String color) {
        this.petal = petal;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void blooming() {
        for (Petal value : petal) {
            value.blooming();
        }
        this.isBloomed = true;
        System.out.println("The bud has blossomed");
    }

    public void withering() {
        for (Petal value : petal) {
            value.withering();
        }
        this.isBloomed = false;
        System.out.println("Bud wilted");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bud bud)) return false;
        return Arrays.equals(petal, bud.petal) && color.equals(bud.color) && isBloomed.equals(bud.isBloomed);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color, isBloomed);
        return result + Arrays.hashCode(petal);
    }

    @Override
    public String toString() {
        return "Bud {\n" +
                " petal: " + Arrays.toString(petal) + ",\n" +
                " color: '" + color + "'" + ",\n" +
                " isBloomed: " + isBloomed + "\n" +
                "}";
    }
}