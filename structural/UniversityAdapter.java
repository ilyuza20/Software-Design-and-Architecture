package structural;

class Kzn {

    public void chooseKzn() {
        System.out.println("You have chosen Kazan Federal University.University! Congrats!");
    }
}

class Msc {

    public void chooseMsc() {
        System.out.println("You have chosen Moscow State University.University! Congrats!");
    }
}

class SPb {

    public void chooseSPb() {
        System.out.println("You have chosen Saint Petersburg state University.University! Congrats!");
    }
}

class KznAdapter extends Kzn {
    private Msc msc;

    public KznAdapter (Msc msc) {
        this.msc = msc;
    }

    public void chooseKzn() {
        msc.chooseMsc();
    }
}

public class UniversityAdapter {
    public static void main(String[] args) {
        Kzn kfu = new Kzn();
        kfu.chooseKzn();
        Kzn msu = new KznAdapter(new Msc());
        msu.chooseKzn();
    }
}
