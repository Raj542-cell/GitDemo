public class string {
    public static void main(String[] args) {

        String s = "Raj learning selenium";
        String[] splittedstring = s.split("learning");
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
        System.out.println(splittedstring[1].trim());
//        System.out.println(splittedstring[2]);


        //split characters

        for ( int i=0; i<s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }

        //split characters in reverse

        for ( int i=s.length()-1; i>=0; i--)
        {
            System.out.println(s.charAt(i));
        }

    }
}
