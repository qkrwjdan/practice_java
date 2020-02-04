import java.util.HashSet;
import java.util.Set;

class HashSetEqualityOne{
    public static void main(String[] args) {
        Set<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(7799));
        set.add(new Num(779129));

        System.out.println("인스턴스 수 : " + set.size());
        for(Num n : set)
            System.out.println(n);
        System.out.println();
    }
}

class Num{
    private int num;
    public Num(int n){num = n;}

    @Override
    public String toString(){
        return String.valueOf(num);
    }

    @Override
    public int hashCode(){
        return num % 3;
    }

    @Override
    public boolean equals(Object n){
        if(this.num == ((Num)n).num)
            return true;
        else
            return false;
    }
}