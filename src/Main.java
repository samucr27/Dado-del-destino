import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Random ale = new Random();
        int vidas = 5;
        int pts = 0;
        int min = 1;
        int rondas = ale.nextInt(min + 1);

        System.out.println("Bienvenido al dado del destino");

        System.out.println("Reglas del dado:");
        System.out.println("Si sale 1: Se pierde 1 vida");
        System.out.println("Si sale 2 o 4: Se consigue 1 punto");
        System.out.println("Si sale 3 o 5: No pasa nada");
        System.out.println("Si sale 6: Se consiguen 3 puntos");

        while (vidas > 0 && pts <= 10){
            int dado = ale.nextInt(6) + 1;
            System.out.println("Rondas: " + rondas);
                rondas++;
            System.out.println("Cara del dado: " + dado);
            System.out.println("Tus puntos son:" + pts);
            System.out.println("Tus vidas son: "+vidas);

            switch (dado){
                case 1:
                    vidas--;
                    System.out.println("Perdiste una vida, tus vidas son: "+ vidas);
                    break;
                case 2:
                    pts++;
                    System.out.println("Ganaste 1 punto, tus puntos son: "+ pts);
                    break;
                case 4:
                    pts++;
                    System.out.println("Ganaste 1 punto, tus puntos son: "+ pts);
                    break;
                case 3:
                    System.out.println("No pasa nada");
                    break;
                case 5:
                    System.out.println("No pasa nada");
                    break;
                case 6:
                    pts +=3;
                    System.out.println("Ganaste 3 puntos, tus puntos son: "+ pts);
                    break;
            }
        }
        System.out.println("Acabo el juego");
        if (vidas == 0){
            System.out.println("Te quedaste sin vidas");
            System.out.println("Rondas totales: "+ rondas);
        } else {
            System.out.println("Obtuviste "+ pts +" puntos");
            System.out.println("Rondas totales: "+ rondas);
        }

    }
}