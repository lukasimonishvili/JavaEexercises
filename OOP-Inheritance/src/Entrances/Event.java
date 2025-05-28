package Entrances;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private final String name;
    private List<Entrance> entrances = new ArrayList<>();

    public Event(String name) {
        this.name = name;
    }

    public void addEntrance(Entrance entrance) {
        entrances.add(entrance);
    }

    public void logEventInfo() {
        System.out.println("Event name - " + this.name);
        System.out.println("ticket list:");
        for(Entrance entrance : entrances) {
            System.out.println(entrance.name + " - " + entrance.calculatePrice() + "$");
        }
    }
}
