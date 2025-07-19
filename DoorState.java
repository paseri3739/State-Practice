public interface DoorState {
    DoorState transition(DoorEvent event, DoorContext context);
    String getName();
}
