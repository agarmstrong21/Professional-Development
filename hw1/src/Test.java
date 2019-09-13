public class Test {
    public static void main(String[] args) {

        int i = 3;

        int x = 1;

        int y = 2;

        while (i > 0) {

            x = star(y, i);

            y += x;

            i -= 1;

        }

        System.out.println(x);

    }

    public static int star(int x, int y) {

        return x + 2*y;

    }
}