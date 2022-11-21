package Proyecto01;

public class Registro_persona {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String fname, lname;

        System.out.println("Ingrese un nombre:");
        fname = teclado.nextLine();
        System.out.println("Ingrese un apellido:");
        lname = teclado.nextLine();

        System.out.println("Bienvenido"+ " " + fname + " " + lname +  " " + "al sistema...");
    }
}
