package finalpro;

public class Player {
    private String name;
    private String rank;
    private String position;
    private int number;
    private int goals;
    private static int count = 0;
    

    public Player() {
        this("NA", "middle", "kids", 0);
    }

    public Player(String name, String position, String rank, int goals) {
        this.name = name;
        this.rank = rank;
        this.position = position;
        this.goals = goals;
        //
        count++;
        //
        number=count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        if (rank.equalsIgnoreCase("Kids")) {
            this.rank = rank;
        } else if (rank.equalsIgnoreCase("Youth")) {
            this.rank = rank;
        } else if (rank.equalsIgnoreCase("First")) {
            this.rank = rank;
        }
    }

    public String getPosition() {
        return position;
    }
//
    public void setPosition(String position) {
        if (rank.equalsIgnoreCase("attack")) {
            this.position = position;
        } else if (rank.equalsIgnoreCase("defense")) {
            this.position = position;
        } else if (rank.equalsIgnoreCase("keeper")) {
            this.position = position;
        } else if (rank.equalsIgnoreCase("middle")) {
            this.position = position;
        }
    }

    public int getGoals() {
        return goals;
    }

    public void setNumber(int number) {
        if(number>=1 &&number<=150) {
        this.number = number;
    }
        else
            System.out.print("The Player Number Should be 1-150");
        }

    public static void setCount(int count) {
        Player.count = count;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getNumber() {
        return number;
    }

    public static int getCount() {
        return count;
    }

    public void print() {
        System.out.println("===================================================================================================================");
        System.out.println("Player name:" + name);
        System.out.println("Player number:" + number);
        System.out.println("Player position:" + position);
        System.out.println("Player rank:" + rank);
        System.out.println("Player goals:" + goals);
        System.out.println("===================================================================================================================");
    }
//
    public void addGoals(int g) {
        this.goals += g;
    }

	
	
	
}
