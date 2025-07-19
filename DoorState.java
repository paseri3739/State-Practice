// DoorState.java
public interface DoorState {
    void pressButton(DoorContext context);
    void fullyOpened(DoorContext context);
    void fullyClosed(DoorContext context);
    void obstacleDetected(DoorContext context);
    String getName();
}
