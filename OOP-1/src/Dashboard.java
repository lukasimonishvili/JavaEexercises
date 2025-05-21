import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Dashboard {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return  this.tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void changeStatus(int id, TaskStatus status) {
        for(Task task: tasks) {
            if(task.getId() == id) {
                task.setStatus(status);
                break;
            }
        }
    }

    public void displayTasks(boolean shwOlnyPending) {
        for(Task task: tasks) {
            if(!shwOlnyPending || task.getStatus() == TaskStatus.Pending) {
                task.toString();
            }
        }
    }
}
