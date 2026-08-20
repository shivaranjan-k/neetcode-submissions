class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;
          char ch1[] = s.toCharArray();
          char ch2[] = t.toCharArray();
          Arrays.sort(ch1);
          Arrays.sort(ch2);
           s = "";
           t = "" ;
          for(int i = 0;i < ch1.length;i++){
             s += ch1[i];
             t += ch2[i];
          }
          return s.equals(t);
    }
}
