package structural;

import java.util.Calendar;

interface Univer {
    void entered();
    void expelled();
}

class Deanery implements Univer {

    @Override
    public void entered() {
        System.out.println("Documents are accepted in deanery.");
    }

    @Override
    public void expelled() {
        System.out.println("Documents are taken from deanery.");
    }
}

class CampusDorm implements Univer {

    @Override
    public void entered() {
        System.out.println("Documents are accepted in campus dorm.");
    }

    @Override
    public void expelled() {
        System.out.println("Documents are taken from campus dorm.");
    }
}

class FreeClinic implements Univer {

    @Override
    public void entered() {
        System.out.println("Documents are accepted in free clinic.");
    }

    @Override
    public void expelled() {
        System.out.println("Documents are taken from free clinic.");
    }
}

class Facade1 {

    private Deanery deanery;
    private CampusDorm campusDorm;
    private FreeClinic freeClinic;

    public Facade1() {
        deanery = new Deanery();
        campusDorm = new CampusDorm();
        freeClinic = new FreeClinic();
    }

    public void enterStudent() {
        deanery.entered();
        campusDorm.entered();
        freeClinic.entered();
        System.out.println("Student is accepted successfully.");
    }

    public void expelStudent() {
        deanery.expelled();
        campusDorm.expelled();
        freeClinic.expelled();
        System.out.println("Student is expelled successfully.");
    }

}

public class UniversityFacade {
    public static void main(String[] args) {
        Facade1 facade1 = new Facade1();
        facade1.enterStudent();
        System.out.println();
        facade1.expelStudent();
    }
}
