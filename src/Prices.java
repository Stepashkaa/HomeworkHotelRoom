public enum Prices {
    ECONOMY(5000),
    STANDARD(10000),
    LUX(20000),
    ULTRALUX(50000);

    private final int price;

    Prices(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
