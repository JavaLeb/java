package thread;

import java.util.LinkedList;

/**
 * Created by leboop on 2018/11/25.
 */
public class EventQueue {
    private int max;

    static class Event {
        private String eventName;

        public Event(String eventName) {
            this.eventName = eventName;
        }

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
        }
    }

    private final LinkedList<Event> eventQueueList = new LinkedList<>();

    private static final int DEFAULT_MAX = 10;

    public EventQueue() {
        this(DEFAULT_MAX);
    }

    public EventQueue(int max) {
        this.max = max;
    }


}
