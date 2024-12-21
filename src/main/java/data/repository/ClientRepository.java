package main.java.data.repository;

import main.java.data.entities.Client;
import java.util.HashMap;
import java.util.Map;

public class ClientRepository {
    private Map<String, Client> clients = new HashMap<>();

    public Client rechercherParTelephone(String telephone) {
        return clients.get(telephone);
    }

    public void ajouterClient(Client client) {
        clients.put(client.getTelephone(), client);
    }
}
