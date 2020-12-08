package ConceptualCode;

import java.sql.Time;

public class ConceptualWeeklyEvent extends ConceptualAbstractEvent {

    private Days day;
    private Time time;

    public ConceptualWeeklyEvent(EventTypes type, String name, String description, Days day, Time time) {
        super(type, name, description);
        this.day = day;
        this.time = time;
    }
}
