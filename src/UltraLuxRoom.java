public class UltraLuxRoom extends LuxRoom{
    public UltraLuxRoom(int numberRoom, int maxCountPeopleInRoom, boolean isReservation) {
        super(numberRoom, maxCountPeopleInRoom, isReservation);
        setPriceType(Prices.ULTRALUX);
    }

    public UltraLuxRoom() {
        super();
        setPriceType(Prices.ULTRALUX);
    }
}
