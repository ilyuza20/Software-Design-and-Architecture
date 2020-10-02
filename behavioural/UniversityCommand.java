package behavioural;

interface Command
{
    void execute();
}

class University {

    public void entered() {
        System.out.println("Documents are accepted in university! Congrats!");
    }

    public void expelled() {
        System.out.println("Documents are taken from university.");
    }
}

class EnterUniversity implements Command {

    University university;

    public EnterUniversity(University university) {
        this.university = university;
    }

    @Override
    public void execute() {
        university.entered();
    }
}

class ExpelUniversity implements Command {

    University university;

    public ExpelUniversity(University university) {
        this.university = university;
    }

    @Override
    public void execute() {
        university.expelled();
    }
}

class UniversityInvoker
{
    public Command command;

    public UniversityInvoker(Command command)
    {
        this.command = command;
    }

    public void execute()
    {
        this.command.execute();
    }
}

public class UniversityCommand {
    public static void main(String[] args) {
        University university = new University();
        EnterUniversity enterUniversity = new EnterUniversity(university);
        ExpelUniversity expelUniversity = new ExpelUniversity(university);
        UniversityInvoker universityInvoker = new UniversityInvoker(enterUniversity);
        universityInvoker.execute();
        universityInvoker = new UniversityInvoker(expelUniversity);
        universityInvoker.execute();
    }
}
