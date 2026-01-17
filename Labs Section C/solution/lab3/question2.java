import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] arr={"What is the capital of France? a) Berlin b) Madrid c) Paris d) Rome",
        "How many continents are there in the world? a) 5 b) 6 c) 7 d) 8 ",
        "Who invented the light bulb? a) Nikola Tesla b) Albert Einstein c) Thomas Edison d) Alexander Graham Bell",
        "Which planet is known as the Red Planet? a) Venus b) Mars c) Jupiter d) Saturn",
        "What is the national animal of India? a) Lion b) Elephant c) Bengal Tiger d) Peacock"};
        char [] answers={'c','c','d','d','d'};
        int score=0;
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
            System.out.print("Enter your answer:");
            char answer=sc.next().charAt(0);
            if(Character.toLowerCase(answer)==answers[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Wrong");
            }


        }
        System.out.println("Your Score is: "+score+"/5");
    }
}
