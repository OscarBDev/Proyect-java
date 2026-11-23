
package proyectojava;

/**
 *
 * @author oscarbdev
 */
import java.util.Scanner;

public class Nino extends Persona {
    private String fechaNacimiento;
    private String edad;
    private String turno;

    public void leer(Scanner sc) {
        super.leer(sc);
        System.out.print("Fecha de nacimiento: ");
        fechaNacimiento = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextLine();
        System.out.print("Turno: ");
        turno = sc.nextLine();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Turno: " + turno);
    }
}
