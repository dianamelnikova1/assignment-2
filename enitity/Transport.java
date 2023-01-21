package enitity;

import enitity.util.TransportUtil;

public abstract class Transport {
    private final long id;
    private int maxPassengers;

    public Transport(int maxPassengers) {
    //I apologize for this kind of shit, don't know jdbc and sql;
        this.id = ++TransportUtil.lastId;
        this.maxPassengers = maxPassengers;
    }

    public long getId() {
        return id;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public void doRide() {
        System.out.println("driving on the road");
    }
}
