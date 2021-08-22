package day48_Recap.SportsTask;

public class Basketball extends Sport {

    /*
    2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			override play() method in each sub classes

			Note: you can search them on google
     */

    public Basketball(int numberOfPlayers, int numberOfReferee, String rules) {
        super(numberOfPlayers, numberOfReferee, rules);
    }

    @Override
    public void play() {
        System.out.println(getNumberOfPlayers() + " are playing basketball");
    }
}
