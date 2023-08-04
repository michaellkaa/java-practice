import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Já jsem papoušek, řekni něco: ");
        String vstup;
        vstup = scanner.nextLine();
        System.out.println(vstup + "," + vstup + "!");

        Scanner scanner1 = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej číslo pro zdvojnásobení: ");
        int cislo = Integer.parseInt(scanner.nextLine());
        cislo = cislo * 2;
        System.out.println(cislo);*/

        /*Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej první číslo: ");
        double cislo1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Zadejte druhé číslo: ");
        double cislo2 = Double.parseDouble(scanner.nextLine());
        double soucet = cislo1 + cislo2;
        double rozdil = cislo1 - cislo2;
        double soucin = cislo1 * cislo2;
        double podil = cislo1 / cislo2;
        System.out.println("Součet: " + soucet + " Rozdíl: " + rozdil + " Součin: " + soucin + " Podíl: " + podil);*/

        /*System.out.println("Ahoj, jak se jmenuješ?");
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        String jmeno = scanner.nextLine();
        System.out.println("Jaký/á jsi?");
        Scanner scanner1 = new Scanner(System.in, "Windows-1250");
        String vlastnost = scanner.nextLine();
        System.out.println(jmeno + " je " + vlastnost);*/

        /*System.out.println("Zadej číslo k umocnění: ");
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        int a = Integer.parseInt(scanner.nextLine());
        int umocneni;
        umocneni = a * a;
        System.out.println(umocneni);*/

        System.out.println("Zadej poloměr kruhu (cm):");
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        double r = Double.parseDouble(scanner.nextLine());
        double obvod = 2 * 3.1415 * r;
        double obsah = 3.1415 * r * r;
        System.out.println("Obvod zadaného kruhu je: " + obvod + " cm");
        System.out.println("Jeho obsah je: " + obsah + " cm2");
    }
}