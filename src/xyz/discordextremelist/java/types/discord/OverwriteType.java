package xyz.discordextremelist.java.types.discord;

public enum OverwriteType {
    Member {
        public String toString() {
            return "member";
        }
    },
    Role {
        public String toString() {
            return "role";
        }
    }
}
