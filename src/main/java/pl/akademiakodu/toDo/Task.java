package pl.akademiakodu.toDo;

public class Task {

    private String name;

    private String description;

    private boolean isFinished;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Task(String name, String description, boolean isFinished) {
        this(name,description);
        this.isFinished = isFinished;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

//    @Override
//    public String toString() {
//        return "Task{" +
//                "name'" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", isFinished=" + isFinished +
//                '}';
//    }

    @Override
    public String toString() {
        return getName()+" "+getDescription()+ " "+
                (isFinished ?  "skończone" : "nieskończone");
    }
}
