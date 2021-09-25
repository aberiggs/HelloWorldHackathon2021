public class Card {
    String question;
    String answer;
    String name;
    String srsLevel;
    String reviewTimeAndDate;

    public Card(String inputName, String inputQuestion, String inputAnswer, String inputDate, String starterSRSLevel)
    {
        this.question = inputQuestion;
        this.answer = inputAnswer;
        this.name = inputName;
        this.srsLevel = starterSRSLevel;
        this.reviewTimeAndDate = inputDate;
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



