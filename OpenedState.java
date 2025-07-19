// OpenedState.java
public class OpenedState implements DoorState {
    @Override
    public void pressButton(DoorContext context) {
        System.out.println("ドアを閉めます");
        context.setState(new ClosingState());
    }

    @Override
    public void fullyOpened(DoorContext context) {}

    @Override
    public void fullyClosed(DoorContext context) {}

    @Override
    public void obstacleDetected(DoorContext context) {}

    @Override
    public String getName() {
        return "Opened";
    }
}
