package task1;

public class Percentage {

    static int marks1 = 78;
    static int marks2 = 85;
    static int marks3 = 90;

    static int total() {
        int totalMarks = marks1 + marks2 + marks3;
        return totalMarks;
    }

    static void percentage() {
        int totalMarks = total();
        double percent = (totalMarks / 300.0) * 100;
        System.out.println("Total Marks: "+ totalMarks);
        System.out.println("Percentage: "+ percent);
    }

    public static void main(String[] args) {
        percentage();
    }
}

