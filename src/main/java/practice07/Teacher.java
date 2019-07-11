package practice07;

public class Teacher extends Person {
    private Klass klass;
    private  int klassone;
    private  Student student;

    public Student getStudent() {
        return student;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int klassone) {
        super(name);
        this.klassone = klassone;
    }

    public  String introduce(){
        if(klassone!=2 || (klass.getNumber()!=2)){
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.";
    }
   public String introduceWith( Student student){
        return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";
   }


}
