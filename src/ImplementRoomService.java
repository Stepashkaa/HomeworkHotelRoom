public class ImplementRoomService<T extends Room> implements RoomService<T>{
    @Override
    public void clean(T room) {
        System.out.println("Комната №: " + room.getNumberRoom() + " была убрана.");
    }

    @Override
    public void reserve(T room) {
        if (room.isReservation()){
            throw new ReservationIsException("К сожалению комната №" + room.getNumberRoom() + " уже забронирована!");
        } else{
            System.out.println("Комната №" + room.getNumberRoom() + " успешно забронирована!");
            room.setReservation(true);
        }
    }

    @Override
    public void free(T room) {
        if (room.isReservation()) {
            System.out.println("Комната №" + room.getNumberRoom() + " освобождена.");
            room.setReservation(false);
        } else {
            System.out.println("Комната №" + room.getNumberRoom() + " уже свободна.");
        }
    }
}
