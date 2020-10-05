package ConceptualCode;

import java.util.ArrayList;

public class ConceptualEvents {

    private ArrayList<ConceptualAbstractEvent> events;

    public void ConceptualEvents() {
        events = new ArrayList<>();
    }

    public boolean addEvent(ConceptualAbstractEvent event) {
        return events.add(event);
    }

    public boolean removeChosenEvent(String eventName) {
        //TODO write this method
        return false;
    }

    public void removeAllEventsOfType(EventTypes type) {
        events.removeIf(event -> event.type == type);
    }

    public void removeAllEvents() {
        events.clear();
    }

}
