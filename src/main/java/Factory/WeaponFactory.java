package Factory;

public class WeaponFactory {


    public Weapon makeWeapon(Profession profession, int damage) {
        switch (profession) {
            case ARCHER:
                return new Bow(damage);
            case WIZARD:
                return new Wand(damage);
            case SWORDSMAN:
                return new Sword(damage);
            default:
                throw new IllegalArgumentException("There is no such weapon");

        }
    }
}
