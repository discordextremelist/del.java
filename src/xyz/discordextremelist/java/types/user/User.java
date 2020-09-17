package xyz.discordextremelist.java.types.user;

import xyz.discordextremelist.java.types.Avatar;
import xyz.discordextremelist.java.types.discord.UserFlags;

public class User {
    public String id;
    public String name;
    public String discrim;
    public String fullUsername;
    public UserFlags flags;
    public Avatar avatar;
    public UserProfile profile;
    public UserGame game;
    public UserRank rank;
}