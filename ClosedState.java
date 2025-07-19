public class ClosedState implements DoorState {
    @Override
    public void transition(DoorEvent event, DoorContext context) {
        if (event == DoorEvent.PRESS_BUTTON) {
            System.out.println("ドアを開けます");
            context.setState(new OpeningState());
        } else {
            System.out.println("無効な操作: " + event + " in Closed");
        }
    }

    @Override
    public String getName() {
        return "Closed";
    }
}
