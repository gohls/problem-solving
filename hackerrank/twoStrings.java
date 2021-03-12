    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        
        boolean hasCommonChar = false;
        Set<Character> s1_charSet = new HashSet<>();

        for (int i = 0; i < s1.length() && i < s2.length() && !hasCommonChar; i++){
            s1_charSet.add(s1.charAt(i));
            if(s1_charSet.contains(s2.charAt(i))){
                hasCommonChar = true;
            }
        }
        
        String rvHasCommon = "Default";
        if (hasCommonChar){
            rvHasCommon = "YES";
        } else {
            rvHasCommon = "NO";
        }

        return rvHasCommon;
    }