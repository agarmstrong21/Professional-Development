public class Square{
    int sideLength;

    Square(int sideLength) {
        this.sideLength = sideLength;
    }
    public int getSideLength() {
        return sideLength;
    }

    public static void main(String args[]) {
        Square s1 = new Square(5);
        System.out.println("The side length is "+s1.getSideLength());
    }
}