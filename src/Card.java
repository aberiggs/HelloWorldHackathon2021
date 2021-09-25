public class Card {
    String question;
    String answer;
    String name;
    String srsLevel;
    String reviewTimeAndDate;

    public Card(String inputName, String inputQuestion, String inputAnswer, String inputDate, String starterSRSLevel)
    {
        question = inputQuestion;
        answer = inputAnswer;
        name = inputName;

        srsLevel = starterSRSLevel;
        reviewTimeAndDate = inputDate;
    }
    public String getQuestion()
    {
        return question;
    }
    public String getAnswer()
    {
        return answer;
    }
    public String getName()
    {
        return name;
    }
    public String getSrsLevel()
    {
        return srsLevel;
    }
    public String getReviewTimeAndDate()
    {
        return reviewTimeAndDate;
    }
}



