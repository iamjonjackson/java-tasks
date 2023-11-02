public class Course {
    String code;
    String name;

    public Course() {
        code = "COM4023";
        name = "Programming Concepts";
    }

    public static void main (String []args) {
        Course newCour = new Course();
        System.out.println(newCour.code);
        System.out.println(newCour.name);
    }
}