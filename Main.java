// Main.java
public class Main {
    public static void main(String[] args) {
        DoorContext door = new DoorContext();
        door.pressButton();         // Closed → Opening
        door.fullyOpened();        // Opening → Opened
        door.pressButton();        // Opened → Closing
        door.obstacleDetected();   // Closing → Opening
        door.fullyOpened();        // Opening → Opened
        door.pressButton();        // Opened → Closing
        door.fullyClosed();        // Closing → Closed
    }
}
