package main.java.services;

import main.java.data.entities.Article;
import main.java.data.repository.CommandeRepository;

public class CommandeService {
    private CommandeRepository repository = new CommandeRepository();

    public void ajouterArticle(String nom, double prix, int quantite) {
        Article article = new Article(nom, prix, quantite);
        repository.ajouterArticle(article);
    }

    public void afficherArticles() {
        for (Article a : repository.getArticles()) {
            System.out.println("Article : " + a.getNom() + ", Prix : " + a.getPrix() + ", Quantité : " + a.getQuantite());
        }
    }
}