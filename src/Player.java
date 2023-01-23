public class Player {
    String name;
    int age;
    String teamName;

    public Player(String name, int age, String teamName) {
        this.name = name;
        this.age = age;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    System.out.println("player.java");
}
