package final_project;

public class Mark {
    private String letterMark;
    private Double percentageMark;
    private Double gpa;
    private Course course;
    private Mark firstAttestation;
    private Mark secondAttestation;
    private Mark finalMark;

    // Default Constructor
    public Mark() {
    }

    // Constructor with parameters
    public Mark(String letterMark, Double percentageMark, Double gpa, Course course) {
        this.letterMark = letterMark;
        this.percentageMark = percentageMark;
        this.gpa = gpa;
        this.course = course;
    }

    // Getters and Setters
    public String getLetterMark() {
        return letterMark;
    }

    public void setLetterMark(String letterMark) {
        this.letterMark = letterMark;
    }

    public Double getPercentageMark() {
        return percentageMark;
    }

    public void setPercentageMark(Double percentageMark) {
        this.percentageMark = percentageMark;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Mark getFirstAttestation() {
        return firstAttestation;
    }

    public void setFirstAttestation(Mark firstAttestation) {
        this.firstAttestation = firstAttestation;
    }

    public Mark getSecondAttestation() {
        return secondAttestation;
    }

    public void setSecondAttestation(Mark secondAttestation) {
        this.secondAttestation = secondAttestation;
    }

    public Mark getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Mark finalMark) {
        this.finalMark = finalMark;
    }

    // toString Method
    @Override
    public String toString() {
        return "Mark{" +
                "letterMark='" + letterMark + '\'' +
                ", percentageMark=" + percentageMark +
                ", gpa=" + gpa +
                ", course=" + (course != null ? course.getCourseName() : "No Course Assigned") +
                ", firstAttestation=" + (firstAttestation != null ? firstAttestation.getPercentageMark() : "Not Assigned") +
                ", secondAttestation=" + (secondAttestation != null ? secondAttestation.getPercentageMark() : "Not Assigned") +
                ", finalMark=" + (finalMark != null ? finalMark.getPercentageMark() : "Not Assigned") +
                '}';
    }

    // Assign First Attestation
    public void assignFirstAttestation(Double percentageMark, String letterMark) throws InvalidMarkException {
        if (percentageMark == null || letterMark == null || percentageMark < 0 || percentageMark > 100) {
            throw new InvalidMarkException("Invalid input for first attestation: Percentage must be between 0 and 100, and letter mark cannot be null.");
        }
        this.firstAttestation = new Mark(letterMark, percentageMark, null, null);
        System.out.println("First attestation assigned: " + this.firstAttestation);
    }

    // Assign Second Attestation
    public void assignSecondAttestation(Double percentageMark, String letterMark) throws InvalidMarkException {
        if (percentageMark == null || letterMark == null || percentageMark < 0 || percentageMark > 100) {
            throw new InvalidMarkException("Invalid input for second attestation: Percentage must be between 0 and 100, and letter mark cannot be null.");
        }
        this.secondAttestation = new Mark(letterMark, percentageMark, null, null);
        System.out.println("Second attestation assigned: " + this.secondAttestation);
    }

    // Assign Final Mark
    public void assignFinalMark(Double percentageMark, String letterMark, Double gpa) throws InvalidMarkException {
        if (percentageMark == null || letterMark == null || gpa == null || percentageMark < 0 || percentageMark > 100 || gpa < 0 || gpa > 4) {
            throw new InvalidMarkException("Invalid input for final mark: Percentage must be between 0 and 100, GPA must be between 0 and 4, and letter mark cannot be null.");
        }
        this.finalMark = new Mark(letterMark, percentageMark, gpa, null);
        System.out.println("Final mark assigned: " + this.finalMark);
    }

    // Custom Exception Class for Invalid Mark
    public static class InvalidMarkException extends Exception {
        public InvalidMarkException(String message) {
            super(message);
        }
    }
}
