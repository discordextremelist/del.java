package xyz.discordextremelist.java.types.server;

import xyz.discordextremelist.java.types.Avatar;
import xyz.discordextremelist.java.types.Owner;

import java.util.ArrayList;

public class Server {
    public String id;
    public String name;
    public String shortDesc;
    public String longDesc;
    public ArrayList<String> tags;
    public String previewChannel;
    public Owner owner;
    public Avatar icon;
    public ServerLinks links;
    public ServerStatus status;
}
