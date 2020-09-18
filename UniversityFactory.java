public class UniversityFactory {
    public University chooseUniversity(Names name) {
        University university = null;
        if (name.equals(Names.KFU)) {
            university = new KFU();
        } else if (name.equals(Names.MSU)) {
            university = new MSU();
        } else if (name.equals(Names.SPbSU)) {
            university = new SPbSU();
        }
        return university;
    }
}

interface University {
    void choose();
}

enum Names {
    KFU,
    MSU,
    SPbSU
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
        UniversityFactory universityFactory = new UniversityFactory();
        University university = universityFactory.chooseUniversity(Names.KFU);
        university.choose();
    }
}
