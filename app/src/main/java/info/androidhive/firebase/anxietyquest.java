package info.androidhive.firebase;

public class anxietyquest {





        public String questions[] = {
                "Over the past few weeks how often have you been bothered by feeling nervous,anxious or on edge?",
                "Over the past few weeks how often have you been bothered by not being able to stop or control worrying?\n",
                "Over the past few weeks how often have you been bothered by worrying too much about different things?\n",
                "Over the past few weeks how often have you been bothered by having difficulty relaxing?",
                "Over the past few weeks how often have you been bothered by being very restless?\n",
                "Over the past few weeks how often have you been bothered by becoming irritable?",
                "Over the past few weeks how often have you been bothered by feeling afraid as if something awful might happen?",

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


