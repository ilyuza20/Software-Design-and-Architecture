package University;

public class UniversitySingleton {
    private static UniversitySingleton instance = null;
    private University university;

    private UniversitySingleton() {
        university = new KFU();
    }

    private UniversitySingleton(University university) {
        this.university = university;
    }

    public static UniversitySingleton getInstance() {
        if (instance==null) {
            instance = new UniversitySingleton();
        }
        return instance;
    }

    public void setUniversity(University university) {
        this.university = university;
        System.out.println("Set University.University");
    }

    public void output() {
        university.choose();
    }
}

interface University {
    void choose();
}

class KFU implements University {

    @Override
    public void choose() {
        System.out.println("You have chosen Kazan Federal University.University! Congrats!");
    }
}

class MSU implements University {

    @Override
    public void choose() {
        System.out.println("You have chosen Moscow State University.University! Congrats!");
    }
}

class SPbSU implements University {

    @Override
    public void choose() {
        System.out.println("You have chosen Saint Petersburg state University.University! Congrats!");
    }
}

class Test {
    public static void main(String[] args) {
        UniversitySingleton singleton = UniversitySingleton.getInstance();
        UniversitySingleton singleton1 = UniversitySingleton.getInstance();
        singleton.output();
        singleton1.output();
        singleton.setUniversity(new MSU());
        singleton.output();
        singleton1.output();
    }
}