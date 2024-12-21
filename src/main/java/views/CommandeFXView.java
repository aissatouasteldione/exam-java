package main.java.views;

import main.java.services.CommandeService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CommandeFXView extends Application {
    private CommandeService service = new CommandeService();
    private TextField nomField = new TextField();
    private TextField prixField = new TextField();
    private TextField quantiteField = new TextField();
    private TextArea displayArea = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gestion de Commande - JavaFX");

        nomField.setPromptText("Nom de l'article");
        prixField.setPromptText("Prix");
        quantiteField.setPromptText("Quantité");

        Button ajouterBtn = new Button("Ajouter");
        ajouterBtn.setOnAction(e -> ajouterArticle());

        VBox vbox = new VBox(10, nomField, prixField, quantiteField, ajouterBtn, displayArea);
        Scene scene = new Scene(vbox, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void ajouterArticle() {
        String nom = nomField.getText();
        double prix = Double.parseDouble(prixField.getText());
        int quantite = Integer.parseInt(quantiteField.getText());

        service.ajouterArticle(nom, prix, quantite);
        service.afficherArticles();
        displayArea.appendText("Ajouté : " + nom + " - " + prix + " x " + quantite + "\n");
    }

    public static void main(String[] args) {
        launch(args);
    }
}