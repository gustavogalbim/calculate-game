package udemy.course.model;

import java.util.Random;

public class Calculate {

    private int difficulty;
    private int firstValue;
    private int secondValue;
    private int operation;
    private int result;

    public Calculate(int difficulty) {
        Random random = new Random();
        this.operation = random.nextInt(3); // 0 - soma || 1 - subtração || 2 - multiplicar
        this.difficulty = difficulty;
        if(difficulty == 1) {
            // facil
            this.firstValue = random.nextInt(10); // 0 a 9
            this.secondValue = random.nextInt(10); // 0 a 9
        } else if (difficulty == 2) {
            // medio
            this.firstValue = random.nextInt(100); // 0 a 99
            this.secondValue = random.nextInt(100); // 0 a 99
        } else if (difficulty == 3) {
            // dificil
            this.firstValue = random.nextInt(1000);
            this.secondValue = random.nextInt(1000);
        } else if (difficulty == 4) {
            // muito dificil
            this.firstValue = random.nextInt(10000);
            this.secondValue = random.nextInt(10000);
        } else {
            // insano
            this.firstValue = random.nextInt(100000);
            this.secondValue = random.nextInt(100000);
        }
    }
    public int getDifficulty() {
        return difficulty;
    }
    public int getFirstValue() {
        return firstValue;
    }
    public int getSecondValue() {
        return secondValue;
    }
    public int getOperation() {
        return operation;
    }
    public int getResult() {
        return result;
    }

    public String toString() {
        String operation;
        if(this.getOperation() == 0) {
            operation = "Somar";
        } else if (this.getOperation() == 1) {
            operation = "Subtração";
        } else if (this.getOperation() == 2) {
            operation = "Multiplicar";
        } else {
            operation = "Operação desconhecida.";
        }
        return "Valor 1: " +this.getFirstValue()+
                "\nValor 2: " +this.getSecondValue()+
                "\nDificuldade: " +this.getDifficulty()+
                "\nOperação: " +operation;
    }

    public boolean sum(int result) {
        this.result = this.getFirstValue() + this.getSecondValue();
        boolean rightResult = false;

        if(result == this.getResult()) {
            System.out.println("Resposta correta!");
            rightResult = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getFirstValue()+ " + " +this.getSecondValue()+ " = " +this.getResult());
        return rightResult;
    }

    public boolean decrease(int result) {
        this.result = this.getFirstValue() - this.getSecondValue();
        boolean rightResult = false;

        if(result == this.getResult()) {
            System.out.println("Resposta correta!");
            rightResult = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getFirstValue()+ " + " +this.getSecondValue()+ " = " +this.getResult());
        return rightResult;
    }

    public boolean multiply(int result) {
        this.result = this.getFirstValue() * this.getSecondValue();
        boolean rightResult = false;

        if(result == this.getResult()) {
            System.out.println("Resposta correta!");
            rightResult = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getFirstValue()+ " + " +this.getSecondValue()+ " = " +this.getResult());
        return rightResult;
    }

}
