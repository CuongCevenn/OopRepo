public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        double r = Math.random();

        int n = (int) (r * N);

        System.out.println("Your random integer is: " + n);
    }
}
