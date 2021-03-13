// Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money. Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.

// Note Each toy can be purchased only once.

// Example


// The budget is  units of currency. He can buy items that cost  for , or  for  units. The maximum is  items.

// Function Description

// Complete the function maximumToys in the editor below.

// maximumToys has the following parameter(s):

// int prices[n]: the toy prices
// int k: Mark's budget
// Returns

// int: the maximum number of toys
// Input Format

// The first line contains two integers,  and , the number of priced toys and the amount Mark has to spend.
// The next line contains  space-separated integers 

// Constraints




// A toy can't be bought multiple times.

// Sample Input

// 7 50
// 1 12 5 111 200 1000 10
// Sample Output

// 4
// Explanation

// He can buy only  toys at most. These toys have the following prices: .



/******************************************************************************/

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
