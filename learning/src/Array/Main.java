package Array;

public class Main {
    public static void main(String[] args) throws Exception {
     
   
    
 //create instance of the class and fill the data to its variable 
 Dvd x = new Dvd();
  x.setGenre("Romantic");
  x.setLength(90);
  x.setPrice(500);
  x.setRating(4.5); 
  x.setTitle("Love Story 1945");
  x.getDetails();

 Dvd y = new Dvd();
  y.setGenre("Action");
  y.setLength(120);
  y.setPrice(650);
  y.setRating(4.7); 
  y.setTitle("Kill Bill");
  y.getDetails();

  Dvd z = new Dvd();
  z.setGenre("Sci-Fi");
  z.setLength(110);
  z.setPrice(750);
  z.setRating(4.8); 
  z.setTitle("Moon Collapse");
  z.getDetails();
//create an array with the type of Dvd which is a class
// Array structure without size data_type[] var = {items}
//Array structure with size data_type[] var = new data_type[size_of_array]

Dvd [] dvds =new Dvd[4];
dvds[0] = x;
dvds[1] = y;
dvds[2] = z;

//print data to check value , Null, Null references 
System.out.println(dvds[0].getTitle()+", "+dvds[1].getTitle()+", "+dvds[2].getTitle()+ " "+dvds[3] );
    }

}
