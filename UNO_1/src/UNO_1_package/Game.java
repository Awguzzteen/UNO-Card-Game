/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNO_1_package;

import java.util.*;

/**
 *
 * @author Saya Aw
 */
public class Game {
    
    private Integer gameid;
    private Integer numberofplayers;
    private String status;
    private List<Player> listofplayers = new ArrayList<Player>();
    
    private Deck theDeck = new Deck();
     
    
    
    public Game(){
        
    }
            
    public Game(Integer gameid,String status){
    this.gameid =gameid;
    this.status=status;
    }
    
    public void CreateGame()
    {
        theDeck.NewDeck();
        Collections.shuffle(theDeck.getThedeck());
        
    }
    
    public void AddPlayer(Player p){
        
        setListofplayers(p);
       
    }
    
    public void DistributeCard()
    {
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < getListofplayers().size(); j++)
            {
                getListofplayers().get(j).addcard(theDeck.DrawCard());
                theDeck.getThedeck().remove(theDeck.DrawCard());
            }
        }
    }


    private Card DiscardCard()
    {
        Card c = new Card();
        c=theDeck.getThedeck().get(0);
        theDeck.getThedeck().remove(c);
        return c;
        
    }
    /**
     * @return the listofplayers
     */
    public List<Player> getListofplayers() {
        return listofplayers;
    }

    /**
     * @param listofplayers the listofplayers to set
     */
    public void setListofplayers(Player p) {
        this.listofplayers.add(p);
    }

    @Override
    public String toString() {
        return "Game :" + "Game ID =" + gameid + "\n " + "Discard " + DiscardCard() + "\n" + "Cards On Deck : " + theDeck.getThedeck().size() + listofplayers;
    }
    
    
     
}
