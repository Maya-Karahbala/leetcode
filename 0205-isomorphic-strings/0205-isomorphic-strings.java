class Solution {
    public boolean isIsomorphic(String s, String t) {
            HashMap<Character,Character> sMapper= new HashMap<Character, Character>();
        HashMap<Character,Character> tMapper= new HashMap<Character, Character>();
        char tChar,sChar;
        for (int i = 0; i < t.length() ; i++) {
            tChar= t.charAt(i);
            sChar= s.charAt(i);
            if((sMapper.get(sChar)!= null && !sMapper.get(sChar).equals(tChar))||
                    (tMapper.get(tChar)!= null && !tMapper.get(tChar).equals(sChar))
                    ) return  false;
            sMapper.put(sChar,tChar);
            tMapper.put(tChar,sChar);

        }
        return true;
    }
}