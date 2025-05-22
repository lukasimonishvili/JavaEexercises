import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Survey {
    private List<Questions> questions = new ArrayList<Questions>();
    private List<Integer> usersParticipated = new ArrayList<Integer>();

    public void addQuestion(Questions question) {
        this.questions.add(question);
    }

    public void startSurvey(int id) {
        Scanner scanner = new Scanner(System.in);
        if(usersParticipated.contains(id)) {
            System.err.println("You can participate only once");
        }else {
            for(Questions question : questions) {
                System.out.println("please type only number associated with your answer");
                System.out.println(question.getQuestion());
                String optionsToDisplay = "";
                QuestionOption[] options = question.getOptions();
                for(int i = 0; i < options.length; i++) {
                    optionsToDisplay += i + 1 + ") " + options[i].option + "\n";
                }
                System.out.println(optionsToDisplay);
                int answer = scanner.nextInt();
                options[answer - 1].select();
            }

            System.out.println("Tank you for your answers");
            usersParticipated.add(id);
        }
    }

    public void getStatistics() {
        String result = "";
        for(Questions question : this.questions) {
            result += question.getQuestion() + "\n";
            QuestionOption[] options = question.getOptions();
            for(QuestionOption option : options) {
                result += "option " + option.option + " was selected " + option.selected + " times \n";
            }
        }

        System.out.println(result);
    }
}
