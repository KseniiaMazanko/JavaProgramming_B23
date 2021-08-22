package day48_Recap.SportsTask;

public class Baseball extends Sport{

    public Baseball(int numberOfPlayers, int numberOfReferee, String rules) {
        super(numberOfPlayers, numberOfReferee, rules);
    }


    @Override
    public void play() {
        System.out.println(getNumberOfPlayers() + " are playing baseball");
    }
}
