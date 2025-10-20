public class ImplementLuxRoomService<T extends LuxRoom> extends ImplementRoomService<T> implements LuxRoomService<T> {

    @Override
    public void foodDelivery(T room) {
        if (!(room instanceof LuxRoom)) {
            throw new ReservationIsException("Доставка доступна только для люксовых комнат.");
        }
        if(!room.isReservation()){
            System.out.println("Нельзя доставить еду в комнату №" + room.getNumberRoom() + " так как не забронирована!");
            return;
        }
        System.out.println("Доставка еды в люксовую комнату №" + room.getNumberRoom() + " оформлена.");
    }
}
