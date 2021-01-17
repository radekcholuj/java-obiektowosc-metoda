public class AmberProgram {
    public static void main(String[] args) {
        char[] gold = {'g', 'o', 'l', 'd'};
        char[] red = {'r', 'e', 'd'};
        char[] white = {'w', 'h', 'i', 't', 'e'};
        char[] blue = {'b', 'l', 'u', 'e'};

        Amber a1 = new Amber(gold , 3.2,0.56,145);
        Amber a2 = new Amber(red , 2.1,0.46,115);
        Amber a3 = new Amber(white,  3.5,0.89,135);
        Amber a4 = new Amber(blue, 4.1,1.5,140);

        Amber[] ambersArray = new Amber[4];
        ambersArray[0] = a1;
        ambersArray[1] = a2;
        ambersArray[2] = a3;
        ambersArray[3] = a4;


        System.out.println("melting at " + ambersArray[2].displayMeltingTempInFahrenheit()+ " F");
        ambersArray[2].displayInfoAboutAmber();
        System.out.println("---");
        System.out.println("density increased to " +ambersArray[2].increasinDensity(0.7));
        System.out.println("---");
        ambersArray[2].displayInfoAboutAmber();



    }
}

