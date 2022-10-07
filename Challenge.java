public class Challenge {
    public static void main(String[] args) {
        System.out.println("P:" + sumDigProd(1, 2, 3, 4, 1,7,3,8,1,4,6,234));
    }

    public static double sumDigProd(int... args) {
        int s = 0;
        double prod = 1;
        for (int arg : args) {
            s += arg;
        }
        System.out.println(s);
        for (int i=1; i<=String.valueOf(s).length(); i++) {
            double val = Math.pow(10, i);
            if (val >= 10) {
                s /= Math.pow(10, i);
            }
            System.out.println(val);
            prod *= (s%val);
        }
        return prod;
    }
}
