package info.androidhive.firebase;

public class adhdquest {





    public String questions[] = {
                    "During the last two weeks,did parties or social events scare you?\n",
            "During the last two weeks,did you avoid conversations with people?\n",
            "During the last two weeks,were you afraid of people with authority?",
            "During the last two weeks,did you feel distressed by sweating in front of people?",
            "During the last two weeks,did you avoid activities that made you the center of attention?",
            "During the last two weeks,did you get over emotional about things?\n",
            "During the last two weeks,did you react aggressively on being criticized?\n",

    };

    public String choices[][] = {
            {"Not at all", "Sometimes", "Several Days", "More than half of the days","Everyday"},
            {"Not at all", "Sometimes", "Several Days", "More than half of the days","Everyday"},
            {"Not at all", "Sometimes", "Several Days", "More than half of the days","Everyday"},
            {"Not at all", "Sometimes", "Several Days", "More than half of the days","Everyday"},
            {"Not at all", "Sometimes", "Several Days", "More than half of the days","Everyday"},
            {"Not at all", "Sometimes", "Several Days", "More than half of the days","Everyday"},
            {"Not at all", "Sometimes", "Several Days", "More than half of the days","Everyday"},

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


