import java.util.ArrayList;



public class City {
    private ArrayList<Dom> housesList = new ArrayList<>();
    private String HouseListName;

    public City(String houseListName) {
        if(houseListName != null || houseListName.equals("")) {
            HouseListName = houseListName;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public void addHouse (Dom house){
        housesList.add(house);
    }

    public ArrayList<Dom> getRoomList (int numberOfRoom){
        ArrayList<Dom> list = new ArrayList<>();
        for (int i=0;i<housesList.size();i++){
            if (housesList.get(i).getRoomNamber() == numberOfRoom){
                list.add(housesList.get(i));
            }
        }
        return list;
    }
    public ArrayList<Dom> getRoomAndFloor (int room, int floor){
        ArrayList<Dom> list = new ArrayList<>();
        for (int i=0;i<housesList.size();i++){
            if((housesList.get(i).getRoomNamber() == room) & (housesList.get(i).getFroorId()==floor)){
                list.add(housesList.get(i));
            }
        }
        return list;
    }
    public ArrayList<Dom> getSquareList (double square){
        ArrayList<Dom> list = new ArrayList<>();
        for (int i=0;i<housesList.size();i++){
            if (housesList.get(i).getAptSquare() >= square ){
                list.add(housesList.get(i));
            }
        }
        return list;
    }
}