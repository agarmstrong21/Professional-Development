import java.util.Random;

public class VectorA {
    public final double x;
    public final double y;

    public VectorA(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // return a vector this is z added to each component (i.e., x and y) of this vector
    public VectorA scalarAdd(double z)
    {
       return new VectorA(this.x+z, this.y+z);
    }

    // return vector that is this vector plus v
    public VectorA add(VectorA v)
    {
        return new VectorA(this.x+v.x, this.y+v.y);
    }

    // return vector that is this vector minus v
    public VectorA sub(VectorA v)
    {
        return new VectorA(this.x-v.x, this.y-v.y);
    }

    // return dot product of this vector and v
    public double dot(VectorA v)
    {
        return (this.mag()*v.mag());
    }

    // return the magnitude of this vector
    public double mag()
    {
        return (Math.sqrt(this.x*this.x + this.y*this.y));
    }

    // return a vector that is the normal of this vector, i.e., same direction but magnitude=1
    public VectorA normal()
    {
        return new VectorA(this.x/this.mag(), this.y/this.mag());
    }

    // return Euclidean distance between this vector and v
    public double euclidean(VectorA v)
    {
        return (Math.sqrt(this.mag() + v.mag()));
    }

    public static void main(String[] args) {
        Random r = new Random();
        int num = 10;
        VectorA[] vectors = new VectorA[num];
        // fill the array with VectorAs with random values
        for (int i=0; i<num; i++) {
            vectors[i] = new VectorA(r.nextDouble(), r.nextDouble());
        }

        // for you to do, too: replace every VectorA in the vectors array with its normal


    }
}
