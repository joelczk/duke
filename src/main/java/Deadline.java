public class Deadline extends Task {
    protected String description;
    protected boolean isDone;
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    public String getBy() {
        return by;
    }

    @Override
    public String toString() {
        return "[D][ " + super.getStatusIcon() + " ] " + super.getDescription() + "(By: " + getBy() + ")";
    }
}