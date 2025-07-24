public class Strings2 {
    public static void main(String[] args) {
        String FirstName = "Tony";
        String LastName = "Stark";
        // Concatenation : 
        String FullName = FirstName+" "+LastName;
        System.out.println("Your full name is : "+FullName);
        System.out.println(FullName.length());
        
        // charAt() : For printing the character value of each index.
        for(int i=0;i<FullName.length();i++)
        {
            System.out.println(FullName.charAt(i));
        }

    }
}
