package xyz.discordextremelist.java.types.discord;

public enum UserFlags {
    NONE(0),
    DISCORD_EMPLOYEE(1),
    PARTNERED_SERVER_OWNER(1 << 1),
    DISCORD_HYPESQUAD_EVENTS(1 << 2),
    BUG_HUNTER_LEVEL_1(1 << 3),
    HYPESQUAD_HOUSE_BRAVERY(1 << 6),
    HYPESQUAD_HOUSE_BRILLIANCE(1 << 7),
    HYPESQUAD_HOUSE_BALANCE(1 << 8),
    EARLY_SUPPORTER(1 << 9),
    TEAM_USER(1 << 10),
    SYSTEM(1 << 12),
    BUG_HUNTER_LEVEL_2(1 << 14),
    EARLY_VERIFIED_BOT_DEVELOPER(1 << 17);

    public final int bit;

    UserFlags(int bit) { this.bit = bit; }
}
