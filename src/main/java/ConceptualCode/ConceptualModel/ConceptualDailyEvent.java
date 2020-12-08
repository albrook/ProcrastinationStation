package ConceptualCode;


import java.sql.Time;
import java.util.Date;

public class ConceptualDailyEvent extends ConceptualAbstractEvent{

    private Time time;

    public ConceptualDailyEvent(EventTypes type, String name, String description, Time time) {
        super(type, name, description);
        this.time = time;
    }
}
