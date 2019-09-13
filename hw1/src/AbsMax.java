
public class AbsMax {
    public static void main(String[] args) {
        // TEST 1a
        int[] a1 = {1,2,5,3,4};
        if (abs_max(a1) != 5) {
            System.out.println("FAILED TEST 1a");
            System.exit(1);
        }
        // TEST 1b
        int[] a2 = {-1, 0, 1}; 
        if (abs_max(a2) != -1) {
            System.out.println("FAILED TEST 1b");
            System.exit(1);
        }
        // TEST 1c
        int[] a3 = {1, 0, -1};
        if (abs_max(a3) != 1) {
            System.out.println("FAILED TEST 1c");
            System.exit(1);
        }
        // TEST 1d
        int[] a4 = {3, -1, 5, -6};
        if (abs_max(a4) != -6) {
            System.out.println("FAILED TEST 1d");
            System.exit(1);
        }
        // TEST 1e
        int[] a5 = {-24, -38, -30, 46, 29, 34, 19, 18, 15, -37, 27, 33, 13, -17};
        if (abs_max(a5) != 46) {
            System.out.println("FAILED TEST 1e");
            System.exit(1);
        }
        
        System.out.println("Tests passed");
    }
    
    public static int abs_max(int[] arr) {
        /* Your solution here; replace the following code */
        int abs_max = 0, abs_num = 0;
        boolean abs_use = false;
        for(int i =0; i < arr.length; i++)
        {
            if (arr[i] < 0 && arr[i] != - abs_max)
            {
                abs_num = -arr[i];
                if(abs_num > abs_max)
                {
                    abs_max = abs_num;
                    abs_use = true;
                }
            }
            else
            {
                abs_num = arr[i];
                if(abs_num > abs_max)
                {
                    abs_max = abs_num;
                    abs_use = false;
                }
            }
        }
        if(abs_use)
        {
            abs_max = -abs_num;
        }
        return abs_max;
    }
}
