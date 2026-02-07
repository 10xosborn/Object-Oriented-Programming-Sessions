public class PhoneBattery{

    private int batteryLevel;

    public PhoneBattery(int batteryLevel) {
        if(batteryLevel < 0 || batteryLevel > 100) {
            throw new IllegalArgumentException("Battery Level must be between 0% and 100%");
        }
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void charge(int amount){
        if(amount < 0 || amount + batteryLevel > 100) {
            throw new IllegalArgumentException("Invalid charge amount");
        }
        batteryLevel += amount;
    }

    public void useBattery(int amount){
        if(amount < 0 || amount + batteryLevel > 100) {
            throw new IllegalArgumentException("Invalid charge amount");
        }
        batteryLevel -= amount;
    }

    public static void main (String[] args) {
        PhoneBattery phoneBatteryObject = new PhoneBattery(1);
        // phoneBatteryObject.charge(20);
        phoneBatteryObject.useBattery(10);
        System.out.println("Current Battery Level: " + phoneBatteryObject.getBatteryLevel());
    }
}