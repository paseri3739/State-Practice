// ClosedState.java
public class ClosedState implements DoorState {
    @Override
    public void pressButton(DoorContext context) {
        System.out.println("ドアを開けます");
        // 次の状態を生成(DoorContextの状態が書き換わるため、DoorContext側で呼び出しの結果も変化する)
        context.setState(new OpeningState());
    }

    @Override
    public void fullyOpened(DoorContext context) {}

    @Override
    public void fullyClosed(DoorContext context) {}

    @Override
    public void obstacleDetected(DoorContext context) {}

    @Override
    public String getName() {
        return "Closed";
    }
}
