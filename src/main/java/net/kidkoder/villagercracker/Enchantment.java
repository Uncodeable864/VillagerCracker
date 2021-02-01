package net.kidkoder.villagercracker;

import java.util.Map.Entry;

public class Enchantment {
    protected String enchantmentID = "mending";
    protected int levelID = 1;

    public Enchantment(String enchantmentID, int levelID) {
        this.enchantmentID = enchantmentID;
        this.levelID = levelID;
    }
}
