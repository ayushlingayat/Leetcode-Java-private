import java.util.ArrayList;

public class LEETCODE_705 {}

class MyHashSet {

    boolean val[];

    public MyHashSet() {
        val = new boolean[1_000_001];
    }
    
    public void add(int key) {
        val[key]=true;
    }
    
    public void remove(int key) {
        val[key]=false;
    }
    
    public boolean contains(int key) {
        return val[key];
    }
}

class MyHashSet1 {

	ArrayList<Integer> a;

    public MyHashSet1() {
        a=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!a.contains(key))
        {
            a.add(key);
        }
    }
    
    public void remove(int key) {
        int t= a.indexOf(key);

        if(t>=0) a.remove(t);
    }
    
    public boolean contains(int key) {
        return a.contains(key);
    }
}



/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */