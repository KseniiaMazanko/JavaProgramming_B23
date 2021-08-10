package day41_CustomClass_Constructor.ScrumTask;

public class BankOfAmerica {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Yuliang", 'M', "QA",
                10, 90000);

        Tester tester2 = new Tester("Abbos", 'M', "QA",
                11, 100000);
        Tester tester3 = new Tester("Kseniia", 'F', "SDET",
                12, 150_000);

        Tester [] testers = {tester2, tester3};

        Developer developer1 = new Developer("Zorana", 'F', "Developer",
                13, 95_000);

        Developer developer2 = new Developer("Alex", 'M', "Developer",
                14, 105_000);

        Developer developer3 = new Developer("Ahmed", 'M', "Developer",
                15, 110_000);

        Developer developer4 = new Developer("Giovanni", 'M', "Developer",
                16, 115_000);

        Developer [] developers = {developer1, developer2, developer3};

        ScrumTeam scrum1 = new ScrumTeam("Elina", "Sergey", "Sabir");

        System.out.println(scrum1);
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTesters(testers);
        scrum1.hireDevelopers(developers);

        System.out.println(scrum1);

        double budget = 0;

        for(Tester eachTester: scrum1.testers){
            budget+=eachTester.salary;
        }

        for (Developer eachDeveloper : scrum1.developers) {
            budget+=eachDeveloper.salary;
        }

        System.out.println("budget = " + budget);

        ScrumTeam scrum2 = new ScrumTeam("Atila", "Abbos", "Vitalii");
        ScrumTeam scrum3 = new ScrumTeam("Giovanni", "Kseniia", "David");

        ScrumTeam [] scrumTeams = {scrum1, scrum2, scrum3};

        for (ScrumTeam eachScrum : scrumTeams) { //looping through each scrum team

            for (Tester tester : eachScrum.testers) { //array list of test

            }

            for (Developer developer : eachScrum.developers) {//array list of devs

            }
        }

        //find the total budget









    }


}
