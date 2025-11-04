import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Te damos la bienvenida a esta ronda de preguntas rápidas. ");
        System.out.println("Constará de 3 preguntas relacionadas al tema que elijas. Ahora, selecciona el tema de las preguntas:");
        System.out.println("1: Videojuegos");
        System.out.println("2: Peliculas");
        int seleccion = sc.nextInt();
        int respuesta;
        int pregunta2;

        while (seleccion < 1 || seleccion > 2) {
            System.out.println("Selección no válida, intentelo de nuevo.");
            seleccion = sc.nextInt();
            if ((seleccion == 1) || (seleccion == 2)) {
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
            if (pregunta == 1) {
                System.out.println(preguntas[0]);
                System.out.println("1. God of War Ragnarok");
                System.out.println("2. Elden ring");
                System.out.println("3. It Takes two");

                respuesta = sc.nextInt();

                if (respuesta == 2) {
                    System.out.println("Correcto, seleccione siguiente pregunta");
                } else {
                    System.out.println("Incorrecto, seleccione la siguiente pregunta");
                }
                pregunta2 = sc.nextInt();
                while (pregunta2 == 1) {
                    System.out.println("Pregunta ya seleccionada, por favor seleccione otra");
                    pregunta2 = sc.nextInt();
                    if ((pregunta2 == 2) || pregunta2 == 3); {
                        break;
                    }
                }
                while ((pregunta2 < 1) || (pregunta2 > 3)) {
                    System.out.println("Selección no válida, intentelo de nuevo");
                    pregunta2 = sc.nextInt();
                    if ((pregunta2 == 2) || (pregunta2 == 3));
                }
                if (pregunta2 == 2) {
                    System.out.println(preguntas [1]);
                    System.out.println("a. 2004");
                    System.out.println("b. 2005");
                    System.out.println("c. 2008");
                    String respuesta2 = sc.nextLine();
                    if (respuesta2.equals("a")) {
                        System.out.println("Correcto, aunque en Europa se estrenó en 2005, su lanzamiento original fue en 2004 en Japón y EEUU");
                        System.out.println("Pasemos a la ultima pregunta");
                    } else {
                        System.out.println("Incorrecto, contiuemos con la ultima pregunt");
                    }
                    System.out.println(preguntas[2]);
                    System.out.println("a. Steam");
                    System.out.println("b. Epic Games Launcher");
                    System.out.println("c. Ubisoft Connect");
                    String respuesta3 = sc.nextLine();
                    if (respuesta3.equals("a")) {
                        System.out.println("Correcto! Has finalizado el cuestionario, ahora pasaremos al recuento de tus preguntas correctas");
                    } else {
                        System.out.println("Incorrecto. Ahora pasemos al recuento de preguntas correctas");
                    }
                }
                if (pregunta2 == 3) {
                    System.out.println(preguntas[2]);
                    System.out.println("a. Steam");
                    System.out.println("b. Epic Games Launcher");
                    System.out.println("c. Ubisoft Connect");
                    String respuesta3 = sc.nextLine();
                    if (respuesta3.equals("a")) {
                        System.out.println("Correcto! Pasemos con la ultima pregunta");
                    } else {
                        System.out.println("Incorrecto. Pasemos con la ultima pregunta");
                    }
                    System.out.println(preguntas [1]);
                    System.out.println("a. 2004");
                    System.out.println("b. 2005");
                    System.out.println("c. 2008");
                    String respuesta2 = sc.nextLine();
                    if (respuesta2.equals("a")) {
                        System.out.println("Correcto, aunque en Europa se estrenó en 2005, su lanzamiento original fue en 2004 en Japón y EEUU." +
                                           "Ahora continuemos con el recuento de preguntas acertadas.");
                    } else {
                        System.out.println("Incorrecto. Continuemos con el recuento de preguntas");
                    }
                }
            }
        }


    }
}
