package udemy.course.view;

import udemy.course.model.Calculate;

import java.util.Scanner;

public class Game {

    public static Scanner scanner = new Scanner(System.in);
    public static int score = 0;
    public static Calculate calculate;

    public static void main(String[] args) {
            Game.play();
    }
    public static void play() {
        System.out.println("Informe o nivel de dificuldade [1, 2, 3, ou 4]: ");
        int level = Game.scanner.nextInt();

        Game.calculate = new Calculate(level);

        if(calculate.getOperation() == 0) {
            System.out.println("Informe o resultado dessa operação " +calculate.getFirstValue()+ " + " + calculate.getSecondValue());
            int result = Game.scanner.nextInt();
            if (calculate.sum(result)) {
                Game.score += 1;
                System.out.println("Voce tem agora " +score+ " pontos");
            }
        } else if(calculate.getOperation() == 1) {
            System.out.println("Informe o resultado dessa operação " +calculate.getFirstValue()+ " + " + calculate.getSecondValue());
            int result = Game.scanner.nextInt();
            if (calculate.sum(result)) {
                Game.score += 1;
                System.out.println("Voce tem agora " +score+ " pontos");
            }
        } else if(calculate.getOperation() == 2) {
            System.out.println("Informe o resultado dessa operação " +calculate.getFirstValue()+ " + " + calculate.getSecondValue());
            int result = Game.scanner.nextInt();
            if (calculate.sum(result)) {
                Game.score += 1;
                System.out.println("Voce tem agora " +score+ " pontos");
            }
        } else {
            System.out.println("A operação " +calculate.getOperation()+ " é desconhecida.");
        }
        System.out.println("Deseja continuar? [1 - sim][2 - não]");
        int play = Game.scanner.nextInt();
        if(play == 1) {
            Game.play();
        } else {
            System.out.println("Voce fez " +Game.score+ " pontos.");
            System.out.println("Até a proxima!");
            System.exit(0);
        }
    }
}
