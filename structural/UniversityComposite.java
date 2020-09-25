package structural;


import java.util.ArrayList;
import java.util.List;

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

class Output implements University {

    private List<University> universities = new ArrayList<University>();

    @Override
    public void choose() {
        for (University university: universities) {
            university.choose();
        }
    }

    public void add(University university) {
        this.universities.add(university);
    }

    public void clear() {
        System.out.println();
        this.universities.clear();
        System.out.println("/Universities list is empty/");
    }
}

public class UniversityComposite {

    public static void main(String[] args) {
        University kfu = new KFU();
        University msu = new MSU();
        University spbsu = new SPbSU();
        Output output = new Output();
        output.add(kfu);
        output.add(msu);
        output.add(spbsu);
        output.choose();
        output.clear();
        output.choose();
    }
}
