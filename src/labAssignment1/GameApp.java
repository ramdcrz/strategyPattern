package labAssignment1;

public class GameApp {
    public static void main(String[] args) {

        // 1. Knight Setup
        Character knight = new Character("Knight");
        knight.setAttackStrategy(new SwingSword());

        System.out.println("--- Knight Action ---");
        knight.performAttack();
        // Knight switching through their 3 defenses
        knight.setDefenseStrategy(new Shield());
        knight.performDefend();
        knight.setDefenseStrategy(new Dodge());
        knight.performDefend();
        knight.setDefenseStrategy(new CreateMagic());
        knight.performDefend();

        // 2. Wizard Setup
        Character wizard = new Character("Wizard");
        wizard.setAttackStrategy(new CastSpell());
        wizard.setDefenseStrategy(new CreateMagic());

        System.out.println("\n--- Wizard Action ---");
        wizard.performAttack();
        wizard.performDefend();

        // 3. Archer Setup
        Character archer = new Character("Archer");
        archer.setAttackStrategy(new ShootArrow());
        archer.setDefenseStrategy(new Dodge());

        System.out.println("\n--- Archer Action ---");
        archer.performAttack();
        archer.performDefend();
    }
}