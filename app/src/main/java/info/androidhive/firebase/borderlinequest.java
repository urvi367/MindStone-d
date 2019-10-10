package info.androidhive.firebase;

public class borderlinequest {



    public String questions[] = {
            "Over the past few weeks how often were your life and relationships affected by worrying that someone important in your life is tired of you and planning to leave?\n",
            "Over the past few weeks how often were your life and relationships affected by major shifts in your opinions?\n",
            "Over the past few weeks how often were your life and relationships affected by extreme changes in how you see yourself?\n",
            "Over the past few weeks how often were your life and relationships affected by severe mood swings several times of the day?\n",
            "Over the past few weeks how often were your life and relationships affected by feeling paranoid or like you are losing touch with reality?\n",
            "Over the past few weeks how often were your life and relationships affected by being angry?",

            "Over the past few weeks how often were your life and relationships affected by feelings of emptiness?\n",

    };

    public String choices[][] = {
            {"Not at all", "A little bit", "Moderately", "Quite a bit","Extremely"},
            {"Not at all", "A little bit", "Moderately", "Quite a bit","Extremely"},
            {"Not at all", "A little bit", "Moderately", "Quite a bit","Extremely"},
            {"Not at all", "A little bit", "Moderately", "Quite a bit","Extremely"},
            {"Not at all", "A little bit", "Moderately", "Quite a bit","Extremely"},
            {"Not at all", "A little bit", "Moderately", "Quite a bit","Extremely"},
            {"Not at all", "A little bit", "Moderately", "Quite a bit","Extremely"},

    };



    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getchoice5(int a){
        String choice = choices[a][4];
        return choice;
    }

    public String getchoice6(int a){
        String choice = choices[a][5];
        return choice;
    }

    public String getchoice7(int a) {
        String choice = choices[a][6];
        return choice;
    }

    public int getlength()
    {
        return questions.length;
    }


}
