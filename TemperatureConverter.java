public class TemperatureConverter{
    private double celcius;


    public TemperatureConverter(double celcius){
        this.celcius = celcius;
    }

    public double getCelcius(){
        return celcius;
    }

    public double getFarenheit(){
        return celcius * 9/5 + 32;
    }

    public double getKelvin(){
        return celcius + 273.15;
    }

    public void setCelcius(double temp){
        celcius = temp;
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter(25);
        System.out.println("Celcius: " + temperatureConverter.getCelcius());
        System.out.println("Farenheit: " + temperatureConverter.getFarenheit());
        System.out.println("Kelvin: " + temperatureConverter.getKelvin());
    }

}