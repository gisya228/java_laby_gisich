import java.util.Calendar;
import java.util.GregorianCalendar;


public class Dom {
    private int houseId;
    private int aptID;
    private double aptSquare;
    private int froorId;
    private int roomNamber;
    private String streetName;
    private String houseType;
    private int lifetime;

    public Dom(int houseId, int aptID, double aptSquare, int froorId, int roomNamber, String streetName, String houseType, GregorianCalendar lifetime) {
        this.houseId = houseId;
        this.aptID = aptID;
        this.aptSquare = aptSquare;
        this.froorId = froorId;
        this.roomNamber = roomNamber;
        this.streetName = streetName;
        this.houseType = houseType;
        this.lifetime = lifetime.get(Calendar.YEAR);
    }

    public int getHouseId() {
        return houseId;
    }

    public int getAptID() {
        return aptID;
    }

    public void setAptID(int aptID) {
        if(aptID >=1) {
            this.aptID = aptID;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public double getAptSquare() {
        return aptSquare;
    }

    public void setAptSquare(double aptSquare) {
        if(aptSquare >= 0) {
            this.aptSquare = aptSquare;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getFroorId() {
        return froorId;
    }

    public void setFroorId(int froorId) {
        if(froorId > 0 ) {
            this.froorId = froorId;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getRoomNamber() {
        return roomNamber;
    }

    public void setRoomNamber(int roomNamber) {
        if(roomNamber >=1) {
            this.roomNamber = roomNamber;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        if(streetName != null & streetName.equals("")) {
            this.streetName = streetName;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        if(houseType != null & houseType.equals("")) {
            this.houseType = houseType;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(GregorianCalendar lifetime) {
        GregorianCalendar currentTime = new GregorianCalendar();
        if(lifetime.get(Calendar.YEAR) < currentTime.get(Calendar.YEAR)) {
            this.lifetime = lifetime.get(Calendar.YEAR);
        }else{
            throw new IllegalArgumentException();
        }
    }

    public void setHouseId(int houseId) {
        if(houseId >=1) {
            this.houseId = houseId;
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Дом{");
        sb.append("ID дома=").append(houseId);
        sb.append(", номер квартиры=").append(aptID);
        sb.append(", площадь=").append(aptSquare);
        sb.append(", этаж=").append(froorId);
        sb.append(", кол-во комнат=").append(roomNamber);
        sb.append(", улица='").append(streetName).append('\'');
        sb.append(", тип дома='").append(houseType).append('\'');
        sb.append(", время=").append(lifetime);
        sb.append('}');
        return sb.toString();
    }
}