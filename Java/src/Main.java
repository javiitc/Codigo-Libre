import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Te damos la bienvenida a esta ronda de preguntas rápidas. ");
        System.out.println("Constará de 5 preguntas relacionadas al tema que elijas. Ahora, selecciona el tema de las preguntas:");
        System.out.println("1: Videojuegos");
        System.out.println("2: Peliculas");
        System.out.println("3: Cultura general");
        System.out.println("4: Musica");
        int seleccion = sc.nextInt();

        if ((seleccion > 4) || (seleccion < 1)){
            System.out.println("Selección no válida, intentelo de nuevo.");
        }

        if (seleccion == 1) {

        }


    }
}
