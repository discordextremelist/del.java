package xyz.discordextremelist.java.types.discord;

import javax.lang.model.type.NullType;
import java.util.Optional;

public class Channel extends BaseChannel {
    public Optional<String> guild_id;
    public float position;
    public Optional<Overwrite> permission_overwrites;
    public Optional<String> name;
    public Optional<String> topic;
    public Optional<Boolean> nsfw;
    public Optional<String> last_message_id;
    public Optional<Float> bitrate;
    public Optional<Float> user_limit;
    public Optional<Float> rate_limit_per_user;
    public Optional<User> recipients;
    public Optional<String> icon;
    public Optional<String> owner_id;
    public Optional<String> application_id;
    public Optional<String> parent_id;
    public Optional<String> last_pin_timestamp;
}
