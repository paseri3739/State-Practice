public class Main {
    public static void main(String[] args) {
        DoorContext door = new DoorContext();

        door.handleEvent(DoorEvent.PRESS_BUTTON);        // Closed → Opening
        door.handleEvent(DoorEvent.FULLY_OPENED);        // Opening → Opened
        door.handleEvent(DoorEvent.PRESS_BUTTON);        // Opened → Closing
        door.handleEvent(DoorEvent.OBSTACLE_DETECTED);   // Closing → Opening
        door.handleEvent(DoorEvent.FULLY_OPENED);        // Opening → Opened
        door.handleEvent(DoorEvent.PRESS_BUTTON);        // Opened → Closing
        door.handleEvent(DoorEvent.FULLY_CLOSED);        // Closing → Closed
    }
}
