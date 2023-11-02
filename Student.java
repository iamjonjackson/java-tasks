public class Student {
    int id;
    String name;
    Course course;

    public Student(Course course) {
        id = 65;
        name = "Jon";
        this.course = course;

    }

    public static void main(String[] args) {
        Course newCour = new Course(); // create a new Course object
        Student newStud = new Student(newCour); // pass Course object to Student constructor
        System.out.println(newStud.id);
        System.out.println(newStud.name);
        Student stude = new Student(newCour);
        stude.id = 67;
        stude.name = "Kylie";
        System.out.println(stude.id);
        System.out.println(stude.name);

    }

    public static void enroll (String []args) {

    }

}

