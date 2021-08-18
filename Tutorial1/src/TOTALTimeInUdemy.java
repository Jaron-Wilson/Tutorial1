import java.util.ArrayList;
import java.util.List;

public class TOTALTimeInUdemy {

    private static final String START_LINE = "\n ------------------ ";
    private static final String STOP_LINE = " ------------------ ";

    public static void main(String[] args) {


        String udemyurl = "https://www.udemy.com/";
        String url = "https://www.udemy.com/course/java-tutorial/learn/lecture/172757#overview";
        int tutorialCount = 74;
        int tutorialOn = 25;

        List<TutorialDetails> t = new ArrayList<>();
//        t.add(new TutorialDetails("Tutorial", 21, 11));
//        t.add(new TutorialDetails("Tutorial", 22, 10));
//        t.add(new TutorialDetails("Tutorial", 23, 20));
//        t.add(new TutorialDetails("Tutorial", 24, 20));
//        t.add(new TutorialDetails("Tutorial", 25, 11));
//        t.add(new TutorialDetails("Tutorial", 26, 14));
//        t.add(new TutorialDetails("Tutorial", 27, 14));
//        t.add(new TutorialDetails("Tutorial", 28, 19));
//        t.add(new TutorialDetails("Tutorial", 29, 20));
//        t.add(new TutorialDetails("Tutorial", 30, 10));
        t.add(new TutorialDetails("Tutorial", 31, 11));
        t.add(new TutorialDetails("Tutorial", 32, 11));
        t.add(new TutorialDetails("Tutorial", 33, 14));
        t.add(new TutorialDetails("Tutorial", 34, 13));
        t.add(new TutorialDetails("Tutorial", 35, 18));
        t.add(new TutorialDetails("Tutorial", 36, 9));
        t.add(new TutorialDetails("Tutorial", 37, 13));
        t.add(new TutorialDetails("Tutorial", 38, 16));
        t.add(new TutorialDetails("Tutorial", 39, 12));
        t.add(new TutorialDetails("Tutorial", 40, 9));
        t.add(new TutorialDetails("Tutorial", 41, 13));
        t.add(new TutorialDetails("Tutorial", 42, 17));
        t.add(new TutorialDetails("Tutorial", 43, 11));
        t.add(new TutorialDetails("Tutorial", 44, 6));
        t.add(new TutorialDetails("Tutorial", 45, 17));
        t.add(new TutorialDetails("Tutorial", 46, 17));
        t.add(new TutorialDetails("Tutorial", 47, 19));
        t.add(new TutorialDetails("Tutorial", 48, 17));
        t.add(new TutorialDetails("Tutorial", 49, 21));
        t.add(new TutorialDetails("Tutorial", 50, 15));
        t.add(new TutorialDetails("Tutorial", 51, 16));
        t.add(new TutorialDetails("Tutorial", 52, 22));

        double duration = 0.00;
        for(TutorialDetails td : t){
            duration += td.getDuration();
        }


        System.out.println(" ------------------ Tutorial on: " + t.get(0).getChapter() + STOP_LINE + START_LINE + "Total tutorials: " + t.size() + STOP_LINE + START_LINE + "Total tutorials left: " + (tutorialCount-t.size()) + STOP_LINE);

        System.out.println(" ------------------ Total hours left: " + duration / 60.00 + STOP_LINE + START_LINE + "Total minutes left: " + duration + STOP_LINE);

//        System.out.println("First tutorial is: " + url + "\nUdemy.com is: " + udemyurl);

    }


    static class TutorialDetails{
        final String title;
        final int chapter;
        final int duration;

        public TutorialDetails(String title, int chapter, int duration) {
            this.title = title;
            this.chapter = chapter;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public int getChapter() {
            return chapter;
        }

        public int getDuration() {
            return duration;
        }
    }
}