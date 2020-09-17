package xyz.discordextremelist.java.types.bot;

import xyz.discordextremelist.java.types.Avatar;
import xyz.discordextremelist.java.types.Owner;
import xyz.discordextremelist.java.types.discord.UserFlags;

import java.util.ArrayList;

public class Bot {
    public String id;
    public String clientID;
    public String name;
    public String prefix;
    public String library;
    public ArrayList<String> tags;
    public String vanityUrl;
    public float serverCount;
    public float shardCount;
    public UserFlags flags;
    public String shortDesc;
    public String longDesc;
    public ArrayList<String> editors;
    public Owner owner;
    public Avatar avatar;
    public BotLinks links;
    public BotSocial social;
    public BotStatus status;
}
