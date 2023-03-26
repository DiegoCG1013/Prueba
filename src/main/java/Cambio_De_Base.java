import java.util.function.IntUnaryOperator;

public class Cambio_De_Base {
    public static String decimalToBase(int decimal, int base) {
        if (decimal == 0) {
            return "0";
        }

        /*char[] digits = new char[32];
        int i = 0;
        IntUnaryOperator toBase = (n) -> {
            if (n == 0) {
                return i;
            }
            int remainder = n % base;
            if (remainder < 10) {
                digits[i++] = (char)('0' + remainder);
            } else {
                digits[i++] = (char)('A' + remainder - 10);
            }
            return toBase.applyAsInt(n / base);
        };

        int end = toBase.applyAsInt(decimal);
        char[] result = new char[end];
        for (int j = 0; j < end; j++) {
            result[j] = digits[end - j - 1];
        }

        return new String(result);*/
    }
}
