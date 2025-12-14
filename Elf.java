
/**
 * The Elf class implements a wrapper for the base Creature class with the following
 * additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * (with chance of double damage)
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Franco Acosta
 * @version 12/13/2025
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 30;
    private static final int MIN_ELF_HP = 15;
    private static final int MAX_ELF_STR = 15;
    private static final int MIN_ELF_STR = 5;

    /**
     * CONSTRUCTOR for class Elf
     * 
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP        
        );

    }

    /**
     * 20% change to deal double damage
     * 
     * @return the total damage dealt by elf
     * 
     */
    public int attack() {
        int damage = super.attack(); 

        //attack logic
        if (Randomizer.nextInt(5) == 5) damage = damage * 2;

        return damage;
    }
}