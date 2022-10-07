public class Challenge {
    public static void main(String[] args) {
        System.out.println("Final:" + sumDigProd(6,6,6,6));
    }

    public static double sumDigProd(int... args) {
        int s = 0;
        double prod = 1;

        for (int arg : args) {
            s += arg;
        }
        System.out.println("ini sum:" + s);
        if (s > 0) {
            for (int i=1; i<=String.valueOf(s).length(); i++) {
                double val = Math.pow(10, 1);
                System.out.println("val:" + val);
                prod *= (s%val);

                s /= 10;
                System.out.println("s after div:" + s);
                s = (int) s;
                System.out.println("s no dec:" +s);
                System.out.println("product:" + prod);

            }
            return prod;
        }
        return prod;
    }
}
