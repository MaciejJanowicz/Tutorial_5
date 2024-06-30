public class StudyProgramme {
    private String name;
    private String description;
    private int semesters;
    private int maxItns;

    public StudyProgramme(String name, String description, int semesters, int maxItns) {
        this.name = name;
        this.description = description;
        this.semesters = semesters;
        this.maxItns = maxItns;
    }

    public int getSemesters() {
        return this.semesters;
    }

    public int getMaxItns() {
        return this.maxItns;
    }
}
