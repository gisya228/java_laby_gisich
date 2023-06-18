// Определение интерфейса Mobile
interface Mobile {
    void call(String number);
    void sendSMS(String number, String message);
}

// Определение абстрактного класса SiemensMobile,
// который реализует интерфейс Mobile
abstract class SiemensMobile implements Mobile {
    private String serialNumber;
    private int batteryLevel;

    public SiemensMobile(String serialNumber, int batteryLevel) {
        this.serialNumber = serialNumber;
        this.batteryLevel = batteryLevel;
    }

    public void recharge(int percent) {
        batteryLevel += percent;
    }

    public void checkBatteryLevel() {
        System.out.println("Battery level: " + batteryLevel + "%");
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}

// Определение класса Model, который наследует абстрактный класс SiemensMobile
class Model extends SiemensMobile {
    private String modelType;

    public Model(String serialNumber, int batteryLevel, String modelType) {
        super(serialNumber, batteryLevel);
        this.modelType = modelType;
    }

    public void call(String number) {
        System.out.println("Calling " + number + " on " + modelType);
    }

    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS to " + number + " on " + modelType);
        System.out.println("Message: " + message);
    }
}

// Пример использования классов и интерфейсов
public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Model
        Model phone = new Model("123456", 80, "Siemens A60");

        // Вызов методов интерфейса Mobile
        phone.call("+123456789");
        phone.sendSMS("+123456789", "Hello world!");

        // Вызов методов абстрактного класса SiemensMobile
        phone.recharge(20);
        phone.checkBatteryLevel();
        System.out.println("Serial number: " + phone.getSerialNumber());
    }
}