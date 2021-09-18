public class Card {
    static String question;
    static String answer;
    static String name;
    static String date;
    static int hour;
    static int min;
    static int srsLevel;
    public Card(String inputName, String inputQuestion, String inputAnswer, String inputDate, int inputHour, int inputMin, int starterSRSLevel)
    {
        question = inputQuestion;
        answer = inputAnswer;
        name = inputName;
        date = inputDate;
        hour = inputHour;
        min = inputMin;
        srsLevel = starterSRSLevel;
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
    public static String getDate()
    {
        return date;
    }
    public static int getHour()
    {
        return hour;
    }
    public static int getMin()
    {
        return min;
    }
    public static int getSrsLevel()
    {
        return srsLevel;
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
    public static void setDate(String inputDate)
    {
        date = inputDate;
    }
    public static void setHour(int inputHour)
    {
        hour = inputHour;
    }
    public static void setMin(int inputMin)
    {
        min = inputMin;
    }
    public static void setSrsLevel(int inputSrsLevel)
    {
        srsLevel = inputSrsLevel;
    }
}
