package Entrances;

public class EventSeller {
    private Event beerFest = new Event("Beer festival 2025");
    private Standard beerFestStandard = new Standard("beer fest standard", 20);
    private Vip beerFestVip = new Vip("beer fest vip", 20, 0.3);
    private Economy beerFestEconomy = new Economy("beer fest economy", 20, 0.3);

    private Event fireWorkShow = new Event("Fire work show");
    private Standard fireWorkStandard = new Standard("fire work standard", 40);
    private Vip fireWorkVip = new Vip("fire work vip", 40, 0.3);
    private Economy fireWorkEconomy = new Economy("fire work economy", 40, 0.3);

    public EventSeller() {
        beerFest.addEntrance(beerFestStandard);
        beerFest.addEntrance(beerFestVip);
        beerFest.addEntrance(beerFestEconomy);

        fireWorkShow.addEntrance(fireWorkStandard);
        fireWorkShow.addEntrance(fireWorkVip);
        fireWorkShow.addEntrance(fireWorkEconomy);
    }

    public void logAllEvents() {
        beerFest.logEventInfo();
        fireWorkShow.logEventInfo();
    }
}
