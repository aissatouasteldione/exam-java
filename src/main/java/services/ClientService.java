package main.java.services;

import main.java.data.entities.Client;
import main.java.data.repository.ClientRepository;

public class ClientService {
    private ClientRepository repository = new ClientRepository();

    public Client rechercherOuAjouterClient(String nom, String telephone, String adresse) {
        Client client = repository.rechercherParTelephone(telephone);
        if (client == null) {
            client = new Client(nom, telephone, adresse);
            repository.ajouterClient(client);
        }
        return client;
    }
}
