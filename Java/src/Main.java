import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Te damos la bienvenida a esta ronda de preguntas rápidas. ");
        System.out.println("Constará de 5 preguntas relacionadas al tema que elijas. Ahora, selecciona el tema de las preguntas:");
        System.out.println("1: Videojuegos");
        System.out.println("2: Peliculas");
        System.out.println("3: Cultura general");
        System.out.println("4: Deportes");
        int seleccion = sc.nextInt();

        while ((seleccion > 4) || (seleccion < 1)) {
            System.out.println("Selección no válida, intentelo de nuevo.");
            int seleccion2 = sc.nextInt();
            if ((seleccion2 == 1) || (seleccion2 == 2) || (seleccion2 == 3) || seleccion2 == 4) {
                break;
            }
        }

        if (seleccion == 1) {
            System.out.println("Has seleccionado el tema 'Videjouegos'. Serán 3 preguntas, en el orden que elijas. Sabrás la pregunta cuando la selecciones.");
            System.out.println("Ahora, selecciona la pregunta por la cual quieres empezar:");
            String [] preguntas = {"Que videojuego ganó el GOTY en el 2022?",
                                   "En qué año salió a la venta la nintendo DS?",
                                   "Que plataforma de videojuegos es la más usada en PC?"};
            int pregunta = sc.nextInt();
            if (pregunta == 1){
                System.out.println(preguntas[0]);
                String respuesta = sc.nextLine();
                if (respuesta.equals("b")){
                    System.out.println("Correcto, seleccione siguiente pregunta");
                    else {
                        System.out.println("Incorrecto, seleccione la siguiente pregunta");
                    }
                }
                int pregunta2 = sc.nextInt();
                while (pregunta2 == 1) {
                    System.out.println("Pregunta ya seleccionada, por favor seleccione otra");
                    if ((pregunta2 == 2) || pregunta2 == 3); {
                        break;
                    }
                }
                while ((pregunta2 < 1) || (pregunta2 > 3)) {
                    System.out.println("Selección no válida, intentelo de nuevo");
                    if ((pregunta2 == 2) || (pregunta2 == 3));
                }
                if (pregunta2 == 2) {
                    System.out.println(preguntas [1]);
                    String respuesta3 = sc.nextLine();
                }
            }
        }


    }
}
