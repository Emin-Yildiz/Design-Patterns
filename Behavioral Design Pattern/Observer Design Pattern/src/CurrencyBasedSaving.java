import java.util.ArrayList;
import java.util.List;

public abstract class CurrencyBasedSaving { // para birime dayalı tasarruf

    private List<Client> clientList = new ArrayList<>(); // bu class'a bağımlı olan client nesneleri burda tutulur.
    private double exchangeRate = 1; // kurun anlık tl karşısındaki değeri (diğer nesnelerin bu sınıfa bağımlı olmasını sağlayan depişken bu)

    protected void setExchangeRate(double newExchangeRate){ // kur değiştiğinde anlık olarak müşteri hesabınaki parada değişir.
        exchangeRate = newExchangeRate;
        updateStatesOfClients(exchangeRate);
    }

    protected double getExchangeRate(){
        return exchangeRate;
    }

    protected void register(Client client){ // listeye abona ekleyen metod
        clientList.add(client);
    }

    protected void unRegister(Client client){ // listeden abone silen metod
        clientList.remove(client);
    }

    protected void updateStatesOfClients(double newExchangeRate){
        for(Client client : clientList){
            if(client != null){
                client.setTotalCurrencySaving(client.getTotalSaving()/newExchangeRate);
            }
        }
    }

}
