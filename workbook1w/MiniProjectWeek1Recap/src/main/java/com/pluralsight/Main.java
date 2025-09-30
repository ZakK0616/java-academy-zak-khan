import java.util.Scanner;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam score 0-100:");
        int grade = input.nextInt();

        if (grade >= 90){
            System.out.print("A");
        } else if (grade >= 89) {
            System.out.print("B");
        } else if (grade >= 79 ) {
            System.out.print("C");
        } else if (grade >= 69) {
            System.out.print("D");
        } else{
            System.out.print("F");
        }
        System.out.println("Your grade is " + grade);
    }
}