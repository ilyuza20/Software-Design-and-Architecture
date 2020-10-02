package behavioural;

interface Handler {
    void setNext(Handler handler);
    void enter();
}

class Deanery implements Handler {

    private Handler handler;

    @Override
    public void setNext(Handler handler) {

    }

    @Override
    public void enter() {
        System.out.println("Documents are accepted in deanery.");
        if (handler != null)
            handler.enter();
    }
}

class CampusDorm implements Handler {

    private Handler handler;

    @Override
    public void setNext(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void enter() {
        System.out.println("Documents are accepted in campus dorm.");
        if (handler != null)
            handler.enter();
    }
}

class FreeClinic implements Handler {

    private Handler handler;

    @Override
    public void setNext(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void enter() {
        System.out.println("Documents are accepted in free clinic.");
        if (handler != null)
            handler.enter();
    }
}

public class UniversityChainOfResponsibility {
    public static void main(String[] args) {
        Handler deanery = new Deanery();
        Handler campusDorm = new CampusDorm();
        Handler freeClinic = new FreeClinic();
        deanery.setNext(campusDorm);
        deanery.enter();
        campusDorm.setNext(freeClinic);
        campusDorm.enter();

    }
}
