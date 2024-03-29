package com.company;
//package Card;

import Card.Card;
import Card.Deck;

import java.util.List;

public class Player extends Cell {
    private String color;
    private char[] direction = {'N', 'E', 'S', 'O'};   //NORD, EST, SUD, OUEST
    private char currentDirection = direction[2];   //direction Sud par défaut
    private int score = 0;
    private int passageOrder;
    private List<Card> program;
    private List<Card> handCard;
    private List<Block> blocks;   //pour les murs
    private Deck discard = new Deck();   //défausse
    private Deck deck = new Deck();
    private String name;

    public Player() {
    } //constructeur par défaut


    public Player(String name, String color, char currentDirection, int passageOrder) {
        this.name = name;
        this.color = color;
        this.currentDirection = currentDirection;
        this.passageOrder = passageOrder;
    }


    public String getColor() {
        return color;
    }

    public char getCurrentDirection() {
        return currentDirection;
    }

    public int getPassageOrder() {
        return passageOrder;
    }

    public List<Card> getProgram() {
        return program;
    }

    public List<Card> getHandCard() {
        return handCard;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

//    public Card getDeck() {
//        return deck;
//    }

    public String getName() {
        return name;
    }

    private static Card pickCardFromDeck() {
        //à compléter
        return null;     //à modifier
    }
}
