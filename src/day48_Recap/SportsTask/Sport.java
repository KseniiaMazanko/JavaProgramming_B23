package day48_Recap.SportsTask;

public class Sport {

    private int numberOfPlayers;
    private int numberOfReferee;
    private String rules;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        this.numberOfReferee = numberOfReferee;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public Sport(int numberOfPlayers, int numberOfReferee, String rules) {
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);
    }

    public void play(){
        System.out.println(getNumberOfPlayers() + " is playing ");
    }

    @Override
    public String toString() {
        return
                "numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' ;
    }

    /*
    1. Create a class called Sport
			private variables:
				numberOfPlayers, numberOfReferee, rules

			Encapsulate all the fields

			Add a constructor that can set all the fields
			methods:
				play(), toString()


     */

}
