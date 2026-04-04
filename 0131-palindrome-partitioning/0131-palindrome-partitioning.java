class Solution {
    List<List<String>> ls=new ArrayList<>();
    public boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    public void nop(String s,List<String> temp){
        if(s.length()==0){
            ls.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < s.length(); i++){
        if(isPalindrome(s.substring(0, i+1))){
            temp.add(s.substring(0, i+1));
            nop(s.substring(i+1), temp);
            temp.remove(temp.size() - 1);
        }
    }

    }
    public List<List<String>> partition(String s) {
        List<String> temp=new ArrayList<>();
        nop(s,temp);
        return ls;
    }
}