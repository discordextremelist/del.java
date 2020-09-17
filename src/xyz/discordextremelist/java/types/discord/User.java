package xyz.discordextremelist.java.types.discord;

import java.util.Optional;

public class User {
    public String id;
    public String username;
    public String discriminator;
    public String avatar;
    public Optional<Boolean> bot;
    public Optional<Boolean> system;
    public Optional<Boolean> mfa_enabled;
    public Optional<String> locale;
    public Optional<Boolean> verified;
    public Optional<String> email;
    public Optional<UserFlags> flags;
    public UserPremium premium_type;
    public Optional<UserFlags> public_flags;
}
