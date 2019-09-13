package iterators;


import java.util.Iterator;

// Iterator that only returns the first K elements from
// its input
public class Limit<T> implements Iterator<T> {
	private final int K;		//private final instance variable int K, which will carry how many elements are
									// in the limit
	private int soFar;			//private final instance variable int soFar, which sets a numeric value to the
									// end of the limit
	private final Iterator<T> input;	//private final instance variable Iterator input, which creates a new
											// interator that takes in the interator that is inputted

	public Limit(int howMany, Iterator<T> input) {
		this.K = howMany;		//sets K to the inputted howMany
		this.soFar = 0;			//sets soFar to 0 when Limit is initialized
		this.input = input;		//sets interator input to inputted input
	}	

		@Override
		public boolean hasNext() {
			return soFar < K && input.hasNext();		//returns a true/false statement when soFar's value is less
															// than K and checks to see if input has a next too
		}

		@Override
		public T next() {
			// next() should never be called if hasNext() would return false.
			// Here we purposely crash the program if this case comes up
			if (!hasNext()) throw new IllegalStateException();		//if statement to check if hasNext is false
			T result = input.next();		//sets result to the next input
			soFar++;			//adds one to soFar
			return result;		//returns result Limit
		}
	
}
