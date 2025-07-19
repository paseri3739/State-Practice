public class OpeningState implements DoorState {
    @Override
    public void transition(DoorEvent event, DoorContext context) {
        if (event == DoorEvent.FULLY_OPENED) {
            System.out.println("ドアが開きました");
            context.setState(new OpenedState());
        } else {
            System.out.println("無効な操作: " + event + " in Opening");
        }
    }

    @Override
    public String getName() {
        return "Opening";
    }
}
