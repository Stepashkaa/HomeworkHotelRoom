public class Main {
    public static void main(String[] args) {
        RoomService<EconomyRoom> economyService = new ImplementRoomService<>();
        RoomService<StandardRoom> standardService = new ImplementRoomService<>();
        RoomService<LuxRoom> luxService = new ImplementRoomService<>();
        RoomService<UltraLuxRoom> ultraLuxService = new ImplementRoomService<>();
        LuxRoomService<UltraLuxRoom> ultraLuxService2 = new ImplementLuxRoomService<>();

        EconomyRoom economyRoom1 = new EconomyRoom();
        EconomyRoom economyRoom2 = new EconomyRoom(15, 3, false);

        StandardRoom standardRoom1 = new StandardRoom();
        StandardRoom standardRoom2 = new StandardRoom(9, 5, false);

        LuxRoom luxRoom1 = new LuxRoom();
        LuxRoom luxRoom2 = new LuxRoom(90, 1, false);

        UltraLuxRoom ultraLuxRoom = new UltraLuxRoom(95, 1, false);

        try{
            //economyRoom3.setReservation(true);
            economyService.reserve(economyRoom2);
            economyService.reserve(economyRoom2);
        } catch (ReservationIsException ex){
            System.out.println("Исключение: " + ex.getMessage());
        }

        economyService.clean(economyRoom2);
        economyService.free(economyRoom1);

        standardService.reserve(standardRoom1);
        standardService.clean(standardRoom1);
        standardService.free(standardRoom1);

        luxService.clean(luxRoom2);
        luxService.free(luxRoom2);

        ultraLuxService2.foodDelivery(ultraLuxRoom);
        ultraLuxService2.clean(ultraLuxRoom);
        ultraLuxService2.reserve(ultraLuxRoom);
        ultraLuxService2.foodDelivery(ultraLuxRoom);
    }
}