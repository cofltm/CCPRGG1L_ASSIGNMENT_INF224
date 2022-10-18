public class Assignment2 {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=3){
            System.out.println("Cherish");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("Logmao");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("Sarmiento");
        }
        // char array
        
        String[] myFirstName = {"C","H","E","R","I","S","H"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"H","S","I","R","E","H","C"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
      }
   }
}
