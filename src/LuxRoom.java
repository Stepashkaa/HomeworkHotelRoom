public class LuxRoom extends ProRoom{
    public LuxRoom(int numberRoom, int maxCountPeopleInRoom, boolean isReservation) {
        super(numberRoom, maxCountPeopleInRoom, Prices.LUX, isReservation);
    }

    public LuxRoom() {
        super(Prices.LUX);
    }
}
