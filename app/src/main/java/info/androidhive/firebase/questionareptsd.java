package info.androidhive.firebase;

public class questionareptsd {



    public String questions[] = {
            "In the past month how much have you been bothered by repeated disturbing and unwanted memories of the stressful experience?\n",
            "In the past month how much have you been bothered by suddenly feeling or acting as if the stressful experience was actually happening again?",
            "In the past month how much have you been bothered by feeling very upset or disturbed?",
            "In the past month how much have you been bothered by having strong physical reactions when you think of the stressful experience?",
            "In the past month how much have you been bothered by avoiding thoughts or feelings related to the stressful experience?",
            "In the past month how much have you been bothered by trouble remembering important parts of stressful experience?",
            "In the past month how much distant or cutoff have you been from people?",

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
        return 7;
    }


}
