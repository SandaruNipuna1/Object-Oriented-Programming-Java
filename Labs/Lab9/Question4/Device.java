package Question4;

public class Device {
    protected String deviceId;
    protected String deviceType;

    static int deviceCount;

    static{
        deviceCount = 100;
    }

    public Device(String deviceId, String deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        deviceCount++;
    }

    void displayInfo(){
        System.out.println("Device Id: " + deviceId);
        System.out.println("Device Type: " + deviceType);
    }

    static void displayDeviceCount(){
        System.out.println("Device Count: " + deviceCount);
    }
}

class DeviceApp{
    public static void main(String[] args) {
        Device device1 = new Device("E1122","Electric Kettle");
        device1.displayInfo();
        Device.displayDeviceCount();
        System.out.println();


        Device device2 = new Device("F2132","Stand Fan");
        device2.displayInfo();
        Device.displayDeviceCount();
        System.out.println();

        Device device3 = new Device("S1342","Smart Phone");
        device3.displayInfo();
        Device.displayDeviceCount();
        System.out.println();
    }
}