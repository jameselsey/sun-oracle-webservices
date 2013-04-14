package chapter1.teams;


import java.util.List;

public class Teams {

    private List<Team> teams;

    public Team getTeam(String name) {
        return null;
    }
}

class Team{
    private List<Player> players;
}

class Player{
    String name;
    Integer position;

    Player(String name, Integer position) {
        this.name = name;
        this.position = position;
    }
}
