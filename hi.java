class hi{
    public static void main(String[] args) {
        Store store = new Store(10,10);
        Nampyen man = new Nampyen();

        if(store.egg > 0){
            man.milk = 6;
        }else{
            man.milk = 1;
        }

        System.out.println(man.milk);
    }
}

class Nampyen{
    int milk;
    int egg;
}

class Store{
    int milk;
    int egg;

    public Store(int milk,int egg){
        this.milk = milk;
        this.egg = egg;
    }
}