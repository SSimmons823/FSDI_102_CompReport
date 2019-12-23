public class Character{

    private String name;
    private int energy;
    private int lifes;
    private int attackPoints;

    // constructor
    public Character(String name, int energy, int attackPoints){
        this.name=name;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.lifes=2;
    }

    // getters
    public String getName(){
        return this.name;
    }

    public int getenergy(){
        return this.energy;
    }

    public int getAttackPoints(){
        return this.attackPoints;
    }

    //methods
    public void display(){
        System.out.println("---------------------");
        System.out.println("Name: " + this.name);
        System.out.println(" =D " + this.lifes);
        System.out.println("Life Points: " + this.energy);
        System.out.println("Attack Points:" + this.attackPoints);
    }

    public void attack(Character opponent){
        System.out.println(this.name + " is attacking ..." + opponent.name);

        int newLP = opponent.energy - this.attackPoints;
       
        opponent.energy=newLP;
        opponent.display();

        if (opponent.energy <= 0){
            opponent.lifes=opponent.lifes-1;
            opponent.energy=100;
            opponent.display();

        if (opponent.lifes <= 0)
            System.out.println(opponent.name + " has lost, Game Over! ");
        }

    }

}