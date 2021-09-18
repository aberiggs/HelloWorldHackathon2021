public class Card {
    static String question;
    static String answer;
    public Card(String inputQuestion, String inputAnswer)
    {
        question = inputQuestion;
        answer = inputAnswer;
    }
    public static String getQuestion()
    {
        return question;
    }
    public static String getAnswer()
    {
        return answer;
    }
}
