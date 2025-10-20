public class EconomyRoom extends Room{

    public EconomyRoom(int numberRoom, int maxCountPeopleInRoom, boolean isReservation) {
        super(numberRoom, maxCountPeopleInRoom, Prices.ECONOMY, isReservation);
    }

    public EconomyRoom() {
        super(Prices.ECONOMY);
    }

}
