// DoorContext.java
public class DoorContext {
    // 現在の状態。インターフェースでポリモーフィズムを実現する。現在の状態が次の状態を生成し、かつ状態が振る舞いをもつことで
    // 現在の状態に応じて自動的に処理が切り替わるようにできる
    private DoorState currentState;

    public DoorContext() {
        this.currentState = new ClosedState(); // 初期状態。これはコンストラクタの引数で受け取ってもいい。
    }

    public void setState(DoorState state) {
        System.out.println("状態遷移: " + this.currentState.getName() + " → " + state.getName());
        this.currentState = state;
    }

    // イベント処理は現在の状態に応じたメソッドを呼び出すだけになる。
    // このようにクライアント側がifを書かないのが良いコード。
    public void pressButton() {
        currentState.pressButton(this);
    }

    public void fullyOpened() {
        currentState.fullyOpened(this);
    }

    public void fullyClosed() {
        currentState.fullyClosed(this);
    }

    public void obstacleDetected() {
        currentState.obstacleDetected(this);
    }

    public String getCurrentStateName() {
        return currentState.getName();
    }
}
