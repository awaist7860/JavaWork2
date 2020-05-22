/**
 * Write a description of class CD here.
 * 
 * @author (Awais)
 * @group (1)
 * @version (1.5)
 */

public class Borrower
{
    //all the public variables that i need
    public String surname;
    public int libraryId;
    
    //public Borrower(String surname1, int libraryId1)
    //{
        //surname = surname1;
        //libraryId = libraryId1;
    //}
    
    public String accessSurname(String surname1)
    {
        surname = surname1;
        return surname;
    }
    
    public int accessLibraryId(int libraryId1)
    {
        libraryId = libraryId1;
        return libraryId;
    }
    
}
