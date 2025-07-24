public class StringBuilder1 {
    public static void main(String [] args)
    {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert at index 0
        sb.insert(0,'S');
        System.out.println(sb);

        // insert at index 3
        sb.insert(3,'n');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(3,4);
        System.out.println(sb);

        // delete the 2 characters
        sb.delete(2,4);
        System.out.println(sb);

        // add element at the end 
        sb.append("h"); // str = str + "h";
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        // for counting the length of a string
        System.out.println(sb.length());

    }
}
