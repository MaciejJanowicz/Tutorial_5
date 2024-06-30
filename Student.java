public class Student {
    private static int nextIndexNumber = 1;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Date birthDate;
    private String indexNumber;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private String status;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String email, String address, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        int var10001 = nextIndexNumber++;
        this.indexNumber = "s" + var10001;
        this.status = "kandydat";
        this.grades = new ArrayList();
        this.currentSemester = 1;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        this.status = "student";
    }

    public void addGrade(int value, String subject) {
        this.grades.add(new Grade(value, subject));
    }

    public void promote() {
        if (this.currentSemester < this.studyProgramme.getSemesters()) {
            ++this.currentSemester;
            if (this.currentSemester == this.studyProgramme.getSemesters()) {
                this.status = "absolwent";
            }
        }

    }

    public String getInfo() {
        return this.firstName + " " + this.lastName + ", Index: " + this.indexNumber + ", Semester: " + this.currentSemester + ", Status: " + this.status;
    }
}
