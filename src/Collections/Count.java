package Collections;

public class Count {
    public int val;

    public Count(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object c){
        if(this == c) return true;
        if(c == null || getClass() != c.getClass()) return false;
        Count count = (Count) c;
        return val== count.val;
    }
}
