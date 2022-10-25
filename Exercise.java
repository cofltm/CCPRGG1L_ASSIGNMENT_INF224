public class Exercise {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};
    
  
        // WORD 1
        System.out.println("");
        System.out.println("1. WORD 1");
        for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(rows != 0){
                      //System.out.print(" ");
                  }
                  else{
                      System.out.print(mdArray[rows] [colums] );
              }
          }      
     }      
     
     System.out.println(" ");

        // WORD 2
        System.out.println("");
        System.out.println("2. WORD 2");
        for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(rows != 1){
                      //System.out.print(" ");
                  }
                  else{
                      System.out.print(mdArray[rows] [colums] );
              }
          }
            
     }  

     System.out.println(" ");
        
        // WORD 3
        System.out.println("");
        System.out.println("3. WORD 3");
        for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(rows != 2){
                      //System.out.print(" ");
                  }
                  else{
                      System.out.print(mdArray[rows] [colums] );
              }
          }
            
     }   
    
     System.out.println(" ");

        // WORD 4
        System.out.println("");
        System.out.println("4. WORD 4");
        for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(rows != 3){
                     // System.out.print(" ");
                  }
                  else{
                      System.out.print(mdArray[rows] [colums] );
              }
          }
            
     }   
    
     System.out.println(" ");

        // WORD 5
        System.out.println("");
        System.out.println("5. WORD 5");
        for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(colums != 0){
                      //System.out.print(" ");
                  }
                  else{
                      System.out.println(mdArray[rows] [colums] );
              }
          }
            
     }   
      
     System.out.println(" ");

        // WORD 6
        System.out.println("");
        System.out.println("6. WORD 6");
              for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(colums != 1){
                      //System.out.print(" ");
                  }
                  else{
                      System.out.println(mdArray[rows] [colums] );
              }
          }
            
     }   
     
     System.out.println(" ");
        
        // WORD 7
        System.out.println("");
        System.out.println("7. WORD 7");
              for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(colums != 2){
                      //System.out.print(" ");
                  }
                  else{
                      System.out.println(mdArray[rows] [colums] );
              }
          }
            
     }   
      
     System.out.println(" ");   
        // WORD 8
        System.out.println("");
        System.out.println("8. WORD 8");
              for (int rows = 0; rows < 4 ; rows++) {
              
              System.out.print(" ");
  
              // inner loop
              for (int colums = 0; colums < 4; colums++) {
                  
                  if(colums != 3){
                      //System.out.print(" ");
                  }
                  else{
                      System.out.println(mdArray[rows] [colums] );
              }
          }
            
     }   

    System.out.println(" ");

        //WORD 9
    System.out.println("");
    System.out.println("9. WORD 9");
                for (int rows = 0; rows < 4 ; rows++) {
            
            System.out.println(" ");

            // inner loop
            for (int colums = 0; colums < 4; colums++) {
                
                if (rows == 1 && (colums == 1 || colums == 2)){
                    System.out.print(" ");
                }
                else if (rows == 2 && (colums == 1 || colums == 2)){
                    System.out.print(" ");
                }
                else{
                    System.out.print(mdArray[rows] [colums] );
            }
        }
          
   }

   System.out.println(" ");

        //WORD 10
        System.out.println("");
        System.out.println("10. WORD 10");
                    for (int rows = 0; rows < 4 ; rows++) {
                
                System.out.println(" ");
    
                // inner loop
                for (int colums = 0; colums < 4; colums++) {
                    
                    if (rows == 0 && (colums == 1 || colums == 2)){
                        System.out.print(" ");
                    }
                    else if (rows == 3 && (colums == 1 || colums == 2)){
                        System.out.print(" ");
                    }
                    else if (rows == 1 && (colums == 0 || colums == 3)){
                        System.out.print(" ");
                    }
                    else if (rows == 2 && (colums == 0 || colums == 3)){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(mdArray[rows] [colums] );
                }
            }
              
       }
      
    }
  }
