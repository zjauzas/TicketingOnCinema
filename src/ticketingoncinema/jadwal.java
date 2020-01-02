/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketingoncinema;

/**
 *
 * @author zjauz
 */
public class jadwal 
{
    public static void jadwal()
    {
        System.out.println("----------JADWAL FILM----------");
        System.out.println("1. Harry Potter and the Half Blood Prince");
        System.out.println("2. Harry Potter and the Deathly Hallows");
        System.out.println("Pesan tiket? y/n: y");
        tiket obj = new tiket();
        obj.tiket();
    }
}
