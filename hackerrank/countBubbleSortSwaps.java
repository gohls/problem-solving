// Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int swaps = 0;
        int tmp;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    swaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }