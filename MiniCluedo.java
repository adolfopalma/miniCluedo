import java.util.*;

public class MiniCluedo {
    public static void main(String[] args) throws Exception {
        String armas[] = new String[5];
        String habitaciones[] = new String[6];
        String personajes[] = new String[8];
        String combinacionSecreta[] = new String[3];
        boolean esElArma = false;
        boolean esLaHabitacion = false;
        boolean esElPersonaje = false;
        Scanner entrada = new Scanner(System.in);
        String respuesta;

        armas[0] = "Pistola";
        armas[1] = "Cuchillo";
        armas[2] = "Herramienta";
        armas[3] = "Candelabro";
        armas[4] = "Lapiz";

        habitaciones[0] = "Salon de baile";
        habitaciones[1] = "Cocina";
        habitaciones[2] = "Aseo";
        habitaciones[3] = "Despacho";
        habitaciones[4] = "Dormitorio";
        habitaciones[5] = "Salon de billar";

        personajes[0] = "Adolfo";
        personajes[1] = "Sergio";
        personajes[2] = "Ines";
        personajes[3] = "Feli";
        personajes[4] = "Pablo";
        personajes[5] = "Adriana";
        personajes[6] = "Leire";
        personajes[7] = "Uriel";

        combinacionSecreta[0] = armas[(int) (Math.random() * 5)];
        combinacionSecreta[1] = habitaciones[(int) (Math.random() * 6)];
        combinacionSecreta[2] = personajes[(int) (Math.random() * 8)];

        System.out.println(Arrays.toString(combinacionSecreta));

        while (esElArma == false) {
            System.out.println("Adivina el arma, aun no has dicho las siguientes:");
            System.out.println(Arrays.toString(armas));

            respuesta = entrada.nextLine();
            if (respuesta.equals(combinacionSecreta[0])) {
                System.out.println("Has acertado");
                esElArma = true;
            } else {
                for (int i = 0; i < armas.length; i++) {
                    if (respuesta.equals(armas[i])) {
                        armas[i] = "X";
                    }
                }
            }
        }
        while (esLaHabitacion == false) {
            System.out.println("Adivina la habitacion, aun no has dicho las siguientes:");
            System.out.println(Arrays.toString(habitaciones));

            respuesta = entrada.nextLine();
            if (respuesta.equals(combinacionSecreta[1])) {
                System.out.println("Has acertado");
                esLaHabitacion = true;
            } else {
                for (int i = 0; i < habitaciones.length; i++) {
                    if (respuesta.equals(habitaciones[i])) {
                        habitaciones[i] = "X";
                    }
                }
            }
        }
        while (esElPersonaje == false) {
            System.out.println("Adivina el asesino, aun no has dicho los siguientes:");
            System.out.println(Arrays.toString(personajes));

            respuesta = entrada.nextLine();
            if (respuesta.equals(combinacionSecreta[2])) {
                System.out.println("Has acertado y ganado el juego !!!!!!!!!");
                esElPersonaje = true;
            } else {
                for (int i = 0; i < personajes.length; i++) {
                    if (respuesta.equals(personajes[i])) {
                        personajes[i] = "X";
                    }
                }
            }
        }
    }
}