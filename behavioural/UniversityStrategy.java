package behavioural;

interface Strategy {
    void choose();
}

class KFU implements Strategy {

    @Override
    public void choose() {
        System.out.println("You have chosen Kazan Federal University.University! Congrats!");
    }
}

class MSU implements Strategy {

    @Override
    public void choose() {
        System.out.println("You have chosen Moscow State University.University! Congrats!");
    }
}

class SPbSU implements Strategy {

    @Override
    public void choose() {
        System.out.println("You have chosen Saint Petersburg state University.University! Congrats!");
    }
}

class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void choose()
    {
        strategy.choose();
    }
}

public class UniversityStrategy {
    public static void main(String[] args) {
        Context context = new Context(new MSU());
        context.choose();
        context = new Context(new KFU());
        context.choose();
    }
}
