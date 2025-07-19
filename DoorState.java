public interface DoorState {
    void transition(DoorEvent event, DoorContext context);
    String getName();
}
