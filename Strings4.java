public class Strings4 {
    public static void main(String[] args) {
        String sentence = "My name is Tony Stark";
        // substring(Begining index,ending index) : It's basically print the value between the string.
        //String name = sentence.substring(11);
        String name = sentence.substring(5,sentence.length());
        System.out.println("Your name is : "+name);
    }
}

//  Strings are Immutable.