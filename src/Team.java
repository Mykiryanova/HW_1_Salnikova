public class Team {
    public static String nameTeam = "Бегуны";

    String name;
    int distance;

    // Создаем констуктор  участников команды
    public Team (String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    public static void helloNameTeam(){
        System.out.println("Приветствуем команду " + nameTeam +"!");
    }
    // Метод ля вывода информации о члннах команды
    public void InfoAboutTeam() {System.out.print(name + " ");}
}
