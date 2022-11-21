package Proyecto01;

public class Pais_ciudad {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String pais, capital;

        System.out.println("Ingrese Pais:");
        pais = teclado.nextLine();
        System.out.println("Ingrese Capital:");
        capital = teclado.nextLine();

        System.out.println("El Pais" + " " + pais + "," + "tiene como capital, la ciudad de" + " " + capital);
    }
}
}
