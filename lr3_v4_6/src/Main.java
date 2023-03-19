public class Main {
    public static void main(String[] args) {
        Construktor конструктор = new Construktor();
        конструктор.setТЗ("Много разных желаний");
        double цена = конструктор.countProject();
        System.out.println(" цена ниже медианы рынка " + цена);
        Brigada бригада = new Brigada();
        Rabochiy работяги[] = бригада.getBrigada();
        for (Rabochiy krutoiPerec : работяги) {
            System.out.println("Ну вот мы тут строим " + krutoiPerec.getPonty());
        }
    }

}

class Construktor {
    String ТЗ = null;
    private double getPrice() {
        return Double.MAX_VALUE;
    }

    public double countProject() {
        int causes = Integer.MAX_VALUE;
        if (causes-- > 0) {
            System.out.println("Need more money");
        }
        return this.getPrice();
    }

    public String getТЗ() {
        return ТЗ;
    }

    public void setТЗ(String тЗ) {
        ТЗ = null;
    }
}
class Brigada {
    private Rabochiy sashaBelyi = new Rabochiy();
    private Rabochiy kosmos = new Rabochiy();
    private Rabochiy fil = new Rabochiy();
    private Rabochiy ptchela = new Rabochiy();

    public Rabochiy[] getBrigada() {
        return new Rabochiy[] { sashaBelyi, kosmos, fil, ptchela };
    }

}

class Rabochiy {
    private String ponty = String.valueOf(Long.MAX_VALUE);

    public String getPonty() {
        return ponty;
    }

    public void setPonty(String ponty) {
        this.ponty = ponty;
    }

}