public class Task {
    private int id;
    private String title;
    private TaskStatus status;
    private String description;

    public Task(int id, String title, TaskStatus status, String description) {
        this.id = id;
        setTitle(title);
        setStatus(status);
        setDescription(description);
    }

    public int getId() {
        return  this.id;
    }


    public String getTitle() {
        return  this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return  this.status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id - " + getId()
                + "\n title - " + getTitle()
                + "\n description - " + getDescription()
                + "\n status - " + getStatus();
    }
}

enum TaskStatus {
    Pending,
    Completed
}