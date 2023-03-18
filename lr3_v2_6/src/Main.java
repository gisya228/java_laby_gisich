import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        City mskCity = new City("Москва");
        mskCity.addHouse(new Dom(1,12,134.4,14,3,"Первомайская","Блоковый", new GregorianCalendar()));
        mskCity.addHouse(new Dom(2,11,124.4,12,2,"Первомайская","Блоковый", new GregorianCalendar()));
        mskCity.addHouse(new Dom(3,12,125.4,11,2,"Первомайская","Блоковый", new GregorianCalendar()));
        mskCity.addHouse(new Dom(4,13,112.4,12,2,"Первомайская","Блоковый", new GregorianCalendar()));
        mskCity.addHouse(new Dom(5,15,112.4,14,3,"Первомайская","Блоковый", new GregorianCalendar()));
        System.out.println(mskCity.getRoomList(3) + "\n");
        System.out.println(mskCity.getRoomAndFloor(2, 11) + "\n");
        System.out.println(mskCity.getSquareList(130));
    }

}