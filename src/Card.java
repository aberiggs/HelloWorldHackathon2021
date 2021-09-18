public class Card {
    static String question;
    static String answer;
    static String name;
    static int date;
    static int srsLevel;
    static String reviewTimeAndDate;

    public Card(String inputName, String inputQuestion, String inputAnswer, int inputDate, int starterSRSLevel)
    {
        question = inputQuestion;
        answer = inputAnswer;
        name = inputName;
        date = inputDate;

        srsLevel = starterSRSLevel;
        reviewTimeAndDate = "";
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
    public static int getDate()
    {
        return date;
    }

    public static int getSrsLevel()
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
    public static void setDate(int inputDate)
    {
        date = inputDate;
    }
    public static void setSrsLevel(int inputSrsLevel)
    {
        srsLevel = inputSrsLevel;
    }
}
