public class Event extends Task {
    protected String description;
    protected boolean isDone;
    protected String eventDetails;

    public Event(String description, String eventDetails) {
        super(description);
        this.eventDetails = eventDetails;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    @Override
    public String toString() {
        return "[E][ " + super.getStatusIcon() + " ] " + super.getDescription() + "(At: " + getEventDetails() + ")";
    }
}