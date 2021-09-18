public class Card {
    static String question;
    static String answer;
    static String name;
    public Card(String inputName, String inputQuestion, String inputAnswer)
    {
        question = inputQuestion;
        answer = inputAnswer;
        name = inputName;
    }
    public static String getQuestion()
    {
        return question;
    }
    public static String getAnswer()
    {
        return answer;
    }
    public static String getName()
    {
        return name;
    }
    public static void setQuestion(String inputQuestion)
    {
        question = inputQuestion;
    }
    public static void setAnswer(String inputAnswer)
    {
        answer = inputAnswer;
    }
    public static void setName(String inputName)
    {
        name = inputName;
    }
}
