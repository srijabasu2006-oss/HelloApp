public class HelloApp4{
    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length > 0) {

            // Join all names with comma and space
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        } 
        else {
            // Default message if no arguments
            System.out.println("Hello, World!");
        }
    }
}