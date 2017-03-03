/**
 * Created by Piotr on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().name("adam").surname("nowak").build();
        System.out.println(user.getName() + user.getSurname() + user.getCity());
    }
}
