package info.androidhive.firebase;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SurvivalManual3 extends AppCompatActivity {

    ImageButton back;
    ImageView img, top;
    TextView t1,t2;
    char c;
    int i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survival_manual_page3);

        back= findViewById(R.id.back);
        img= findViewById(R.id.img);
        t1= findViewById(R.id.textt1);
        t2= findViewById(R.id.textt2);
        top =findViewById(R.id.top);

        i=getIntent().getIntExtra("choice", 0);
        c=getIntent().getCharExtra("img", 'a');


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if(i==1){
            if(c=='a') //intro 1
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_intro);

                top.setImageDrawable(drawable);
                t1.setText("The American Psychological Association (APA) defines anxiety as “an emotion characterized by feelings of tension, worried thoughts and physical changes like increased blood pressure.”\n" +
                        "\n" +
                        "It is important to know the difference between normal feelings of anxiety and an anxiety disorder that requires medical attention.");
            }
            else if(c=='f') //facts
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.graphh);

                top.setImageDrawable(drawable);
                t1.setText("Anxiety is a general term for several disorders that cause nervousness, fear, apprehension, and worrying.\n" +
                        "These disorders affect how we feel and behave and can cause physical symptoms. Mild anxiety is vague and unsettling, while severe anxiety can seriously affect day-to-day living.\n" +
                        "Anxiety disorders affect 40 million people in the United States (U.S.). It is the most common group of mental illnesses in the country. However, only 36.9 percent of people with the condition receive treatment.");
            }
            else if(c=='s') //symptoms
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_symptoms);

                top.setImageDrawable(drawable);
                t1.setText("There are several different anxiety disorders, each with a distinct set of symptoms. However, common symptoms can include:\n\n" +
                        "-sweating\n" +
                        "-dizziness\n" +
                        "-trembling\n" +
                        "-increased or irregular heartbeat\n" +
                        "-back pain\n" +
                        "-restlessness and fatigue\n" +
                        "-muscle tension\n" +
                        "-being easily startled\n" +
                        "-recurring and ongoing feelings of worry, with or without known stressors\n" +
                        "-avoidance of certain situations that may cause worry, often affecting quality of life");
                t2.setText("\n\nTo receive a diagnosis of generalized anxiety disorder (GAD), a person must:\n" +
                        "\n" +
                        "-experience excessive worry and be anxious about several different events or activities on more days than not for at least six months\n" +
                        "-find it difficult to control the worrying\n" +
                        "-have at least three anxiety symptoms on more days than not in the last six months, including restlessness, fatigue, irritability, muscle tension, difficulty sleeping, and difficulty concentrating\n" +
                        "\nSymptoms must interfere with daily living, causing absence from work or school.");
            }
            else if(c=='e') //types
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.type);

                top.setImageDrawable(drawable);
                t1.setText("Anxiety disorders can be classified into six main types. These include:\n" +
                        "\n" +
                        "Generalized anxiety disorder (GAD): This is a chronic disorder involving excessive, long-lasting anxiety and worries about nonspecific life events, objects, and situations. It is the most common anxiety disorder. People with GAD are not always able to identify the cause of their anxiety.\n" +
                        "Panic disorder: Brief or sudden attacks of intense terror and apprehension characterize panic disorder. These attacks can lead to shaking, confusion, dizziness, nausea, and breathing difficulties. Panic attacks tend to occur and escalate rapidly and peak after 10 minutes. However, they may last for hours.\n" +
                        "Panic disorders usually occur after frightening experiences or prolonged stress but can also occur without a trigger. An individual experiencing a panic attack may misinterpret it as a life-threatening illness. Panic attacks can also lead to drastic changes in behavior to avoid future attacks.");
                t2.setText("Phobia: This is an irrational fear and avoidance of an object or situation. Phobias differ from other anxiety disorders, as they relate to a specific cause. The fear may be acknowledged as irrational or unnecessary, but the person is still unable to control the anxiety. Triggers for a phobia may be as varied as situations, animals, or everyday objects.\n" +
                        "Social anxiety disorder: This is a fear of being negatively judged by others in social situations or a fear of public embarrassment. This includes a range of feelings, such as stage fright, a fear of intimacy, and a fear of humiliation. This disorder can cause people to avoid public situations and human contact to the point that everyday living is rendered extremely difficult.\n" +
                        " \n" +
                        "\n" +
                        "Obsessive-compulsive disorder (OCD): This is an anxiety disorder characterized by thoughts or actions that are repetitive, distressing, and intrusive. OCD suffers usually know that their compulsions are unreasonable or irrational, but they serve to alleviate their anxiety. People with OCD may obsessively clean personal items or hands or constantly check locks, stoves, or light switches.\n" +
                        "Post-traumatic stress disorder (PTSD): This is anxiety that results from previous trauma such as military combat, sexual assault, a hostage situation, or a serious accident. PTSD often leads to flashbacks, and the person may make behavioral changes to avoid triggers.\n" +
                        "Separation anxiety disorder: This is characterized by high levels of anxiety when separated from a person or place that provides feelings of security or safety. Separation sometimes results in panic symptoms. It is considered a disorder when the response is excessive or inappropriate after separation.");
            }
            else if(c=='b') //intro 2
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro3);

                top.setImageDrawable(drawable);
                t1.setText("Ever since the earliest days of humanity, the approach of predators and incoming danger has set off alarms in the body and allowed an individual to take evasive action. These alarms become noticeable in the form of a raised heartbeat, sweating, and increased sensitivity to surroundings.\n" +
                        "A rush of adrenaline in response to danger causes these reactions. This adrenaline boost is known as the ‘fight-or-flight’ response. It prepares humans to physically confront or flee any threats to safety.");
                t2.setText("For most modern individuals, running from larger animals and imminent danger is a less pressing concern. Anxieties now revolve around work, money, family life, health, and other crucial issues that demand a person’s attention without necessarily requiring the ‘fight-or-flight’ reaction.\n" +
                        "\n" +
                        "That nervous feeling before an important life event or during a difficult situation is a natural echo of the original ‘fight-or-flight’ reaction. It can still be essential to survival – anxiety about being hit by a car when crossing the street, for example, means that a person will instinctively look both ways to avoid danger.");
            }
            else if(c=='c') //causes
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_causes);

                top.setImageDrawable(drawable);
                t1.setText("Anxiety disorders have a complicated network of causes, including:\n\n" +
                        "-environmental factors, such as stress from a personal relationship, job, school, finances, traumatic event, or even a shortage of oxygen in high-altitude areas\n" +
                        "-genetics\n" +
                        "-medical factors, such as the side effects of medicine, symptoms of a condition, or stress from a serious underlying medical condition\n" +
                        "-brain chemistry\n" +
                        "-use of or withdrawal from an illicit substance");
            }
            else if(c=='r') //risk factors
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_risk);

                top.setImageDrawable(drawable);
                t1.setText("Some of these risk factors of anxiety include:\n\n" +
                        "Personality: Certain personalities, like being introverted, are more prone to developing anxiety disorders.\n" +
                        "Substance abuse: Withdrawal from substances or continued alcohol and drug abuse can lead to anxiety disorders.\n" +
                        "Being female: Statistics reveal that anxiety disorders most commonly occur in women.\n" +
                        "Trauma: Childhood or even adult trauma can develop into anxiety disorders.\n" +
                        "Stress: Whether it is stress due to a pre-existing illness, or stress from everyday life, stress is a large risk factor for anxiety.\n" +
                        "Mental Health issues: Pre-existing mental health disorders, like depression, are among the top risk factors of anxiety.\n" +
                        "Family members: People who have family members with anxiety disorders are at higher risk of developing it themselves.");
            }
            else if(c=='d') //intro 3
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro2);

                top.setImageDrawable(drawable);
                t1.setText("Treating a person with anxiety depends on the causes of the anxiety and individual preferences. Often, treatments will consist of a combination of psychotherapy, behavioral therapy, and medication.");
                t2.setText("Alcohol dependence, depression, or other conditions can sometimes have such a strong effect on the individual that treating the anxiety disorder must wait until any underlying conditions are brought under control.");
            }
            else if(c=='t') //therapy
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.therapy);

                top.setImageDrawable(drawable);
                t1.setText("Self-treatment\n\n" +
                        "In some cases, anxiety can be treated at home without a doctor's supervision. However, this may be limited to shorter periods of anxiety and more obvious causes.\n" +
                        "There are several exercises and actions that are recommended to cope with this type of anxiety:\n" +
                        "\n" +
                        "Stress management: Learning to manage stress can help limit potential triggers. Keep an eye on pressures and deadlines, compile lists to make daunting tasks more manageable, and commit to taking time off from study or work.\n" +
                        "Relaxation techniques: Simple activities can be used to relax mental and physical signs of anxiety. These include meditation, deep breathing exercises, long baths, resting in the dark, and yoga.\n" +
                        "Exercises to replace negative thoughts with positive ones: Make a list of the negative thoughts you experience, and write down a list of positive, believable thoughts to replace them. Picturing yourself successfully facing and conquering a specific fear can also be beneficial if the anxiety symptoms are related to a specific cause.\n" +
                        "Support network: Talk with a person who is supportive, such as a family member or friend.\n" +
                        "Exercise: Physical exertion can improve self-image and release chemicals in the brain that trigger positive feelings.");
                t2.setText("Counseling\n\n" +
                        "A standard way of treating anxiety is psychological counseling. This can include cognitive-behavioral therapy (CBT), psychotherapy, or a combination of therapies.\n" +
                        "CBT aims to recognize and change the thinking patterns associated with the anxiety and troublesome feelings, limit distorted thinking, and change the way people react to objects of situations that trigger anxiety.\nPsychotherapy is another type of counseling. It consists of talking with a trained mental health professional, psychiatrist, psychologist, social worker, or counselor.");
            }
            else if(c=='m') //medication
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.med);

                top.setImageDrawable(drawable);
                t1.setText("Anxiety can be treated using several types of drugs.\n" +
                        "In cases where anxiety has a physical cause, such as an imbalance in brain chemistry or high blood pressure, drugs will be prescribed to treat the underlying condition.\n" +
                        "Other medicines are used to control some of the physical and mental symptoms include antidepressants (like fluoxetine, or Prozac, and citalopram, or Celexa), benzodiazepines (like Diazepam, or Valium), tricyclics (like mipramine and clomipramine), and beta-blockers.");
                t2.setText("Additional drugs used to treat anxiety include:\n" +
                        "-monoamine oxidase inhibitors (MAOIs)\n" +
                        "-buspirone");
            }
        } else if(i==2){
            if(c=='a')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_intro);

                top.setImageDrawable(drawable);
                t1.setText("Sadness, feeling down, having a loss of interest or pleasure in daily activities - these are symptoms familiar to all of us. But, if they persist and affect our life substantially, it may be depression.");
                t2.setText("According to the Centers for Disease Control and Prevention (CDC), 7.6 percent of people over the age of 12 have depression in any 2-week period. This is substantial and shows the scale of the issue.\n" +
                        "According to the World Health Organization (WHO), depression is the most common illness worldwide and the leading cause of disability. They estimate that 350 million people are affected by depression, globally.");
            }
            else if(c=='f')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.graphh);

                top.setImageDrawable(drawable);
                t1.setText("Depression seems to be more common among women than men.\n" +
                        "Symptoms include lack of joy and reduced interest in things that used to bring a person happiness.\n" +
                        "Life events, such as bereavement, produce mood changes that can usually be distinguished from the features of depression.\n" +
                        "The causes of depression are not fully understood but are likely to be a complex combination of genetic, biological, environmental, and psychosocial factors.");
            }
            else if(c=='e')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.type);

                top.setImageDrawable(drawable);
                t1.setText("Unipolar and bipolar depression:\n" +
                        "If the predominant feature is a depressed mood, it is called unipolar depression. However, if it is characterized by both manic and depressive episodes separated by periods of normal mood, it is referred to as bipolar disorder (previously called manic depression). Unipolar depression can involve anxiety and other symptoms - but no manic episodes. However, research shows that for around 40 percent of the time, individuals with bipolar disorder are depressed, making the two conditions difficult to distinguish.\n\n" +
                        "Major depressive disorder with psychotic features:\n" +
                        "This condition is characterized by depression accompanied by psychosis. Psychosis can involve delusions - false beliefs and detachment from reality, or hallucinations - sensing things that do not exist.");
                t2.setText("Postpartum depression:\n" +
                        "Women often experience \"baby blues\" with a newborn, but postpartum depression - also known as postnatal depression - is more severe.\n\n" +
                        "Major depressive disorder with seasonal pattern:\n" +
                        "Previously called seasonal affective disorder (SAD), this condition is related to the reduced daylight of winter - the depression occurs during this season but lifts for the rest of the year and in response to light therapy. " +
                        "Countries with long or severe winters seem to be affected more by this condition.");
            }
            else if(c=='b')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro3);

                top.setImageDrawable(drawable);
                t1.setText("In the detection section you have seen how a depression can present itself. In the next section, you will get to know some explanations that discuss how a depression might arise and why it dosen't just disappear on it's own.");
                t2.setText("Depression is different from the fluctuations in mood that people experience as a part of normal life. Temporary emotional responses to the challenges of everyday life do not constitute depression. " +
                        "Likewise, even the feeling of grief resulting from the death of someone close is not itself depression if it does not persist. Depression can, however, be related to bereavement - when depression follows a loss, psychologists call it a \"complicated bereavement.\"");
            }
            else if(c=='s')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_symptoms);

                top.setImageDrawable(drawable);
                t1.setText("- depressed mood\n" +
                        "- reduced interest or pleasure in activities previously enjoyed, loss of sexual desire\n" +
                        "- unintentional weight loss (without dieting) or low appetite\n" +
                        "- insomnia (difficulty sleeping) or hypersomnia (excessive sleeping)\n" +
                        "- psychomotor agitation, for example, restlessness, pacing up and down\n" +
                        "- delayed psychomotor skills, for example, slowed movement and speech\n" +
                        "- fatigue or loss of energy\n" +
                        "- feelings of worthlessness or guilt\n" +
                        "- impaired ability to think, concentrate, or make decisions\n" +
                        "- recurrent thoughts of death or suicide, or attempt at suicide");
            }
            else if(c=='c')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_causes);

                top.setImageDrawable(drawable);
                    t1.setText("The causes of depression are not fully understood and may not be down to a single source. Depression is likely to be due to a complex combination of factors that include:\n" +
                            "\n" +
                            "-Depression has a wide range of causes and potential treatments.\n" +
                            "-genetics\n" +
                            "-biological - changes in neurotransmitter levels\n" +
                            "-environmental\n" +
                            "-psychological and social (psychosocial");
            }
            else if(c=='r')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_risk);

                top.setImageDrawable(drawable);
                t1.setText("-Life events: These include bereavement, divorce, work issues, relationships with friends and family, financial problems, medical concerns, or acute stress.\n" +
                        "-Personality: Those with less successful coping strategies, or previous life trauma are more suceptible.\n" +
                        "-Genetic factors: Having a first-degree relatives with depression increases the risk.\n" +
                        "-Childhood trauma.\n" +
                        "-Some prescription drugs: These include corticosteroids, some beta-blockers, interferon, and other prescription drugs.\n" +
                        "-Abuse of recreational drugs: Abuse of alcohol, amphetamines, and other drugs are strongly linked to depression.\n" +
                        "-A past head injury.\n" +
                        "-Having had one episode of major depression: This increases the risk of a subsequent one.\n" +
                        "-Chronic pain syndromes: These and other chronic conditions, such as diabetes, chronic obstructive pulmonary disease, and cardiovascular disease make depression more likely.");
            }
            else if(c=='m')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.med);

                top.setImageDrawable(drawable);
                    t1.setText("Antidepressants are drugs available on prescription from a doctor. Drugs come into use for moderate to severe depression, but are not recommended for children, and will be prescribed only with caution for adolescents.");
                    t2.setText("A number of classes of medication are available in the treatment of depression:\n" +
                            "-selective serotonin reuptake inhibitors (SSRIs)\n" +
                            "-monoamine oxidase inhibitors (MAOIs)\n" +
                            "-tricyclic antidepressants\n" +
                            "-atypical antidepressants\n" +
                            "-selective serotonin and norepinephrine reuptake inhibitors (SNRI)\n\n" +
                            "Each class of antidepressant acts on a different neurotransmitter. The drugs should be continued as prescribed by the doctor, even after symptoms have improved, to prevent relapse.\n" +
                            "A warning from the Food and Drug Administration (FDA) says that \"antidepressant medications may increase suicidal thoughts or actions in some children, teenagers, and young adults within the first few months of treatment.\"\n" +
                            "Any concerns should always be raised with a doctor - including any intention to stop taking antidepressants.");
            }
            else if(c=='t')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.therapy);

                top.setImageDrawable(drawable);
                t1.setText("Depression is a treatable mental illness. There are three components to the management of depression:\n" +
                        "-Support, ranging from discussing practical solutions and contributing stresses, to educating family members.\n" +
                        "-Psychotherapy, also known as talking therapies, such as cognitive behavioral therapy (CBT).\n" +
                        "-Drug treatment, specifically antidepressants.");
                t2.setText("Psychotherapy:\n" +
                        "Psychological or talking therapies for depression include cognitive-behavioral therapy (CBT), interpersonal psychotherapy, and problem-solving treatment. In mild cases of depression, psychotherapies are the first option for treatment; in moderate and severe cases, they may be used alongside other treatment.\n" +
                        "CBT and interpersonal therapy are the two main types of psychotherapy used in depression. CBT may be delivered in individual sessions with a therapist, face-to-face, in groups, or over the telephone. Some recent studies suggest that CBT may be delivered effectively through a computer\n" +
                        "Interpersonal therapy helps patients to identify emotional problems that affect relationships and communication, and how these, in turn, affect mood and can be changed.\n\n" + "Exercise and other therapies:\n" +
                        "Aerobic exercise may help against mild depression since it raises endorphin levels and stimulates the neurotransmitter norepinephrine, which is related to mood.\n" +
                        "\n" +
                        "Brain stimulation therapies - including electroconvulsive therapy - are also used in depression. Repetitive transcranial magnetic stimulation sends magnetic pulses to the brain and may be effective in major depressive disorder.\n\n" +
                        "Electroconvulsive therapy:\n" +
                        "Severe cases of depression that have not responded to drug treatment may benefit from electroconvulsive therapy (ECT); this is particularly effective for psychotic depression.");
            }
            else if(c=='d')
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro2);

                top.setImageDrawable(drawable);
                t1.setText("Diagnosis of depression starts with a consultation with a doctor or mental health specialist. It is important to seek the help of a health professional to rule out different causes of depression, ensure an accurate differential diagnosis, and secure safe and effective treatment.");
                t2.setText("As for most visits to the doctor, there may be a physical examination to check for physical causes and coexisting conditions. Questions will also be asked - \"taking a history\" - to establish the symptoms, their time course, and so on.");
            }
        } else if(i==3){
            if(c=='a') //intro 1
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_intro);

                top.setImageDrawable(drawable);
                t1.setText("Post-traumatic stress disorder can happen to a person after experiencing a traumatic event that has caused them to feel fearful, shocked, or helpless. It can have long-term effects, including flashbacks, difficulty sleeping, and anxiety.\n\n" +
                        "Examples of events that can trigger post-traumatic stress disorder (PTSD) include wars, crimes, fires, accidents, death of a loved one, or abuse of some form. Thoughts and memories recur even though the danger has passed.");
            }
            else if(c=='f') //facts
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.graphh);

                top.setImageDrawable(drawable);
                t1.setText("It is thought to affect between 7 and 8 percent of the population, and women are more likely to be affected than men.\n\n" +
                        "Instead of feeling better as time goes on, the individual may become more anxious and fearful. PTSD can disrupt a person's life for years, but treatment can help them recover.");
            }
            else if(c=='s') //symptoms
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_symptoms);

                top.setImageDrawable(drawable);
                t1.setText("Intrusion symptoms:\n" +
                        "-nightmares\n" +
                        "-flashbacks and a sensation that the event is happening again\n" +
                        "-fearful thoughts\n\n" +
                        "Avoidance symptoms:\n" +
                        "-refusing to discuss the event\n" +
                        "-avoiding situations that remind the person of the event");
                t2.setText("Arousal and reactivity symptoms:\n" +
                        "-difficulty sleeping\n" +
                        "-irritability and angry outbursts\n" +
                        "-hypersensitivity to possible dangers\n" +
                        "-feeling tense and anxious\n\n" +
                        "Symptoms that affect mood and thinking:\n" +
                        "-inability to remember some aspects of the event\n" +
                        "-feelings of guilt and blame\n" +
                        "-feeling detached and estranged from others and emotionally and mentally numbed\n" +
                        "-having a reduced interest in life\n" +
                        "-difficulty concentrating\n" +
                        "-mental health problems, such as depression, phobias, and anxiety ");
            }
            else if(c=='e') //types
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.type);

                top.setImageDrawable(drawable);
                t1.setText("There are five main types of post-traumatic stress disorder: normal stress response, acute stress disorder, uncomplicated PTSD, comorbid PTSD and complex PTSD.");
                t2.setText("-Normal Stress Response:\n" +
                        "The normal stress response occurs when healthy adults who have been exposed to a single discrete traumatic event in adulthood experience intense bad memories, emotional numbing, feelings of unreality, being cut off from relationships or bodily tension and distress. Such individuals usually achieve complete recovery within a few weeks. Often a group debriefing experience is helpful. Debriefings begin by describing the traumatic event. They then progress to exploration of survivors’ emotional responses to the event. Next, there is an open discussion of symptoms that have been precipitated by the trauma. Finally, there is education in which survivors’ responses are explained and positive ways of coping are identified.\n" +
                        "\n-Acute Stress disorder:\n" +
                        "Acute stress disorder is characterized by panic reactions, mental confusion, dissociation, severe insomnia, suspiciousness, and being unable to manage even basic self care, work, and relationship activities. Relatively few survivors of single traumas have this more severe reaction, except when the trauma is a lasting catastrophe that exposes them to death, destruction, or loss of home and community. Treatment includes immediate support, removal from the scene of the trauma, use of medication for immediate relief of grief, anxiety, and insomnia, and brief supportive psychotherapy provided in the context of crisis intervention.\n" +
                        "\n-Uncomplicated PTSD:\n" +
                        "\n" +
                        "Uncomplicated PTSD involves persistent reexperiencing of the traumatic event, avoidance of stimuli associated with the trauma, emotional numbing, and symptoms of increased arousal. It may respond to group, psychodynamic, cognitive-behavioral, pharmacological, or combination approaches.\n" +
                        "\n-Comorbid PTSD:\n" +
                        "PTSD comorbid with other psychiatric disorders is actually much more common than uncomplicated PTSD. PTSD is usually associated with at least one other major psychiatric disorder such as depression, alcohol or substance abuse, panic disorder, and other anxiety disorders. The best results are achieved when both PTSD and the other disorder(s) are treated together rather than one after the other. This is especially true for PTSD and alcohol or substance abuse. The same treatments used for uncomplicated PTSD should be used for these patients, with the addition of carefully managed treatment for the other psychiatric or addiction problems.\n" +
                        "\n-Complex PTSD:\n" +
                        "Complex PTSD (sometimes called “Disorder of Extreme Stress”) is found among individuals who have been exposed to prolonged traumatic circumstances, especially during childhood, such as childhood sexual abuse. These individuals often are diagnosed with borderline or antisocial personality disorder or dissociative disorders. They exhibit behavioral difficulties (such as impulsivity, aggression, sexual acting out, eating disorders, alcohol or drug abuse, and self-destructive actions), extreme emotional difficulties (such as intense rage, depression, or panic) and mental difficulties (such as fragmented thoughts, dissociation, and amnesia). The treatment of such patients often takes much longer, may progress at a much slower rate, and requires a sensitive and highly structured treatment program delivered by a team of trauma specialists.");
            }
            else if(c=='b') //intro 2
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro3);

                top.setImageDrawable(drawable);
                t1.setText("For a person to receive a diagnosis of PTSD, they must meet criteria that are set out by the American Psychological Association's (APA) Diagnostic and Statistical Manual Fifth Edition (DSM-5).");
                t2.setText("According to these guidelines, the person must:\n\n" +
                        "1. Have been exposed to death or threatened death, serious injury or sexual violence whether directly, through witnessing it, by it happening to a loved one, or during professional duties\n" +
                        "2. Experience the following for more than one month:\n" +
                        "\t-one or more intrusion symptoms\n" +
                        "\t-one or more avoidance symptoms\n" +
                        "\t-two or more symptoms that affect mood and thinking\n" +
                        "\t-two or more arousal and reactivity symptoms that began after the trauma");
            }
            else if(c=='c') //causes
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_causes);

                top.setImageDrawable(drawable);
                t1.setText("PTSD can develop after a traumatic event.\n\n" +
                        "Examples include:\n" +
                        "-military confrontation\n" +
                        "-natural disasters\n" +
                        "-serious accidents\n" +
                        "-terrorist attacks\n" +
                        "-loss of a loved one, whether or not this involved violence\n" +
                        "-rape or other types of abuse\n" +
                        "-personal assault\n" +
                        "-being a victim of crime\n" +
                        "-receiving a life-threatening diagnosis\n" +
                        "-Any situation that triggers fear, shock, horror, or helplessness can lead to PTSD.");
            }
            else if(c=='r') //risk factors
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_risk);

                top.setImageDrawable(drawable);
                t1.setText("It remains unclear why some people develop PTSD while others do not. However, the following risk factors may increase the chance of experiencing symptoms:\n\n" +
                        "-having additional problems after an event, for example, losing a loved one and losing a job\n" +
                        "-lacking social support after an event\n" +
                        "-having a history of mental health problems or substance use\n" +
                        "-past experience of abuse, for example, during childhood\n" +
                        "-having poor physical health before or as a result0 of an event");
                t2.setText("Some physical and genetic factors may play a role. These may impact the chance of having anxiety, depression, and PTSD.\n\n" +
                        "Brain structure: Brain scans have shown that the hippocampus appears different in people with PTSD, compared with others. The hippocampus is involved in processing emotions and memories, and it could affect the chance of having flashbacks\n" +
                        "Response to stress: Levels of hormones that are normally released in a fight-or-flight situation appear to be different in people with PTSD.\n" +
                        "Gender: This may play a role. Studies suggest that, while men are more likely to experience violence, women have a higher chance of having PTSD.");
            }
            else if(c=='d') //intro 3
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro2);

                top.setImageDrawable(drawable);
                t1.setText("Many people experience symptoms after a traumatic event, such as crying, anxiety, and difficulty concentrating, but this is not necessarily PTSD.\n" +
                        "Prompt treatment with a qualified professional can help prevent the symptoms from getting worse.\n\n" +
                        "This should be considered if:\n" +
                        "-symptoms persist for more than a month\n" +
                        "-symptoms are severe enough to prevent the person returning to normal life\n" +
                        "-the person considers harming themselves");
                t2.setText("Treatment usually involves psychotherapy and counseling, medication, or a combination.");
            }
            else if(c=='t') //therapy
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.therapy);

                top.setImageDrawable(drawable);
                t1.setText("Options for psychotherapy will be specially tailored for managing trauma.\n\n" +
                        "They include:\n\n" +
                        "Cognitive processing therapy (CPT): Also known as cognitive restructuring, the individual learns how to think about things in a new way. Mental imagery of the traumatic event may help them work through the trauma, to gain control of the fear and distress.\n\n" +
                        "Exposure therapy: Talking repeatedly about the event or confronting the cause of the fear in a safe and controlled environment may help the person feel they have more control over their thoughts and feelings. The effectiveness of this treatment has been questioned, however, and it must be carried out with care, or there may be a risk of worsening of the symptoms.");
                t2.setText("Experimental therapies\n" +
                        "Research has suggested that the following therapies may help, but further evidence is needed to confirm their safety and effectiveness.\n" +
                        "\n" +
                        "Eye movement desensitization and reprocessing (EMDR): Recalling the event while making a specific kind of side-to-side eye movement may help lower distress levels for people with PTSD. This allows the individual to have more positive emotions, behaviors, and thoughts.\n\n" +
                        "MDMA: The pharmaceutical version of the recreational drug, ecstasy, may help people learn to deal with their memories more effectively by encouraging a feeling of safety. Scientists are currently researching this option.\n\n" +
                        "Cortisone hormone therapy: One study has suggested that high-dose cortisol-based treatments could help reduce the risk of PTSD, if given soon after a trauma occurs.\n\n" +
                        "Computer games: Playing some computer games has been linked with fewer symptoms in some veterans with PTSD, according to a study published in 2017. However, the researchers do not recommend using computer games instead of regular therapy.");
            }
            else if(c=='m') //medication
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.med);

                top.setImageDrawable(drawable);
                t1.setText("Selective serotonin reuptake inhibitors (SSRIs), such as paroxetine, are commonly used. SSRIs also help treat depression, anxiety and sleep problems, symptoms that are often linked to PTSD. There have been some reports that antidepressant medications can cause an increased risk of suicide in individuals under the age of 24.");
                t2.setText("Sometimes, benzodiazepines may be used to treat irritability, insomnia, and anxiety. However, the National Center for PTSD do not recommend these, because they do not treat the core symptoms and they can lead to dependency.");
            }
        } else if(i==4){
            if(c=='a') //intro 1
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_intro);

                top.setImageDrawable(drawable);
                t1.setText("An individual with ADHD finds it much more difficult to focus on something without being distracted.");
                t2.setText("He/she is likely to have greater difficulty in controlling what he/she is doing or saying and is less able to control how much physical activity is appropriate for a particular situation compared to somebody without ADHD. In other words, a person with ADHD is much more impulsive and restless.");
            }
            else if(c=='f') //facts
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.graphh);

                top.setImageDrawable(drawable);
                t1.setText("According to the American Psychiatric Association (APA), 5% of American children have ADHD. However, it should be noted that studies in the US have estimated higher rates as a result0 of surveys in the community. These surveys asked parents whether they had received a diagnosis of ADHD from a healthcare professional.\n" +
                        "\nThe survey results, published by the Centers for Disease Control and Prevention (CDC), estimate that approximately 6.4 million children (11%) aged 4 to 17 were diagnosed with ADHD in the US by a healthcare professional (as of 2011). This is a rise from 7.8% in 2003 (CDC data).\n" +
                        "\nAn interesting statistic from the same CDC survey results shows that boys (13.2%) were more likely than girls (5.6%) to have received an ADHD diagnosis.");
            }
            else if(c=='s') //symptoms
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_symptoms);

                top.setImageDrawable(drawable);
                t1.setText("-the child is restless, overactive, fidgety\n" +
                        "-the child is constantly chattering\n" +
                        "-the child is continuously interrupting people\n" +
                        "-the child cannot concentrate for long on specific tasks\n" +
                        "-the child is inattentive\n" +
                        "-the child finds it hard to wait his/her turn in play, conversations or standing in line (queue)");
                t2.setText("\nIt is important to note that the above signs may be observed in children frequently and usually do not mean the child has ADHD. It is when these signs become significantly more pronounced in one child, compared to other children of the same age, and when his/her behavior undermines his/her school and social life, that the child may have ADHD.");
            }
            else if(c=='e') //types
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.type);

                top.setImageDrawable(drawable);
                t1.setText("According to the CDC, there are three types of ADHD. They are defined according to which symptoms stand out the most.\n\n" +
                        " -Predominantly Inattentive Type:\n" +
                        "The person finds it very difficult to organize or finish a task. They find it hard to pay attention to details and find it difficult to follow instructions or conversations.\n" +
                        " \n-Predominantly Hyperactive-Impulsive Type:\n" +
                        "The person finds it hard to keep still - they fidget and talk a lot. A smaller child may be continually jumping, running or climbing. They are restless and impulsive - interrupting others, grabbing things and speaking at inappropriate times. They have difficulty waiting their turn and find it hard to listen to directions. A person with this type of ADHD will have more injuries and/or accidents than others.\n" +
                        " \n-Combined Type:\n" +
                        "A person whose symptoms include all those of 1 and 2, and whose symptoms are equally predominant. In other words, all the symptoms in 1 and 2 stand out equally.");
            }
            else if(c=='b') //intro 2
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro3);

                top.setImageDrawable(drawable);
                t1.setText("ADHD cannot be diagnosed physically, i.e. with a blood test, urine test, brain scan or a physical check up. As most children have problems with self-control anyway, a proper diagnosis can be quite challenging.\n" +
                        "An ADHD diagnosis has to be carried out by a specialist - usually a psychiatrist, psychologist or pediatrician. The specialist will observe the child and recognize behavior patterns. Data regarding the child's behavior at home and at school will also be studied. Only a specialist will be able to accurately detect whether other problems and/or conditions are resulting in ADHD-like behavioral characteristics.\n" +
                        "Diagnosing ADHD with EEG (electroencephalogram) - in July 2013, the US Food and Drug Administration (FDA) approved the NEBA System (Neuropsychiatric EEG-Based Assessment Aid) to help doctors more accurately diagnose ADHD in children.");
            }
            else if(c=='c') //causes
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_causes);

                top.setImageDrawable(drawable);
                t1.setText("ADHD has a number of likely causes — though the medical community still can’t pinpoint exactly which one explains the symptoms.\n" +
                        "What we do know is that ADHD is not caused by bad parenting, too much sugar, or too many video games. It is a brain-based, biological disorder. Brain imaging studies and other research show many physiological differences in the brains of individuals with ADHD.5\n" +
                        "Other studies reveal that a child with ADHD is four times as likely to have had a relative also diagnosed with the condition — clearly pointing to a genetic factor. Researchers in the U.S. and Europe are working now to determine which specific genes make an individual susceptible to ADHD. Scientists are investigating many different genes, especially ones linked to the neurotransmitter dopamine that may play a role in developing ADHD. They believe it likely involves at least two genes, since ADHD is such a complex disorder.6\n" +
                        "In addition, scientific research suggests that exposure to dangerous chemicals — everyday toxins found in foods, carpeting and flooring, cleaning and lawn products, and personal-care products like toothpastes — may contribute substantially to disorders such as ADHD, autism, and learning disabilities.7,8,9 When toxins disrupt brain development, disabilities like ADHD can occur.");
            }
            else if(c=='r') //risk factors
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_risk);

                top.setImageDrawable(drawable);
                t1.setText("Genetics and ADHD:\n" +
                        "\"Far and away, the biggest risk factor for ADHD is genes,\" says Scott Kollins, PhD, director of the Duke ADHD Program at Duke University Medical Center. And while the triggers for ADHD are unclear, studies show that one in four children with ADHD have at least one first-degree relative (parent or sibling) with the disorder."
                +"\nEnvironmental Contributors for ADHD:\n" +
                        "From an environmental perspective, in utero exposure to nicotine and heavy metals like lead increases the risk of developing ADHD in childhood. Such substances are toxic to developing brain tissue and can have sustained effects on behavior. \"It's not known how much exposure is necessary, but studies show a definite link,\" says Sallee."
                +"\nComplicating Conditions of ADHD:\n" +
                        "ADHD does not occur in a vacuum. \"The rates of just about every psychiatric disorder are higher among people who have ADHD,\" says Kollins. In one study, 87 percent of patients had at least one psychological disorder such as depression or anxiety. People with ADHD are also much more likely to self-medicate with alcohol or drugs and have higher rates of substance abuse than adults without the disorder.");
            }
            else if(c=='d') //intro 3
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro2);

                top.setImageDrawable(drawable);
                t1.setText("Twenty-minute exercise sessions can significantly improve focus in children with ADHD, researchers from Michigan State University reported in the Journal of Pediatrics, October 2012 issue.\n" +
                        "Team leader, Prof. Matthew Pontifex, added that the children became much less distracted during classroom tasks after the physical activity. This could be significant, because the greatest problem children with ADHD have to struggle with is “inhibitory control”.\n" +
                        "After the work out, the kids had much better results in reading comprehension and math tests.\n" +
                        "Pontifex believes children should have more physical activity incorporated into their daily school schedule.");
            }
            else if(c=='t') //therapy
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.therapy);

                top.setImageDrawable(drawable);
                t1.setText("Behaviour Therapy:\n\n" + "Behavior therapy can help change behavior through conditioning, which involves the following:\n" +
                        "-Creating an environment conducive to suitable behavior\n" +
                        "-Providing positive feedback and reinforcement for acceptable behavior and improvement\n" +
                        "-Establishing clear consequences for unwanted behavior, which may entail withholding reward/praise, or enforcing negative consequences\n" +
                        "-Being consistent about expectations and consequences, both positive and negative\n" +
                        "-Behavior therapy changes negative habits and behaviors in many adults.");
                t2.setText("Cognitive Behavioral Therapy (CBT)\n\n"+"This approach, often used in combination with medication, is implemented by a therapist who works with you to pinpoint problem behaviors and to develop strategies for changing them. CBT is a short-term, goal-oriented form of psychotherapy that aims to change negative patterns of thinking and change the way a patient feels about herself, her abilities, and her future. Here’s how it works:\n" +
                        "-Choose one problem behavior — procrastination, say — to work on at a time.\n" +
                        "-Understand the motivation for the behavior, and change the thoughts and perceptions that cause it\n" +
                        "-Develop practical ways to change the behavior\n" +
                        "-Implement the strategies, and try new ones if they don’t work");
            }
            else if(c=='m') //medication
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.med);

                top.setImageDrawable(drawable);
                t1.setText("Amphetamines\n\n" +
                        "Amphetamines stimulate the central nervous system and the sympathetic part of the peripheral nervous system. You can read more about them in our article here. Common amphetamines used to treat ADHD include:\n" +
                        "-Adderal (two strengths, one for short period, one for longer periods)\n" +
                        "-Dexedrine (lower dosage - taken several times a day)\n\n" +
                        "Methylphenidate\n" +
                        "-Ritalin\n" +
                        "-Ritalin LA (will last up to 12 hours)\n" +
                        "-Methylin\n" +
                        "-Focalin\n" +
                        "-Focalin XR (will last up to 12 hours)\n" +
                        "-Metadate CD");
                t2.setText("Other medications\n\n" +
                        "-Atomoxetine HCI (Strattera)\n" +
                        "-Bupropion (Wellbutrin XL)\n" +
                        "-Benzphetamine\n" +
                        "-Clonidine\n" +
                        "-Provigil");
            }
        } else if(i==5){
            if(c=='a') //intro 1
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_intro);

                top.setImageDrawable(drawable);
                t1.setText("The majority of cases of BPD begin to occur in early adulthood. The manner in which a person with BPD interacts with others is closely associated with their self-image and early social interactions. BPD causes the following behavioral disturbances:\n" +
                        "-distorted perceptions\n" +
                        "-disturbed relationships\n" +
                        "-excessive emotional responses\n" +
                        "-harmful, impulsive actions\n\n" +
                        "People with BPD often have a distorted self-image and may feel as though they are flawed and worthless.");
            }
            else if(c=='f') //facts
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.graphh);

                top.setImageDrawable(drawable);
                t1.setText("-People with BPD have problems regulating thoughts, emotions, and self-image. They can be impulsive and reckless, and often have unstable relationships with other people.\n" +
                        "-Most cases of BPD begin in the early stages of adulthood, seem to be worse in young adulthood, but symptoms may get better with age.\n" +
                        "-Experts do not know what causes BPD. Genetics, environmental factors, and brain abnormalities are thought to play a role.\n" +
                        "-BPD is commonly treated with psychotherapy, aided with medication in some cases.\n" +
                        "-There is no cure for BPD, but symptoms can improve over time.");
            }
            else if(c=='s') //symptoms
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_symptoms);

                top.setImageDrawable(drawable);
                t1.setText("The Diagnostic and Statistical Manual of Mental Disorders, Fifth Edition (DSM-5), published by the American Psychiatric Association, is used to diagnose mental health conditions such as BPD, and by insurance companies to reimburse for treatment of the condition.\n" +
                        "Unlike the DSM-4 (an earlier version), the DSM-5 does not require there to be at least five out of nine specific symptoms present for a diagnosis to be made. Instead, the DSM-5 requires that the following criteria be met:\n");
                t2.setText("Impairments in self functioning:\n" +
                        "-Identity: Poorly developed or unstable self-image, often very self-critical; feelings of emptiness; dissociative states under stress.\n" +
                        "-Self-direction: Changing goals, values, aspirations, or career plans.\n" +
                        "\nImpairments in interpersonal functioning\n" +
                        "-Empathy: Not able to recognize the feelings and needs of others.\n" +
                        "-Intimacy: Intense and unstable close relationships, marked by mistrust, conflict, neediness, and concerns about being abandoned. Close relationships fluctuate between over-involvement and withdrawal.\n" +
                        "\nPathological personality traits\n" +
                        "These include:\n" +
                        "-highly changeable emotions\n" +
                        "-anxiousness\n" +
                        "-separation insecurity\n" +
                        "-often depressed mood\n" +
                        "-Disinhibition, characterized by:\n" +
                        " act impulsively\n" +
                        " take risks\n" +
                        "-Antagonism, characterized by:\n" +
                        " hostility\n" +
                        "Also, the impairments in personality and personality traits are:\n" +
                        "-fairly constant at different times and in different situations\n" +
                        "-not consistent with the individual's developmental stage or place in society\n" +
                        "-not solely due to the use of drugs or other substances, or a medical condition");
            }
            else if(c=='e') //types
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.type);

                top.setImageDrawable(drawable);
                t1.setText("According to Wikipedia, psychologist Theodore Millon identified four subtypes of borderline personality disorder (BPD). They are:\n" +
                        "\n" +
                        "-discouraged borderline:\nincludes avoidant, depressive or dependent behaviors\n" +
                        "-impulsive borderline:\nincludes antisocial or approval-seeking behaviors\n" +
                        "-petulant borderline:\nincludes passive-aggressive behaviors\n" +
                        "-self-destructive borderline:\nincludes depressive or self-destructive behaviors");
            }
            else if(c=='b') //intro 2
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro3);

                top.setImageDrawable(drawable);
                t1.setText("BPD is difficult to diagnose because the condition's symptoms overlap with other mental illnesses, and individual cases can vary greatly.\n" +
                        "Mental health professionals can diagnose BPD following a thorough interview, during which they will complete a psychological evaluation where they ask about a patient's clinical history and their symptoms.");
            }
            else if(c=='c') //causes
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_causes);

                top.setImageDrawable(drawable);
                t1.setText("Three factors have been identified as being likely to play a part in the development of BPD:\n" +
                        "-Genetics: Studies of twins with BPD suggest that a predisposition to the condition is inherited.\n" +
                        "-Environmental (social) factors: Unstable family relationships, child abuse, and neglect have been associated with an increased risk of BPD.\n" +
                        "-Brain abnormalities: BPD has been associated in studies with changes to certain parts of the brain involved in the regulation of emotion.\n\n" +
                        "Many people with BPD have an immediate relative that has a mental illness such as ADHD, bipolar disorder, depression, and schizophrenia.");
            }
            else if(c=='r') //risk factors
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.ic_risk);

                top.setImageDrawable(drawable);
                t1.setText("BPD is more common among those who have first-degree relatives with the disorder. Experts call it a biosocial disorder because it is the result0 of two distinct factors, biological and social. The biological factor in BPD is a temperament that is highly emotionally reactive, quick to get very upset and slow to return to baseline. The social factor is being raised in an environment that does not validate those intense emotions in childhood, either through neglect or ordinary parenting practices that dismiss extreme emotions as overreactions. Without that validation from adults, children may not develop effective skills in emotional regulation, and may instead resort to unhealthy ways of coping with their feelings.");
            }
            else if(c=='d') //intro 3
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.intro2);

                top.setImageDrawable(drawable);
                t1.setText("Current research shows that treatment can decrease the symptoms and suffering of people with BPD.\n" +
                        "Talk therapy is usually the first choice of treatment (unlike some other illnesses where medication is often first.) Generally, treatment involves one to two sessions a week with a mental health counselor. For therapy to be effective, people must feel comfortable with and trust their therapist.\n" +
                        "Some BPD symptoms are easier to treat than others. Fears that others might leave, intense, unstable relationships or feelings of emptiness are often hardest to change. Research shows that treatment is more effective in decreasing anger, suicide attempts and self- harm, as well as helping to improve over-all functioning and social adjustment\n" +
                        "People whose symptoms improve may still have issues related to co-occurring disorders, such as depression, substance abuse, eating disorders, or post-traumatic stress disorder. However, research suggests that full-blown BPD symptoms rarely coming back after remission.");
            }
            else if(c=='t') //therapy
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.therapy);

                top.setImageDrawable(drawable);
                t1.setText("-Cognitive behavioral therapy (CBT): Working with a therapist, patients become aware of negative or ineffective forms of thinking, allowing them to view challenging situations more clearly.\n" +
                        "-Dialectical behavior therapy (DBT): Patients use a skills-based approach alongside both physical and meditative exercises to learn how best to regulate emotions and tolerate distress.\n" +
                        "-Schema-focused therapy (SFT): Based on the idea that BPD comes from a dysfunctional self-image, SFT focuses on reframing how patients view themselves.\n" +
                        "-Mentalization-based therapy (MBT): A form of talk therapy that aids patients in identifying their own thoughts and separating them from those of people around them.\n" +
                        "-Transference-focused psychotherapy (TFP): This uses the developing relationship between patient and therapist to help the individual understand their emotions and interpersonal difficulties.\n" +
                        "-Systems Training for Emotional Predictability and Problem Solving (STEPPS): A form of group therapy led by a social worker that is intended to supplement other forms of treatment.");
            }
            else if(c=='m') //medication
            {
                Drawable drawable  = getResources().getDrawable(R.drawable.med);

                top.setImageDrawable(drawable);
                t1.setText("Medications include:\n\n" +
                        "-Selective serotonin reuptake inhibitors (SSRIs): This practice is not supported by clinical trial evidence, but this class of drugs may be used if the person also has co-occurring anxiety or depressive disorder.\n" +
                        "-Second-generation antipsychotics and mood stabilizers: There is some evidence that these help manage some symptoms of BPD.\n" +
                        "-Omega-3's: There is some evidence that omega-3 fatty acids - commonly found in fish oil - help stabilize mood, reducing symptoms of aggression and depression in BPD, however, further studies are needed.");
            }
        }
    }
}
