public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 58;
        int englishGrade = 65;
        String language = "Java";

        if(chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")){
            System.out.println("Congratulations, you got the scholarship");
        } else {
            System.out.println("We're sorry, you didn't get the scholarship.");
        }
    }
}
