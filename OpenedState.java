public class OpenedState implements DoorState {
    @Override
    public DoorState transition(DoorEvent event, DoorContext context) {
        if (event == DoorEvent.PRESS_BUTTON) {
            System.out.println("ドアを閉めます");
            return new ClosingState();
        } else {
            System.out.println("無効な操作: " + event + " in Opened");
            return this; // 状態を変更しない
        }
    }

    @Override
    public String getName() {
        return "Opened";
    }
}
