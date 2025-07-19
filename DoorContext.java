public class DoorContext {
    private DoorState currentState; // 現在の状態

    public DoorContext() {
        this.currentState = new ClosedState(); // 初期状態
    }

    public void setState(DoorState newState) {
        System.out.println("状態遷移: " + this.currentState.getName() + " → " + newState.getName());
        this.currentState = newState;
    }

    public void handleEvent(DoorEvent event) {
        currentState.transition(event, this); // currentStateを書き換えさせることで振る舞いが変化していく。
    }

    public String getCurrentStateName() {
        return currentState.getName();
    }
}
