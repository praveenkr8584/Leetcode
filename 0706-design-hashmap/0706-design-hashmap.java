class MyHashMap {
    int[] key_t;
    int[] value_t;
    public MyHashMap() {
        key_t=new int[1000000];
        value_t=new int[1000000];
        Arrays.fill(key_t,-1);
        Arrays.fill(value_t,-1);
    }
    
    public void put(int key, int value) {
        int ix=key%key_t.length;
        key_t[ix]=key;
        value_t[ix]=value;
    }
    
    public int get(int key) {
        int ix=key%key_t.length;
        if(value_t[ix]!=-1){
            return value_t[ix];
        }else{
            return -1;
        }
    }
    
    public void remove(int key) {
        int ix=key%key_t.length;
        if(key_t[ix]!=-1){
            key_t[ix]=-1;
            value_t[ix]=-1;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */