class Friends{
    int numberOfFriends;

    public Friends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }
}
public final class Profile2 {
    private final String username;
    private final int age;
    private final Friends friends;

    public Profile2(String username, int age, Friends friends) {
        this.username = username;
        this.age = age;
//        this.friends = friends;

        Friends newFriends = new Friends(friends.numberOfFriends);
        this.friends = newFriends;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Friends friend = new Friends(5);
        Profile2 profile = new Profile2("Henry", 12, friend);
        System.out.println(profile.friends.numberOfFriends);

        friend.numberOfFriends = 6;
        System.out.println(profile.friends.numberOfFriends);

    }
}
