package ru.ssau.tk.lamarricane.sandbox.task_5.Collection_2;

import ru.ssau.tk.lamarricane.sandbox.task_5.Collection_1.Location;

public class Settlement extends Location {
    private int settlement;
    private SettlementType type;

    public int getSettlement() {
        return settlement;
    }

    public SettlementType getType() {
        return type;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }
}