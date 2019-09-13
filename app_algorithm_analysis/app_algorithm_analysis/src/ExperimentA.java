class ExperimentA {
    final static double nanoseconds_per_second = 1e9;

    public static void main(String[] args) {
        // experiment parameters
        final int initialCapacity = 1;
        final int data = 42;
        final int startSize = 8000;
        final int endSize = 34000;
        
        
        // warm up the Java Virtual Machine and caches
        // to avoid timing anomalies
        ArrayList<Integer> list = new ArrayList<Integer>(initialCapacity);
        for (int n=0; n<10000; n++) {
            list.addA(data);
        }
        // make sure the memory gets cleaned up
        list = null;
        System.gc();



        // allocate the list we'll actually use in the experiment
        list = new ArrayList<Integer>(initialCapacity);
        
        // make the list the startSize
        for (int n=0; n<startSize; n++) {
            list.addA(data);
        }

        double cumulative_duration = 0;
        for (int n=startSize; n<endSize; n++) {
            // time one call to addA when the list is size n
            long startTime = System.nanoTime();
            list.addA(data);
            long endTime = System.nanoTime();
            long duration_in_nanoseconds = (endTime - startTime);
            double duration_in_seconds = ((double)duration_in_nanoseconds)/nanoseconds_per_second;
            cumulative_duration += duration_in_seconds;

            // print result:
            // n,measurement
            System.out.println(n + "," + cumulative_duration); 

            // occasionally run garbage collector
            if (n % 100 == 0) System.gc();
        }
    }
}

