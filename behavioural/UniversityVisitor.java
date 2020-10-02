package behavioural;

interface Visitor {
    void visit(TopUniversities topUniversities);
    void visit(Kfu kfu);
    void visit(Msu msu);
    void visit(Spbsu spbsu);
}

interface Univer {
    void accept(Visitor visitor);
}

class Kfu implements Univer {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Msu implements Univer {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Spbsu implements Univer {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class TopUniversities implements Univer{

    Univer[] universities;

    public TopUniversities() {
        universities = new Univer[]{new Msu(), new Spbsu(), new Kfu()};
    }


    public void accept(Visitor visitor) {

        for (int i = 0; i < universities.length; i++) {
            universities[i].accept(visitor);
        }
        visitor.visit(this);
    }
}

class UniversityVisitor implements Visitor {
    @Override
    public void visit(TopUniversities topUniversities) {
        System.out.println("This is list of top-universities.");
    }

    @Override
    public void visit(Kfu kfu) {
        System.out.println("You have chosen Kazan Federal University! Congrats!");
    }

    @Override
    public void visit(Msu msu) {
        System.out.println("You have chosen Moscow State University! Congrats!");
    }

    @Override
    public void visit(Spbsu spbsu) {
        System.out.println("You have chosen Saint Petersburg state University! Congrats!");
    }
}

class UniversityVisitorTest {
    public static void main(String[] args) {
        Univer universities = new TopUniversities();
        universities.accept(new UniversityVisitor());
    }
}
