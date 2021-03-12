	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
        // leaf/root case
        if(root == null){
            // return -1 since single node tree count is zero 
            return -1;
        } 
        // recursion to right and left leafs, counting height
        int left = height(root.left);
        int right = height(root.right);
        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }