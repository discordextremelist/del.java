package xyz.discordextremelist.java.types.discord;

import java.util.Optional;

public class Role {
    public String id;
    public String name;
    public float color;
    public boolean hoist;
    public float position;
    public float permissions;
    public String permissions_new;
    public boolean managed;
    public boolean mentionable;
    public Optional<Tags> tags;
}
