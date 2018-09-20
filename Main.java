public class Main {

    public static void main(String[] args) {

        double x1 = 5;
        double y1 = 2;
        double z1 = -5;
        double x2 = 4;
        double y2 = 9;
        double z2 = 2;
        double x3 = -3;
        double y3 = 2;
        double z3 = 6;

        double AB = Math.sqrt(Math.pow(z1 - z2, 2) + Math.pow(y1 - y2, 2) + Math.pow(x1 - x2,2));
        double BC = Math.sqrt(Math.pow(z2 - z3, 2) + Math.pow(y2 - y3, 2) + Math.pow(x2 - x3, 2));
        double AC = Math.sqrt(Math.pow(z1 - z3, 2) + Math.pow(y1 - y3, 2) + Math.pow(x1 - x3, 2));



        System.out.printf("The largest distance between drones is %.3f.",Math.max(Math.max(AB,AC),BC));
        System.out.println();

        System.out.printf("The shortest distance between drones is %.3f.",Math.min(Math.min(AB,AC),BC));
        System.out.println();

    }
}
