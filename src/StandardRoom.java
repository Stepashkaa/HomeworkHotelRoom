public class StandardRoom extends ProRoom{
    public StandardRoom(int numberRoom, int maxCountPeopleInRoom, boolean isReservation) {
        super(numberRoom, maxCountPeopleInRoom, Prices.STANDARD, isReservation);
    }

    public StandardRoom() {
        super(Prices.STANDARD);
    }
}
