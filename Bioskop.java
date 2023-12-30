public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int rows;
    public Bioskop(){
        this.rows = 5;
    }
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int seatsPerRows;

        this.seatsPerRows = 10; 

    // TO DO: Create 2 dimensional array to store seat reservation status
    private char[][] seatStatus;
        this.seatStatus = new char[rows][seatsPerRows];
      
    
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop(int rows, int seatsPerRows) {
        for (int i = 0; i<rows; i++){
        for (int j = 0; j < seatsPerRows; j++){
            this.seatStatus[i][j] = '0';
        }
    }
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for ( int i  = 0; i < seatStatus.length; i++) {
            for (int j = 0; j < seatStatus [i].length; j++) {
                System.out.print(seatStatus [i] [j] );
            }
            System.out.println();
            }
        
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        int rows  = seatsPerRows;
        int seats = seatsPerRows;
        if (seatStatus[row][seat] == '0') {
            seatStatus[row ][seat] = 'x';
            System.out.println("seat" + seatsPerRows+ " suskes  reserved");
        }else{
            System.out.println("seat" + seatsPerRows + "is already reserved ");


        }
    }
