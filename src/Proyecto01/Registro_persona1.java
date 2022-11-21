package Proyecto01;
public class Registro_persona1 {
  
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una edad:");
        int age = teclado.nextInt();
        System.out.println("Ingrese una estatura:");
        int height = teclado.nextInt();

        System.out.println("Su edad es:" + " " + age + " " + " y, su estatura:" + " "+ height);

    }
}
