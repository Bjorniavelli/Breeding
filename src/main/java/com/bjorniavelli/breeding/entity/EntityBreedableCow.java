package com.bjorniavelli.breeding.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.World;

import java.util.UUID;

public class EntityBreedableCow extends EntityCow
{
    // Possible Breeding Results:
    // Tier 1 (Basic traits):
    public AttributeModifier maxHealthAttribute;
    public double maxHealthModifier = 0.0D;//// Health
    //// Breed Frequency
    //// Length of inLove
    //// Sound Time
    //// Sound Volume
    // Tier 2 (Speed upgrades):
    //// GrowingAge
    //// Growing Speed
    //// Will Jump/Jump Height
    //// Amount of milk produced
    // Tier 3 (Cosmetic and Breeding aids):
    //// Size both up and down
    //// Brood Number (twins, trips, quads, etc...  chances, not certainties?)
    //// Wander Distance (Can we make it so cows stay put without pens?
    //// Color
    // Tier 4 (Combat resistance):
    //// Damage Resistance
    //// Elemental Damage Resistance (Fire, Drowning, Wither... etc?)
    //// What kind of milk produced (Unsure of what)
    // Tier 5 (Item interaction):
    //// Experience Value
    //// Senses(Is this even valuable?)
    //// canPickupLoot
    //// Drops on Death (I envision putting an item on a totem?  Maybe?)
    // Tier 6 (Transportation):
    //// Equipment Slots (Aids in breeding mechanics and production mechanics)
    //// Ridable
    //// Riderable
    //// Self-loading into cart?
    // Tier 7:
    // Tier 8 (Breeding Boosts):
    //// Self-capsulating
    // Tier 9 (Automation!):
    //// Ore doubling (Probably by/per ore?)
    //// Smelting
    //// Crafting (shapeless, and number of inputs)
    // Tier 10:
    // Tier 11:
    // Tier 12 (Crazy Movement):
    // Flying
    // Swimming
    // Tier 13:
    // Tier 14:
    // Tier 15:

    // Not going to do.  Definitely not.  Probably.
    //// Cows are not combat machines?  Like, at all?
    //// Attack Target
    //// Leashable
    //// Damage


    // Unclassified:


    public static int trackingRange = 80;  //Why 80?  No idea how to find what a Cow's is.

    public EntityBreedableCow (World worldIn)
    {
        super (worldIn);
        applyStats();
    }

    public EntityBreedableCow (EntityLivingBase target)
    {
        super (target.getEntityWorld());
        //Copy information from target cow?  Or just create a new one... ?
        applyStats();
    }

    private void applyStats ()
    {
        // Yah... that's just temporary.
        this.maxHealthAttribute = new AttributeModifier(UUID.randomUUID(), "BreedableCowMaxHealthModifier", this.maxHealthModifier, 0); // 0??  Really?  Where's my Enum!
        IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.maxHealth);
        iattributeinstance.applyModifier(this.maxHealthAttribute);
    }

    public EntityCow createChild(EntityAgeable ageable)
    {
        EntityBreedableCow child = new EntityBreedableCow(this);
        child.maxHealthModifier++;

        return child;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D + this.maxHealthModifier);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2);
    }
}
