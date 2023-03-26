public class Metodo_Bisectriz {

    static final double N = 2;
    static final double PREC = 1e-6;

    static double f (double x){
        return x*x-N;
    }

    static double bisect (double min, double max){
        double med = (min+max)/2;
        if (max-min<PREC) {
            return med;
        } else if (f(min)*f(med)<0) {
            return bisect (min,med);
        } else {
            return bisect (med,max);
        }
    }

    static double bisectItr (double min, double max){
        double med = (min+max)/2;
        while (max-min>=PREC) {
            if (f(min)*f(med)<0) {
                max = med;
            } else {
                min = med;
            }
            med = (min+max)/2;
        }
        return med;
    }
}
