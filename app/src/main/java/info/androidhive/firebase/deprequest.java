package info.androidhive.firebase;

public class deprequest {



    public String questions[] = {
            "Over the past few weeks how often have you been bothered by having little interest or pleasure in doing daily chores?\n",
            "Over the past few weeks how often have you been bothered by feeling down,depressed or hopeless?\n",
            "Over the past few weeks how often have you been bothered by having troubling falling or staying asleep or sleeping too much?\n",
            "Over the past few weeks how often have you been bothered by feeling tired or having low energy?\n",
            "Over the past few weeks how often have you been bothered by making yourself feel bad about yourself?\n",
            "Over the past few weeks how often have you been bothered by having trouble concentrating?\n",
            "Over the past few weeks how often have you been bothered by moving or speaking so slowly that other people might have noticed?\n",

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
        return 7;
    }


}
