// Complete the isBalanced function below.
    static String isBalanced(String s) {
        
        Stack<Character> openBracket = new Stack<Character>();
        // 'true' to start, if s == ""
        // use to break from loop, instead of having multi return statements
        boolean isBalanced = true;
        // "YES" to start, if s == ""
        String isBalancedStr = "YES";

        int i = 0;
        while (isBalanced && i < s.length()){
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                openBracket.push(s.charAt(i));
            } else if (s.charAt(i) == '}') {
                if (openBracket.isEmpty() || openBracket.pop() != '{'){
                    isBalanced = false;
                    isBalancedStr = "NO";
                }
            } else if (s.charAt(i) == ')') {
                if (openBracket.isEmpty() || openBracket.pop() != '('){
                    isBalanced = false;
                    isBalancedStr = "NO";
                }
            } else if (s.charAt(i) == ']') {
                if (openBracket.isEmpty() || openBracket.pop() != '['){
                    isBalanced = false;
                    isBalancedStr = "NO";
                }
            }
            i++;
        }
        // if open bracket is left, 's' is not balanced
        // ex. ([{}])( 
        if (!openBracket.isEmpty()){
            isBalancedStr = "NO";
        }
        return isBalancedStr;
    }