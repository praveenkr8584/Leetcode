class Solution {
    public String trimTrailingVowels(String s) {
        String sub="";
        for(int i=s.length()-1;i>=0;i--){
            char x=s.charAt(i);
            if(x!='a' && x!='e' && x!='i' && x!='o' && x!='u'){
                sub=s.substring(0,i+1);
                break;
            }
        }
        return sub;
    }
}