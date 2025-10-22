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
            System.out.println("Has seleccionado el tema 'Videjouegos'. Serán 5 preguntas en el orden que tu elijas. Sabrás la pregunta cuando la selecciones.");
            System.out.println("Ahora, selecciona la pregunta por la cual quieres empezar:");
            int pregunta = sc.nextInt();
            if (pregunta == 1){
                System.out.println("Pregunta 1: Cual fue el GOTY de 2022?");
                String respuestasA = "God of war Ragnarok";
                String respuestasB = "Elden Ring";
                String respuestasC = "It takes two";
                System.out.printf("a.%s \n", respuestasA);
                System.out.printf("b.%s \n", respuestasB);
                System.out.printf("c.%s \n", respuestasC);
                String respuesta = sc.nextLine();

            }
        }


    }
}
