package labAssignment1;

public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    private String name;

    public Character(String name) {
        this.name = name;
    }

    // Setters allow changing behavior at runtime
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefend() {
        defenseStrategy.defend();
    }
}