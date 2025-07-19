public class ClosingState implements DoorState {
    @Override
    public void transition(DoorEvent event, DoorContext context) {
        if (event == DoorEvent.FULLY_CLOSED) {
            System.out.println("ドアが閉まりました");
            context.setState(new ClosedState());
        } else if (event == DoorEvent.OBSTACLE_DETECTED) {
            System.out.println("障害物を検知、再び開きます");
            context.setState(new OpeningState());
        } else {
            System.out.println("無効な操作: " + event + " in Closing");
        }
    }

    @Override
    public String getName() {
        return "Closing";
    }
}
