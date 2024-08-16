package Calculator;

public class ArithmeticCalculator {
    int num1;
    int num2;

    public ArithmeticCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calculate(Operation action) {
        if (action == Operation.ADD) {
            return num1 + num2;
        } else if (action == Operation.SUBTRACT) {
            return num1 - num2;
        } else if (action == Operation.MULTIPLY) {
            return num1 * num2;
        } else if (action == Operation.DIVIDE) {
            return num2 == 0 ? 0 : ((double) num1 / num2);
        } else{
            return -0;
        }
    }


}
