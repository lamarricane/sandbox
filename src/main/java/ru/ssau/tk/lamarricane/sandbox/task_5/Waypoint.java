package ru.ssau.tk.lamarricane.sandbox.task_5;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;


    public Settlement getSettlement() {
        return settlement;
    }

    public WaypointType getType() {
        return type;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Waypoint: Type: " + type + "; Name: " + getName() + "; Latitude: " + getLatitude() + "; Longitude: " + getLongitude() + ".";
    }
}