package lab.onpresent;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String Question = "Find the answer to the next question: Why arrays in java initialize with fixed size and can’t be dynamic?";
        String Answer = "Потому что Гладиолус";
        printQuestionAnswer(Question, Answer);


        Question = "Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).";
        Integer[] myArray = {2, 3, 1, 7, 11};
        Arrays.sort(myArray, Collections.reverseOrder());
        printQuestionAnswer(Question, Arrays.toString(myArray));


        Question = "You get an array of numbers(should contain both positive and negative numbers), and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)";
        Answer = "Потому что Гладиолус";
        printQuestionAnswer(Question, Answer);

    }

    // Номер вопроса
    public static int count;

    // Разделитель вопросов
    public static String stringDelimiter = "---------";

    // Выводим в консоль вопрос-ответ
    static void printQuestionAnswer(String Question, String Answer) {
        if (count == 0) System.out.println(stringDelimiter);
        System.out.println(++count + ". " + Question);
        System.out.println("Answer: " + Answer);
        System.out.println(stringDelimiter);
    }

}
