class InstagramRunner{
	
    public static void main(String[] insta) {

        boolean user = Instagram.registrationUser("kiran@gmail.com","Kiran#123","Kiran R","kiran gowda",8679548756L);

        System.out.println("Registration Successful: " + user);
      
            Instagram.getDetails();
        

        
    }
}
