public class ClosedState implements DoorState {
    @Override
    public DoorState transition(DoorEvent event) {
        if (event == DoorEvent.PRESS_BUTTON) {
            System.out.println("ドアを開けます");
            return new OpeningState();
        } else {
            System.out.println("無効な操作: " + event + " in Closed");
            return this; // 状態を変更しない
        }
    }

    @Override
    public String getName() {
        return "Closed";
    }
}
