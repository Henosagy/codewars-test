public final class Profile {
    private final String username;
    private final int age;

    public Profile(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Profile profile = new Profile("Henry", 12);

    }
}
