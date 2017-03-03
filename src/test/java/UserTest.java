import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Piotr on 03.03.2017.
 */
public class UserTest {
    @Test
    public void userHasName() {
        User user = new User.UserBuilder().name("Adam").build();
        Assert.assertNotNull(user.getName());
    }

    @Test
    public void userHasSurname() {
        User user = new User.UserBuilder().surname("Nowak").build();
        Assert.assertNotNull(user.getSurname());
    }

    @Test
    public void userHasAgeAndCity() {
        User user = new User.UserBuilder().age(20).city("Lodz").build();
        Assert.assertNotNull(user.getAge());
        Assert.assertNotNull(user.getCity());
    }

    @Test
    public void userHasEmailAndNameAndSurname() {
        User user = new User.UserBuilder().email("email@email.com").name("adam").surname("kowalski").build();
        Assert.assertNotNull(user.getEmail());
        Assert.assertNotNull(user.getName());
        Assert.assertNotNull(user.getSurname());
    }
}
