
    static boolean isAnagram(String a, String b) {
        if(a == null || b == null || a.length() != b.length()){
            return false;
        }
        
        String strA = a.toLowerCase();
        String strB = b.toLowerCase();
        
        int[] frequency = new int[26];
        
        for(int i=0; i< strA.length();i++){
            frequency[strA.charAt(i)- 'a']++;
            frequency[strB.charAt(i)- 'a']--;
        }
        
        for(int count : frequency){
            if(count !=0){
                return false;
            }
        }
        return true;
    }
