
/**
 * Write a description of class CD here.
 * 
 * @author (Awais)
 * @group (1)
 * @version (1.5)
 */


public class CD
{
    //all the public variables that i need
    private String title;
    private String artists;
    private int noOfTracks;
    private double cost;
    private boolean reportInStock;
    private String borrower;
    private int countBorrow;
    //private double borrowCharge;
    //private double borrowAmounToBorrower;
    
    //Refernce from the borrower class
    Borrower borrowerClass = new Borrower();
    
    public CD(String title1, String artists1, int noOfTracks1, double costs1)
    {
        //assins all the user inputs from the parameters to the public variables up top
        //borrower borrowerClass = new borrower();
        title = title1;
        artists = artists1;
        noOfTracks = noOfTracks1;
        cost = costs1;
        countBorrow = 0;
        //borrowCharge = 2.75;
        //borrowAmounToBorrower = 0;
    }
    
// public CD()
// {
// title = new title("abc");
//         this.title = "abc";
//         this.artists = "def";
//         this.noOfTracks = 25;
//         this.cost = 5.55;
//         this.countBorrow = 0;
//// borrowCharge = 2.75;
//         this.borrowAmounToBorrower = 0;
// }
    
   
    public String accessTitle()
    {
        //returns the name of the song
        return title;
    }
    
    public String accessArtist()
    {
        //returns the name of the artists
        return artists;
    }
    
    public int accessNoOfTracks()
    {
        //returns the number of tracks on the cd
        return noOfTracks;
    }
    
    public double accessCost()
    {
        //returns the cost of the cd
        return cost;
    }
    
    public int accessCountBorrow()
    {
        //outputs the amount of time an item has been borrowed
        return countBorrow;
    }
    
//     public void borrow(String borrow1)
//     {
//         countBorrow = ++countBorrow;
//         borrower = borrow1;
//         //borrowAmounToBorrower = borrowAmounToBorrower + cost;
//         reportInStock = false;
//     }

    public void borrow()
    {
        //borrower = new Borrower(surname);
        //Getting the surname from the bowwower class and pass ing it to the borrower string
        borrower = borrowerClass.surname;
        //increasing count borrow by 1
        countBorrow = ++countBorrow;
        //making the stock empty
        reportInStock = false;
    }
  
    public void reportInStock()
    {
        if(reportInStock == false)
        {
            //if reportInStock is false it tells the user that the cd is being borrowed and who is borrowing it
            System.out.println("The cd is being borrowed by " + borrower);
        }
        else
        {
            //if cd is in stock it tell the user that the cd is in stock
            System.out.println("The CD is in stock");
        }
    }
    
    public void returnCD()
    {
        reportInStock = true;//stock is full again
        borrower = null; //Clears the string
    }
    
    public double calculateEarnings()
    {
        //amount of times borrowed times by the cost
        return countBorrow * cost;  
    }
    
    public void printReport()
    {
        //Report that outputs everything
        System.out.println("###########################");
        System.out.println("CD Title: " + title);
        System.out.println("Artist Name: " + artists);
        System.out.println("Number of tracks on CD: " + noOfTracks);
        System.out.println("CD Price: " + cost);
        System.out.println("In stock = " + reportInStock);
        System.out.println("Borrower Name:" + borrower);
        System.out.println("Borrow Charge = £" + cost);
        System.out.println("Total earnt = £" + calculateEarnings());
        System.out.println("###########################");
    }
}
