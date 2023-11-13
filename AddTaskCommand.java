public class AddTaskCommand implements Command{
    private TaskReceiver receiver;
    private String taskDetails;

    public AddTaskCommand(TaskReceiver receiver, String taskDetails){
        this.receiver = receiver;
        this.taskDetails = taskDetails;
    }

    @Override
    public void execute() {

    }
}
