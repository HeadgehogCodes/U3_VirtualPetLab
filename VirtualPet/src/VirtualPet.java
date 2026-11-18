// Part A

public class VirtualPet {
    private String name;
    private int weight;
    private int age;
    private int happiness;
    private int energy;

    public VirtualPet(String name){
        this.name =  name;
        weight = 5;
    }

    public String getName() {
        return name;
    }
    public int getEnergyLevel(){
        return energy;
    }
    public int getHappinessLevel(){
        return happiness;
    }
    public String toString(){
        return name+"'s Information:\n" +
                "Energy: "+energy+"\n"+
                "Happiness: "+happiness+"\n"
                +"Weight: "+ weight+"g\n"
                +"Age: "+age%12+" months and "+(age/12)+" years";

    }
    public void feed(){

        if(energy <= 10){
            energy++;
        }
        weight++;

        }
    public void updateStatus(){
        if(happiness > 0){
            happiness--;
        }
        if(energy> 0) {
            energy--;
        }
        age++;

    }
    public void play(){
        if(happiness < 10)
            happiness++;
        if(weight > 5)
            weight--;

        }
    }
