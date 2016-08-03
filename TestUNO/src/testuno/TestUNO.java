/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuno;
import UNO_1_package.Deck;
import UNO_1_package.Game;
import UNO_1_package.Player;
/**
 *
 * @author Saya Aw
 */
public class TestUNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Deck d = new Deck();
//        d.NewDeck();
//        System.out.println(d);
        
        Game g = new Game(1 , "Started");
        g.CreateGame();
        
        Player p1 = new Player("Augustine");
        g.AddPlayer(p1);        
        Player p2 = new Player("A Chit Sone");
        g.AddPlayer(p2);
        Player p3 = new Player("Heart");
        g.AddPlayer(p3);
        Player p4 = new Player("Awguzzteen");
        g.AddPlayer(p4);
        Player p5 = new Player("U Thein Sein");
        g.AddPlayer(p5);
        
        g.DistributeCard();

        System.out.println(g);
    }
    
}
