package builder;

//outer class is immutable class
//once it's build we can't change any property
public final class Student {

    //Make Private so that we can't modify, after object is created
    //don't provide setter method
    private final String name;
    private final int rollNumber;
    private final String address;
    private final String telephoneNumber; //optional
    private final String linkedinID; //optional


    static class StudentBuilder {
        private String name;
        private int rollNumber;
        private String address;
        private String telephoneNumber; //optional
        private String linkedinID; //optional

        StudentBuilder(String name){
            this.name = name;
        }

        public Student build(){
            return new Student(this);
        }

        //Provide 'Chaining' Feature
        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder rollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder telephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public StudentBuilder linkedinID(String linkedinID) {
            this.linkedinID = linkedinID;
            return this;
        }
    }

    Student(StudentBuilder obj){
        this.name = obj.name;
        this.address = obj.address;
        this.rollNumber = obj.rollNumber;
        this.linkedinID = obj.linkedinID;
        this.telephoneNumber = obj.telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getLinkedinID() {
        return linkedinID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", linkedinID='" + linkedinID + '\'' +
                '}';
    }
}
