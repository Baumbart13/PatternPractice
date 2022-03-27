package at.htlinn;

public class Kaffeevollautomat {
    public static IKaffee Schwarz(){
        IKaffee kaffee = new Kaffeesatz();
        kaffee = new Wasser(kaffee);
        return kaffee;
    }

    public static IKaffee Cappuccino(){
        IKaffee kaffee = new Kaffeesatz();
        kaffee = new Wasser(kaffee);
        kaffee = new Milch(kaffee);
        return kaffee;
    }

    public static IKaffee LatteMacchiato(){
        IKaffee kaffee = new Kaffeesatz();
        kaffee = new Wasser(kaffee);
        kaffee = new Milch(kaffee);
        kaffee = new Zucker(kaffee);
        return kaffee;
    }

    public static IKaffee Espresso(){
        IKaffee kaffee = new Kaffeesatz();
        kaffee = new Kaffeesatz(kaffee);
        kaffee = new Wasser(kaffee);
        return kaffee;
    }

    public static IKaffee Mocha(){
        IKaffee kaffee = new Kaffeesatz();
        kaffee = new Wasser(kaffee);
        kaffee = new Milch(kaffee);
        kaffee = new Zucker(kaffee);
        kaffee = new Zucker(kaffee);
        return kaffee;
    }
}
