public class DoorContext {
    private DoorState currentState; // 現在の状態

    public DoorContext() {
        this.currentState = new ClosedState(); // 初期状態
    }

    public void handleEvent(DoorEvent event) {
        this.currentState = currentState.transition(event); // setterを用いないで新しい状態を生成して自分で再代入することで安全になる。
    }

    public String getCurrentStateName() {
        return currentState.getName();
    }
}
