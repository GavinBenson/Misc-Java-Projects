package Calculate;

import java.lang.Math;

public class Model {

    public double calculate(double n1, double n2, String mathOperator) {
        switch (mathOperator) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 == 0) return 0;
                return n1 / n2;
            default:
                return 0;
        }
    }

    public double calculatePow(double n1, String mathOperator) {
        switch (mathOperator) {
            case "Square":
                return Math.pow(n1, 2);
            case "Sqrt":
                return Math.sqrt(n1);
            case "Cube":
                return Math.pow(n1, 3);
            case "Cbrt":
                return Math.cbrt(n1);
            default:
                return 0;
        }
    }



}
