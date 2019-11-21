// CodeReview 01

public class main {

// --> FORMELN

    public static String calcRechteck(int width, int height) {
        int result = width * height;
        return "Die Fläche eines Rechteckes mit einer Breite von " + width+"cm²" + " und einer Höhe von " + height+"cm²" + " ist: " + result+"cm²";
    }

    public static String calcQuadratFlaeche(int width) {
        int result = width * width;
        return "Die Fläche eines Quadrates mit einer Seitenlänge von " + width+"cm²" + " ist: " + result+"cm²";
    }

    public static String calcQuadratUmfang(int width) {
        int result = width * 4;
        return "Der Umfang eines Quadrates mit seiner Seitenlänge von " + width+"cm²" + " ist: " + result+"cm²";
    }

    public static void main(String[] args) {

// --> BERECHNUNGEN
// Rechteck berechnen
        int width1 = 20;
        int height1 = 30;
        System.out.println(calcRechteck(width1, height1));

        int width2 = 40;
        int height2 = 50;
        System.out.println(calcRechteck(width2, height2));

        int width3 = 60;
        int height3 = 80;
        System.out.println(calcRechteck(width3, height3));

        int width4 = 15;
        int height4 = 37;
        System.out.println(calcRechteck(width4, height4));

        int width5 = 88;
        int height5 = 50;
        System.out.println(calcRechteck(width5, height5));

        int width6 = 80;
        int height6 = 90;
        System.out.println(calcRechteck(width6, height6));

// Quadrat Fläche berechnen
        int width7 = 7;
        System.out.println(calcQuadratFlaeche(width7));

        int width8 = 5;
        System.out.println(calcQuadratFlaeche(width8));

        int width9 = 25;
        System.out.println(calcQuadratFlaeche(width9));

        int width10 = 20;
        System.out.println(calcQuadratFlaeche(width10));

// Quadrat Umfang berechnen
        int width11 = 4;
        System.out.println(calcQuadratUmfang(width11));

        int width12 = 2;
        System.out.println(calcQuadratUmfang(width12));

        int width13 = 12;
        System.out.println(calcQuadratUmfang(width13));

        int width14 = 5;
        System.out.println(calcQuadratUmfang(width14));

        int width15 = 20;
        System.out.println(calcQuadratUmfang(width15));

        int width16 = 75;
        System.out.println(calcQuadratUmfang(width16));

// BONUS 1: Array Rechteck mit for loop
        int[] widths = {4, 5, 6, 10};
        int[] heights = {2, 3, 4, 8};
        for(int i = 0; i < widths.length; i++) {
            System.out.println("Bonus 1: "+calcRechteck(widths[i], heights[i]));
        }

// BONUS: 2 (Anm.: Run -> Edit Config -> Program arguments: zB. 20 40
        if(args.length == 2){
            int argWidth = Integer.parseInt(args[0]);
            int argHeight = Integer.parseInt(args[1]);
            String argResult = calcRechteck(argWidth, argHeight);
            System.out.println("Bonus 2: "+argResult);
        }
    }
}
