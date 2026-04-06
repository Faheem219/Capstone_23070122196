// Java does not support multiple inheritance with classes,
// so this topic is usually demonstrated using interfaces

// Q; A smart home system has Device A & Device B, both the system have same operation
// that is turnOn. Soln: Smart Device implements both method / interfaces.

interface DeviceA_SIT {

    default void turnOn() {
        System.out.println("Device A is ON");
    }
}

interface DeviceB_SIT {

    default void turnOn() {
        System.out.println("Device B is ON");
    }
}

class SmartDevice implements DeviceA_SIT, DeviceB_SIT {
    // The SmartDevice class implements both interfaces
    // It inherits the default turnOn() method from both interfaces

    @Override
    public void turnOn() {
        DeviceA_SIT.super.turnOn();
        DeviceB_SIT.super.turnOn();
    }
}

public class DiamondProblem {

    public static void main(String[] args) {
        SmartDevice op = new SmartDevice();
        op.turnOn();
    }
}
