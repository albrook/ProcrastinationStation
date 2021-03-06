package ConceptualCode.ConceptualModel;

import ConceptualCode.EventTypes;

import java.util.Date;

public class ConceptualBirthdayEvent extends ConceptualCode.ConceptualAbstractEvent {

    private Date date;

    public ConceptualBirthdayEvent(EventTypes type, String name, String description, Date date) {
        super(type, name, description);
        this.date = date;
    }

}
