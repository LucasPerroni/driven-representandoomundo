public class Class {
    private String title;
    private String className;
    private String classSummary;
    private String classExercise;

    // title
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    // name
    public void setName(String name) {
        this.className = name;
    }

    public String getName() {
        return this.className;
    }

    // summary
    public void setSummary(String summary) {
        this.classSummary = summary;
    }

    public String getSummary() {
        return this.classSummary;
    }

    // exercise
    public void setExercise(String exercise) {
        this.classExercise = exercise;
    }

    public String getExercise() {
        return this.classExercise;
    }
}
