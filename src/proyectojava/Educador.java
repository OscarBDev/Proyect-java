
package proyectojava;

/**
 *
 * @author oscarbdev
 */
import java.util.Scanner;

public class Educador extends Empleado {
    private String sala;
    private String turno;
    private String horario;

 
    public void leer(Scanner sc) {
        super.leer(sc);
        System.out.print("Sala: ");
        sala = sc.nextLine();
        System.out.print("Turno: ");
        turno = sc.nextLine();
        System.out.print("Horario: ");
        horario = sc.nextLine();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Sala: " + sala);
        System.out.println("Turno: " + turno);
        System.out.println("Horario: " + horario);
    }
}

