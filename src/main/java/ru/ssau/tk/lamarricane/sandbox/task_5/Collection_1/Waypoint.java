package ru.ssau.tk.lamarricane.sandbox.task_5.Collection_1;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;

    public Waypoint() {

    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public WaypointType getType() {
        return type;
    }

    public Settlement getSettlement() {
        return settlement;
    }
}