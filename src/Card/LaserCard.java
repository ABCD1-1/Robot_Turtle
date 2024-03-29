package Card;

public class LaserCard implements Card {
    private String name = "Carte Laser";
    private String description = "Attaque le premier obstacle sur le chemin, attention si l'obstacle est un Joyau, le laser se réfléchit.";

    public LaserCard() {    //constructeur par défaut
        this.name = name;   //mettre getName() si y'a un bug
        this.description = description;   //mettre getDescrition() si y'a un bug
    }


    @Override
    public void playCard() {
//        super.playCard();           //cette ligne a été écrite toute seule   ,
        // PS:  super() c'est pour faire appel aux variables, méthodes de la classe mère dans nos constructeurs
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
