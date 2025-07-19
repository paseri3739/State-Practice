// ClosingState.java
public class ClosingState implements DoorState {
    @Override
    public void pressButton(DoorContext context) {}

    @Override
    public void fullyOpened(DoorContext context) {}

    @Override
    public void fullyClosed(DoorContext context) {
        System.out.println("ドアが閉まりました");
        context.setState(new ClosedState());
    }

    @Override
    public void obstacleDetected(DoorContext context) {
        System.out.println("障害物を検知、再度開けます");
        context.setState(new OpeningState());
    }

    @Override
    public String getName() {
        return "Closing";
    }
}
