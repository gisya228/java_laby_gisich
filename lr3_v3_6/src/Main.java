import java.util.Arrays;
import java.util.Objects;

// Создать объект класса Роза, используя классы Лепесток, Бутон. Методы: расцвести, завять, вывести на консоль цвет бутона.
public class Main {

    public static void main(String[] args) {
        Petal[] petals = new Petal[4];
        petals[0] = new Petal();
        petals[1] = new Petal();
        petals[2] = new Petal();
        petals[3] = new Petal();
        Cvetoc rose = new Cvetoc(new Bud(petals, "White"));
        rose.getColor();
        rose.withering();
        rose.blooming();
        System.out.println(rose.toString());
    }
}