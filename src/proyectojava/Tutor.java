
package proyectojava;

/**
 *
 * @author oscarbdev
 */
import java.util.Scanner;

public class Tutor extends Persona {
    private String tipoTutor;
    private int ru;
    private int cantNinos;
    private Nino[] n = new Nino[10];
    private int nroHijos;

    public void leer(Scanner sc) {
        super.leer(sc);
        System.out.print("Tipo de tutor: ");
        tipoTutor = sc.nextLine();
        System.out.print("RU: ");
        ru = Integer.parseInt(sc.nextLine());
        System.out.print("Numero de hijos: ");
        nroHijos = Integer.parseInt(sc.nextLine());
        System.out.print("Cantidad de ninos a cargo (max 10): ");
        cantNinos = Integer.parseInt(sc.nextLine());

        if (cantNinos > n.length) {
            cantNinos = n.length;
        }

        for (int i = 0; i < cantNinos; i++) {
            System.out.println("--- Nino " + (i + 1) + " ---");
            n[i] = new Nino();
            n[i].leer(sc);
        }
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Tipo de tutor: " + tipoTutor);
        System.out.println("RU: " + ru);
        System.out.println("Numero de hijos: " + nroHijos);
        System.out.println("Cantidad de ninos a cargo: " + cantNinos);

        for (int i = 0; i < cantNinos; i++) {
            System.out.println("--- Nino " + (i + 1) + " ---");
            n[i].mostrar();
        }
    }
}
