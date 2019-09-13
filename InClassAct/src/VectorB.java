import java.util.Random;

public class VectorB {
    private double x;
    private double y;

    public VectorB(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return  x;
    }

    public double getY() {
        return y;
    }

    // add z to each component (i.e., x and y) of this vector
    public void scalarAdd(double z) {
        x += z;
        y +=z;
    }

    // add v to this vector
    public void add(VectorB v) {

        this.x += v.getX();
        this.y += v.getY();
    }

    // subtract v from this vector
    public void sub(VectorB v) {

        this.x -= v.getX();
        this.y -= v.getY();
    }

    // return dot product of this vector and v
    public double dot(VectorB v) {

        return this.x * v.getX() + this.y * v.getY();
    }

    // return the magnitude of this vector
    public double mag() {

        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y, 2));
    }

    // normalize this vector, i.e., same direction but magnitude=1
    public void normal() {

        this.x /= this.mag();
        this.y /= this.mag();
    }

    // return Euclidean distance between this vector and v
    public double euclidean(VectorB v) {
        return Math.sqrt(Math.pow(v.getX() - this.x, 2) + Math.pow(v.getY() - this.y, 2));
    }

    public static void main(String[] args) {
        Random r = new Random();
        int num = 10;
        VectorB[] vectors = new VectorB[num];
        // fill the array with VectorBs with random values
        for (int i=0; i<num; i++) {
            vectors[i] = new VectorB(r.nextDouble(), r.nextDouble());
        }

        // for you to do, too: normalize every VectorB in the vectors array
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].normal();
        }


    }
}
