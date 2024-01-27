package exercise.SkillFactory.OOP.Module_8.Task_8_2_1.Backpack;

abstract class Entity{
    private String name;
    private int hp = 100;
    private boolean destroyed;

    Entity(String name){
        this.name = name;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed(){
        return destroyed;
    }
}