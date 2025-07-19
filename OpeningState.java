// OpeningState.java
public class OpeningState implements DoorState {
    @Override
    public void pressButton(DoorContext context) {}

    @Override
    public void fullyOpened(DoorContext context) {
        System.out.println("ドアが開きました");
        context.setState(new OpenedState());
    }

    @Override
    public void fullyClosed(DoorContext context) {}

    @Override
    public void obstacleDetected(DoorContext context) {}

    @Override
    public String getName() {
        return "Opening";
    }
}
