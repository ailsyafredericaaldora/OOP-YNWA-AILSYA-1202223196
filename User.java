public class User {
   
   
   
    // TO DO: Create Private Attributes of User (nama, noHandphone)
      private String nama;
      private String noHandphone;
   // TO DO: Create Constructor of User
         public User (String nama, String noHandphone){
            this.nama  = nama;
            this.noHandphone = noHandphone;
         }
         public String getnama(){
            return this.nama;
         }
         public String getnoHandphone() {
            return this.noHandphone;
         }

 
   // TO DO: Create register Method to show information about name and phone number
   public void register(String nama, String noHandphone){
        this.nama = nama;
        this.noHandphone = noHandphone;
        System.out.println("Nama: " + nama);
        System.out.println("noHandPhone "+ noHandphone);
    }
   // TO DO: Create method to return name and phone number
   
   public String getName() {
            return this.nama;
  }

   public String getnoHandPhone() {
         return this.noHandphone;
  }
}






  