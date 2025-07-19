public class OpeningState implements DoorState {
    @Override
    public DoorState transition(DoorEvent event) {
        if (event == DoorEvent.FULLY_OPENED) {
            System.out.println("ドアが開きました");
            return new OpenedState();
        } else {
            System.out.println("無効な操作: " + event + " in Opening");
            return this; // 状態を変更しない
        }
    }

    @Override
    public String getName() {
        return "Opening";
    }
}
