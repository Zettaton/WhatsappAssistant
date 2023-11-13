public class Client {
    public static void main(String[] args){
        //Need to inject the classes with Guice Module if used singleton design pattern
        TaskReceiver receiver = new TaskReceiver();
        Command addTaskCommand = new AddTaskCommand(receiver, "Task Details");

        Taskinvoker taskinvoker = new Taskinvoker();
        taskinvoker.setCommand(addTaskCommand);
        taskinvoker.executeCommand();
    }
}
