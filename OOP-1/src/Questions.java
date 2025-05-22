public class Questions {
    private String question;
    private QuestionOption[] options;

    public Questions(String question, QuestionOption[] options) {
        this.question = question;
        this.options = options;
    }

    public String getQuestion() {
        return  this.question;
    }

    public QuestionOption[] getOptions() {
        return this.options;
    }
}
