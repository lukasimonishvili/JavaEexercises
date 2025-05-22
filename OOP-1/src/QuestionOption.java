public class QuestionOption {
    public String option;
    public int selected;

    public QuestionOption(String option) {
        this.option = option;
        this.selected = 0;
    }

    public void select() {
        this.selected += 1;
    }
}
