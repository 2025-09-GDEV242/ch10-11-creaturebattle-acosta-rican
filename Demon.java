/**
 * The Demon class represents a demonic creature.
 * Demons have a 5% chance to do magical damage (+50).
 *
 * @author Franco Acosta
 * @version 12/13/2025
 */
public abstract class Demon extends Creature
{
    /**
     * CONSTRUCTOR for Demon class
     * 
     * @param str strength value
     * @param hp hit points value
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * Calculates attack damage for a demon
     * Gets base damage from creature and adds bonus if triggered.
     * 
     * @return total damage dealth
     */

    public int attack()
    {
        int damage = super.attack();

        if (Randomizer.nextInt(100) <=5)
        {
            damage += 50;
        }
        return damage;
    }
}