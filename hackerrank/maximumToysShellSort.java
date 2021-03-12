// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k){
        // shell sort
        int n = prices.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i += 1){
                int temp = prices[i];
                // shift earlier gap-sorted elements up until the correct location
                // for prices[i] is found
                int j;
                for (j = i; j >= gap && prices[j - gap] > temp; j -= gap){
                    prices[j] = prices[j - gap];
                }
                prices[j] = temp;
            }
        }

        // ---- prices array sorted! ----

        int spent = 0;
        int maxToys = 0;
        int i = 0;
        
        // k == budget
        // while the amount spent is less or equal to budget, add toy to 'maxToys' count
        while ((spent += prices[i]) <= k && i < prices.length){
            maxToys++;
            i++;
        }    
        return maxToys;
    }
