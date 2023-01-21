package enitity;

public class Train extends Transport{

    public Train(int maxPassengers) {
        super(maxPassengers);
    }

    @Override
    public void doRide() {
        System.out.println("riding train on rails");
    }
}
