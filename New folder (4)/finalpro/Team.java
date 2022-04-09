package finalpro;

public class Team {
	public String name;
    public String city;
    public Player arrPlayers[];
    public int noPlayers;
    
    
    
    public Team(String name, String c) {
        this.name=name;
        this.city=c;
        arrPlayers=new Player[150];
    }
    
    
    
    public Team(String name, String c, int size) {
        this.name=name;
        this.city=c;
        if(size>=0&&size<=150)
            arrPlayers=new Player[size];
        else if(size<0)
            arrPlayers=new Player[150];
    }
    
    
    public int searchPlayer(int num) {
        for(int i=0;i<=noPlayers;i++) {
            if(num==arrPlayers[i].getNumber())
                return i;
        }
        return -1;
    }

    
    
    public int searchPlayer(String n) {
        for(int i=0;i<=noPlayers;i++) {
            if(n.equalsIgnoreCase(arrPlayers[i].getName()))
                return i;
        }
        return -1;
    }
        
    
    
    public int searchPlayer(int num, String rank) {
        for(int i=0;i<=noPlayers;i++) {
            if(rank.equalsIgnoreCase(arrPlayers[i].getRank())&&num==arrPlayers[i].getNumber())
                return i;
        }
        return -1;
    }

    public boolean addPlayer(Player p) {
        int i=searchPlayer(p.getNumber());
        if(i==-1) {
            arrPlayers[++noPlayers]=p;
            return true;}
        
    
        return false;
    
        
        
    }
    
    
    public boolean deletePlayer(int number) {
        
        int i = searchPlayer(number);
        if(i ==-1)
            return false;
        else {
            Player temp=arrPlayers[noPlayers--];
            arrPlayers[i]=temp;
            return true; 
        }}
        
        
    
    
    
    public int goalsTotal() {
        int total=0;
        for(int i=0;i<arrPlayers.length;i++)
        {
            total+=arrPlayers[i].getGoals();
        }
        return total;
    }
    
    public int goalsNonAttac() {
        int total=0;
        for(int i=0;i<arrPlayers.length;i++) {
            if(arrPlayers[i].getPosition().equalsIgnoreCase("defense")||
                    arrPlayers[i].getPosition().equalsIgnoreCase("keeper")||
                    arrPlayers[i].getPosition().equalsIgnoreCase("middle"))
                total +=total;
        }
        return total;
        
    }

    public Player getKids() {
        for(int i=0;i<arrPlayers.length;i++) {
            if(arrPlayers[i].getRank().equalsIgnoreCase("kids"))
                return arrPlayers[i];
        }
        return null;
    }

    
    public int numberOfRank(String r) {
        int total=0;
        for(int i=0;i<arrPlayers.length;i++)
        {
            if(r.equalsIgnoreCase("Kids")) {
                total +=total;
            }
            else if(r.equalsIgnoreCase("Youth")) {
                total +=total;
            }
            else if(r.equalsIgnoreCase("first")) {
                total +=total;
            }
    }
        return total;
    }
    
    
    public void print() {
        for(int i=0;i<arrPlayers.length;i++)
        {
                arrPlayers[i].print();
        }
    }
    public void printRank(String s){
        for(int i=0;i<arrPlayers.length;i++)
        {
            if(s.equalsIgnoreCase("Kids")) {
                arrPlayers[i].print();
            }
            else if(s.equalsIgnoreCase("Youth")) {
                arrPlayers[i].print();
            }
            else if(s.equalsIgnoreCase("first")) {
                arrPlayers[i].print();
            }
        }
    }
    
    public void sort(){
        for (int i = 0; i < arrPlayers.length; i++)
            System.out.println(arrPlayers[i].getNumber());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	
}
