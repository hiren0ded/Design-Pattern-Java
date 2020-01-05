package builder;

public class Main {
    public static void main(String[] args) {
        Student.StudentBuilder builder1 = new Student.StudentBuilder("ABC");
        Student student1 = builder1.build();
        System.out.println(student1);

        Student.StudentBuilder builder2 = new Student.StudentBuilder("ABC");
        Student student2 = builder2.address("Gujarat")
                                   .telephoneNumber("1234567890")
                                   .build();

        Student student3 = builder2.address("Mumbai")
                                   .build();
        System.out.println(student3);




    }
}
