package Proyecto01;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String npet, tpet, nomCompleto;
        int age;

        System.out.println("Ingrese nombre su completo:");
        nomCompleto = teclado.nextLine();
        System.out.println("Ingrese nombre de su mascota:");
        npet = teclado.nextLine();
        System.out.println("Ingrese el tipo de mascota:");
        tpet = teclado.nextLine();
        System.out.println("Ingrese la edad de su mascota:");
        age = teclado.nextInt();


        System.out.println(npet + " " + "es un(a)" + " " + tpet + "," + "el cual, tiene" + " " + age + " " + "años" + " " + nomCompleto + " " + "es actualmente su dueño.");

    }
}
