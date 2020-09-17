package xyz.discordextremelist.java.types.template;

import xyz.discordextremelist.java.types.Avatar;
import xyz.discordextremelist.java.types.Owner;
import xyz.discordextremelist.java.types.discord.*;

import java.util.ArrayList;
import java.util.Optional;

public class Template {
    public String id;
    public String name;
    public String region;
    public String locale;
    public float afkTimeout;
    public VerificationLevel verificationLevel;
    public DefaultMessageNotifications defaultMessageNotifications;
    public ExplicitContent explicitContent;
    public ArrayList<Role> roles;
    public ArrayList<Channel> channels;
    public float usageCount;
    public String shortDesc;
    public String longDesc;
    public ArrayList<String> tags;
    public String fromGuild;
    public Owner owner;
    public Avatar icon;
    public TemplateLinks links;
}
