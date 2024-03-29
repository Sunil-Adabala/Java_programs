import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    private String name;
    private int strength;
    private int hitpoints;
    private String weapon;

    public Player(String name, int strength, int hitpoints) {
        this.name = name;
        this.strength = strength;
        this.hitpoints = hitpoints;
        this.weapon="Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitpoints=" + hitpoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitpoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.hitpoints=Integer.parseInt(savedValues.get(1));
            this.strength=Integer.parseInt(savedValues.get(2));
            this.weapon=savedValues.get(3);
        }

    }
}
