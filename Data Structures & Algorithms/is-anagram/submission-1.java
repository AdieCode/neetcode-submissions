class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() == t.length()) {

            String temp = t;
            for (char c: s.toCharArray()){

                String cs  = Character.toString(c);
                if (temp.contains(cs)){
                    int i = temp.indexOf(cs);
                    temp = new StringBuilder(temp).deleteCharAt(i).toString();
                } else {
                    return false;
                }
            }

            return temp.length() == 0;
        } 

        return false;
    }
}
