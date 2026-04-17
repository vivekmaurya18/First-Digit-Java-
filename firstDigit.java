public class firstDigit {

    static int getFirstDigit(int n) {
        if (n < 10) {
            return n;
        }
        return getFirstDigit(n / 10);
    }

    public static void main(String[] args) {
        int result = getFirstDigit(976);
        System.out.println("First digit: " + result);
    }
}