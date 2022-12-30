class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())return false;
        char sChar;
        for (int i = 0; i <s.length() ; i++) {
            sChar= s.charAt(i);
            if (!t.contains(String.valueOf(sChar))) return false;
                t= t.substring(t.indexOf(sChar)+1);
        }
          return true;
    }
}