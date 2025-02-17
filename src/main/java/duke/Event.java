package duke;

public class Event extends Task {
    private String from;
    private String to;

    public Event(String name, String from, String to) {
        super(name);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format("[E]%s (from: %s to: %s) %s", super.toString(), this.from, this.to, super.getTags());
    }

    @Override
    public String toTaskListEntry() {
        return String.format("E | %d | %s | %s | %s | %s",
                this.getIsDone() ? 1 : 0, this.getName(), this.from, this.to, super.getTags());
    }
}
