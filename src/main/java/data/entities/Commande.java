package main.java.data.entities;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private Client client;
    private List<Article> articles;
    private double total;

    public Commande(Client client) {
        this.client = client;
        this.articles = new ArrayList<>();
        this.total = 0;
    }

    public void ajouterArticle(Article article) {
        articles.add(article);
        total += article.getPrix() * article.getQuantite();
    }

    public void supprimerArticle(Article article) {
        articles.remove(article);
        total -= article.getPrix() * article.getQuantite();
    }

    public double getTotal() {
        return total;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
