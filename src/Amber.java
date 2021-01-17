public class Amber {
    char[] color;
    double hardnes;
    double density;
    int meltingTemperatureInCelsius;

    public Amber(char[] color, double hardnes, double density, int meltingTemperatureInCelsius) {
        this.color = color;
        this.hardnes = hardnes;
        this.density = density;
        this.meltingTemperatureInCelsius = meltingTemperatureInCelsius;
    }

    double displayMeltingTempInFahrenheit(){
        return (this.meltingTemperatureInCelsius * 1.8)+32;
    }

    double increasinDensity(double densityValueToIncrease){

        return this.density+=densityValueToIncrease;
    }

    void displayInfoAboutAmber(){

        System.out.print("color: " );
        for (char c : color){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("hardnes: " + hardnes);
        System.out.println("density: " + density);
        System.out.println("melting temperature: " + meltingTemperatureInCelsius + " Celsius");

    }



}

