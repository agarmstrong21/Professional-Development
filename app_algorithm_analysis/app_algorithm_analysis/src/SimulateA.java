
class SimulateA {
    public static void main(String[] args) {
        // initialize cumulative steps to 0
        long cumulative_steps = 0;

        // initially ArrayList's internal array is size 1
        long arraysize = 1;
        for (long n=0; n<1000; n++) { 
            if (n > arraysize) {
                // simulated array is full so...
                // n steps to resize to new array of size n+1
                cumulative_steps += n;
                // new array has +1 size
                arraysize += 1;
            }

            // 1 step to place the new element into the array
            cumulative_steps += 1;
            
            System.out.println(n+","+cumulative_steps);
        }
    }
}
