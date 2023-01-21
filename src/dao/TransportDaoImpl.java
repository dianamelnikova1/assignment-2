package dao;

import enitity.Transport;

import java.util.ArrayList;
import java.util.List;

//Actually don't know sql, so make something like that
public class TransportDaoImpl implements TransportDao{
    List<Transport> transportList;

    public TransportDaoImpl(List<Transport> transportList) {
        this.transportList = transportList;
    }

    public TransportDaoImpl() {
        transportList = new ArrayList<>();
    }

    public List<Transport> getTransportList() {
        return transportList;
    }

    public void addTransport(Transport transport) {
        this.transportList.add(transport);
    }
}
