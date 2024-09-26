public class Teacher extends Person {
    String subject;

    public Teacher() {
        super();
        String subject = "";

    }

    public Teacher(String subject) {
        this.subject = "subject";
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}