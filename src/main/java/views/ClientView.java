package main.java.views;

import main.java.services.ClientService;

public class ClientView {

    public static void main(String[] args) {
        ClientService service = new ClientService();

        service.rechercherOuAjouterClient("Ndiaye1", "778671011", "Dakar | Point E | Villa001");
        service.rechercherOuAjouterClient("Sall2", "776543210", "Thies | Quartier 3 | Rue 2");

        System.out.println("Clients enregistrés avec succès !");
    }
}
