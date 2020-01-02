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
public class tiket 
{
    static double harga=35000, totalharga;
    static int quan=5;
    
    public static void tiket()
    {
        System.out.println("Film        : Harry Potter and the Half Blood Prince");
        System.out.println("Waktu       : 19.00");
        System.out.println("Studio      : 1");
        System.out.println("Quantity    : 5");
        System.out.println("Seat        : A1/A2/A3/A4/A5");
        System.out.println("Price/Ticket: "+harga);
        System.out.println("Total Harga : "+(harga*quan));
        System.out.println("Print Tikect? y/n: y");
        System.out.println("Pesan lagi? y/n: y");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Film        : Harry Potter and the Deathly Hallows");
        System.out.println("Waktu       : 23.00");
        System.out.println("Studio      : 2");
        System.out.println("Quantity    : 5");
        System.out.println("Seat        : B1/B2/B3/B4/B5");
        System.out.println("Price/Ticket: "+harga);
        System.out.println("Total Harga : "+(harga*quan));
        System.out.println("Print Tikect? y/n: y");
        System.out.println("-------------------------------------------------------------");
        output obj = new output();
        obj.output();
    }
}
