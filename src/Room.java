import java.util.Random;

public abstract class Room {
    private int numberRoom;

    private int maxCountPeopleInRoom;

    //private int priceType;
    private Prices priceType;

    private boolean isReservation;

    public Room(int numberRoom, int maxCountPeopleInRoom, Prices priceType, boolean isReservation) {
        this.numberRoom = numberRoom;
        this.maxCountPeopleInRoom = maxCountPeopleInRoom;
        this.priceType = priceType;
        this.isReservation = isReservation;
    }

    public Room(Prices priceType){
        this(58, 8, priceType, false);
    }

    public Room(){
        Random random = new Random();
        this.numberRoom = random.nextInt(100) + 1;
        this.maxCountPeopleInRoom = random.nextInt(1, 6);
        this.priceType = Prices.values()[random.nextInt(Prices.values().length)];
        this.isReservation = random.nextBoolean();
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getMaxCountPeopleInRoom() {
        return maxCountPeopleInRoom;
    }

    public void setMaxCountPeopleInRoom(int maxCountPeopleInRoom) {
        this.maxCountPeopleInRoom = maxCountPeopleInRoom;
    }

    public Prices getpriceType() {
        return priceType;
    }

    public void setPriceType(Prices priceType) {
        this.priceType = priceType;
    }

    public boolean isReservation() {
        return isReservation;
    }

    public void setReservation(boolean reservation) {
        isReservation = reservation;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberRoom=" + numberRoom +
                ", maxCountPeopleInRoom=" + maxCountPeopleInRoom +
                ", priceType=" + priceType +
                ", isReservation=" + isReservation +
                '}';
    }

}
