public abstract class ProRoom extends Room{
    public ProRoom(int numberRoom, int maxCountPeopleInRoom, Prices priceType, boolean isReservation) {
        super(numberRoom, maxCountPeopleInRoom, priceType, isReservation);
    }

    public ProRoom(Prices priceType) {
        super(priceType);
    }

    public ProRoom() {
        super();
    }
}
