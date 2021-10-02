public class Main {
    public static <team> void main (String[] args){

        Team[] team = {new Team("John", 8), new Team("Antony", 12), new Team("Alex", 11), new Team("Ben", 9)};
        ControlDistance ControlDis = new ControlDistance (10);
        Course[] course = {new Course(2), new Course (6)};


        ControlDis.showDistance();
        Team.helloNameTeam();

// Информация обо всех участниках
        System.out.println("В команде следующие участники:");
        for (int i = 0; i < team.length; i++) {
            team[i].InfoAboutTeam();
        }
        System.out.println();

        //   Информация об участниках, которые прошли дистанцию.
        System.out.println();
        System.out.println("Дистанцию прошли следующие участники: ");
        for (int i = 0; i < team.length; i++) {
            if (team[i].distance > ControlDis.finish){
                team[i].InfoAboutTeam();
            };
        }
        System.out.println();
        Course.DoIt(Team.nameTeam);
    }

}


