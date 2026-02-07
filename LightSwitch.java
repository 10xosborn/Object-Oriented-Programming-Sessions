public class LightSwitch{
    private boolean isOn;

    public LightSwitch(boolean isOn){
        this.isOn = isOn;
    }

    public String turnOn(){
        this.isOn = true;
        return "Light is on";
    }

    public String turnOff(){
        this.isOn = false;
        return "Light is off";
    }

    // public String toggle(){
    //     boolean newIsOn = false;

    //     return this.isOn;
    // }

    public boolean isLightOn(){
        return this.isOn;
    }

    public static void main(String[] args) {
        LightSwitch lightSwitchObject = new LightSwitch(true);
        System.out.println(lightSwitchObject.isLightOn());
        System.out.println(lightSwitchObject.turnOff());
    }
}