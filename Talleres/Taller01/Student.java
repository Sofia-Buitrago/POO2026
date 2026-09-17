public class Student {

    private static final double MIN_GRADE = 0.0;
    private static final double MAX_GRADE = 5.0;

    private final String studentId;
    private String name;
    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.firstGrade = MIN_GRADE;
        this.secondGrade = MIN_GRADE;
        this.thirdGrade = MIN_GRADE;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public double getAverage() {
        return (firstGrade + secondGrade + thirdGrade) / 3.0;
    }

    public boolean setName(String newName) {
        if (newName == null || newName.trim().isEmpty()) {
            return false;
        }
        this.name = newName;
        return true;
    }

    public boolean setFirstGrade(double grade) {
        if (!isValidGrade(grade)) {
            return false;
        }
        this.firstGrade = grade;
        return true;
    }

    public boolean setSecondGrade(double grade) {
        if (!isValidGrade(grade)) {
            return false;
        }
        this.secondGrade = grade;
        return true;
    }

    public boolean setThirdGrade(double grade) {
        if (!isValidGrade(grade)) {
            return false;
        }
        this.thirdGrade = grade;
        return true;
    }

    private boolean isValidGrade(double grade) {
        return grade >= MIN_GRADE && grade <= MAX_GRADE;
    }
}