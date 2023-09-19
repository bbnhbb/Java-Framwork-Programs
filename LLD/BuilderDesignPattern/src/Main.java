public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserExam userExam;

        try {
            userExam = UserExam.getBuilder()
                    .setName("Bharath")
                    .setMathsMarks(35)
                    .setEnglishMarks(50)
                    .setScienceMarks(50)
                    .build();
            System.out.println(userExam);
            System.out.println("Finished");
        } catch (Exception e) {
            System.out.println("Some parameters are wrong");
        }
    }
}