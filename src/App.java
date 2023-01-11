public class App {
    public static void main(String[] args) throws Exception {
        Subject calculus = new Subject();
        calculus.setName("Calculus");

        calculus.concept.setName("Limit");
        calculus.concept.setSummary("This is the summary for Limits");

        calculus.concept.conceptClass.setTitle("Introduction to Limits");
        calculus.concept.conceptClass.setName("Introduction to Limits and Their Properties");
        calculus.concept.conceptClass.setSummary("Here we will learn the basics of Limits");
        calculus.concept.conceptClass.setExercise("Here is a list of exercises of Limits");
    }
}
