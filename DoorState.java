public interface DoorState {
    DoorState transition(DoorEvent event);
    String getName();
}
