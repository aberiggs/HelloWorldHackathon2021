public class Card {
    static String question;
    static String answer;
    static String name;

    static String srsLevel;
    static String reviewTimeAndDate;

    public Card(String inputName, String inputQuestion, String inputAnswer, String inputDate, String starterSRSLevel)
    {
        question = inputQuestion;
        answer = inputAnswer;
        name = inputName;

        srsLevel = starterSRSLevel;
        reviewTimeAndDate = inputDate;
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

    public static String getSrsLevel()
    {
        return srsLevel;
    }
    public static String getReviewTimeAndDate()
    {
        return reviewTimeAndDate;
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

    public static void setSrsLevel(String inputSrsLevel)
    {
        srsLevel = inputSrsLevel;
    }
}



