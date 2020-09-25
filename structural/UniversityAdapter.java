package structural;

class KFU {

    public void chooseKFU() {
        System.out.println("You have chosen Kazan Federal University.University! Congrats!");
    }
}

class MSU {

    public void chooseMSU() {
        System.out.println("You have chosen Moscow State University.University! Congrats!");
    }
}

class SPbSU {

    public void chooseSPbSU() {
        System.out.println("You have chosen Saint Petersburg state University.University! Congrats!");
    }
}

class KFUAdapter extends KFU {
    private MSU msu;

    public KFUAdapter (MSU msu) {
        this.msu = msu;
    }

    public void chooseKFU() {
        msc.chooseMSU();
    }
}

public class UniversityAdapter {
    public static void main(String[] args) {
        KFU kfu = new KFU();
        kfu.chooseKFU();
        KFU msu = new KFUAdapter(new MSU());
        msu.chooseKFU();
    }
}
