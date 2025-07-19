public class OpenedState implements DoorState {
    @Override
    public void transition(DoorEvent event, DoorContext context) {
        if (event == DoorEvent.PRESS_BUTTON) {
            System.out.println("ドアを閉めます");
            context.setState(new ClosingState());
        } else {
            System.out.println("無効な操作: " + event + " in Opened");
        }
    }

    @Override
    public String getName() {
        return "Opened";
    }
}
