package Objects;

public class StringManipulator {
    public static void main(String[] args) {

   /*     Write a program that takes a person's name as the input in the following pattern firstname lastname.
   For example: Christian Devalez, Kevin Van Robbroeck.
   The program will separate the first name from the last name,
   and print out the last name in CAPITALS as follows: Christian DEVALEZ,Kevin VAN ROBBROECK.
        You can assume first names are always a single word, but last names may possibly have spaces in them.
        Hint: You can use the methods substring() and indexOf() from class String.
 */

        String name = "amir maik hayat;";
        char space = (char) name.indexOf(' ');
        name = name.trim();
        String firstName = name.substring(0, space);
        String firstname = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String lastName = name.substring(space);

        System.out.println("First name: " + firstname);
        System.out.println("Last name: " + lastName.toUpperCase());


    }
}
