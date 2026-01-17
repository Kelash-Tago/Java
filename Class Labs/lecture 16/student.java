import java.util.Scanner;

public class student {
    public static void main(String args[]) {
        Grade g1 = new Grade();
        Grade g2 = new Grade();
        System.out.println("g1 p=" + g1.p);
        System.out.println("g1 p=" + g2.p);
    }
}

class Grade {
    int p;
    Scanner sc = new Scanner(System.in);
    
    Grade() {
        System.out.print("Enter percentage : ");
        this.p = sc.nextInt();
    }

    char CalcGrade() {
        if(p < 50)
            return 'F';
        else if(p >= 50 && p <= 70)
            return 'B';
        else if(p > 70)
            return 'A';
        return 'F';  // Default return statement
    }
} 