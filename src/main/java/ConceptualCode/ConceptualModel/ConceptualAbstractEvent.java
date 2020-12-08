package ConceptualCode;

public abstract class ConceptualAbstractEvent {

    public EventTypes type;
    private String name;
    private String description;

    public ConceptualAbstractEvent(EventTypes type, String name, String description) {
        this.type = type;
        this.name = name;
        this.description = description;
    }
}
