import java.util.function.IntBinaryOperator;

public class MCD {

    int mcdEuclidesRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcdEuclidesRecursivo(b, a % b);
        }
    }

    int mcdEuclidesIterativo(int a, int b) {
        while (b!= 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }

    /*static int mcdEuclidesLambda(int x, int y) {
        IntBinaryOperator mcd = null;
        mcd = (a, b) -> b == 0 ? a : mcd.applyAsInt(b, a % b);
        return mcd.applyAsInt(x, y);
    }*/
}
