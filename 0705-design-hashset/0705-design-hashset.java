class MyHashSet {
    int[] val;
    public MyHashSet() {
        val=new int[10000000];
        Arrays.fill(val,-1);
    }
    
    public void add(int key) {
        int ix=key%val.length;
        val[ix]=key;
    }
    
    public void remove(int key) {
        int ix=key%val.length;
        val[ix]=-1;
    }
    
    public boolean contains(int key) {
        int ix=key%val.length;
        if(val[ix]!=-1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */