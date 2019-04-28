package Factory;


import Singelton.SilgentonLoger;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;
    private final WeaponFactory weaponFactory;

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;
        weaponFactory = new WeaponFactory();
        changeProfession(profession);


    }

    public void changeProfession(Profession newProffession) {
        profession = newProffession;
        weaponFactory.makeWeapon(newProffession, 20);
        SilgentonLoger.getLoger().log("Changing profesion" + newProffession);

    }
}

