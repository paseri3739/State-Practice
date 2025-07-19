public class ClosingState implements DoorState {
    @Override
    public DoorState transition(DoorEvent event) {
        if (event == DoorEvent.FULLY_CLOSED) {
            System.out.println("ドアが閉まりました");
            return new ClosedState();
        } else if (event == DoorEvent.OBSTACLE_DETECTED) {
            System.out.println("障害物を検知、再び開きます");
            return new OpeningState();
        } else {
            System.out.println("無効な操作: " + event + " in Closing");
            return this; // 状態を変更しない
        }
    }

    @Override
    public String getName() {
        return "Closing";
    }
}
