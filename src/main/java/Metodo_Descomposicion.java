import java.util.function.IntBinaryOperator;

public class Metodo_Descomposicion {


    void descomposicionFactorial(int num, int div){
        if (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                descomposicionFactorial(num/div,div);
            } else {
                descomposicionFactorial(num,div+1);
            }
        }
    }

    void descomposicionFactorialItr(int num, int div){
        while (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                num = num/div;
            } else {
                div = div+1;
            }
        }
    }

    void descomposicionFactorialLambda(int num, int div){
        IntBinaryOperator division = (x, y) -> {
            int result = x / y;
            System.out.println(y);
            return result;
        };
        while (num>1) {
            if ((num%div) == 0) {
                num = division.applyAsInt(num, div);
            } else {
                div = div+1;
            }
        }
    }
}
