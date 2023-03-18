public class Main {

    public static void lab_6() {
        HouseT house = new HouseT(
                new DoorT[]{
                        new DoorT(70, 200, "Wood"),
                        new DoorT(70, 200, "Wood"),
                        new DoorT(100, 210, "Metal")
                },
                new WindowT[]{
                        new WindowT(80, 150),
                        new WindowT(80, 150),
                        new WindowT(160, 150),
                        new WindowT(160, 150)
                }
        );

        System.out.println(house);
    }

}
