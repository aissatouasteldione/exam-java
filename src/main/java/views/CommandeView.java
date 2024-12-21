package main.java.views;

import main.java.data.entities.Article;
import main.java.data.repository.CommandeRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandeView {

    public static void main(String[] args) {
        CommandeService service = new CommandeService();
        service.ajouterArticle("Ordinateur", 700.0, 1);
        service.ajouterArticle("Clavier", 50.0, 2);
        service.afficherArticles();
    }
}
