package org.sengarkuldeep;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.rapidoid.annotation.IntegrationTest;
import org.rapidoid.http.Self;
import org.rapidoid.test.RapidoidIntegrationTest;
import org.rapidoid.u.U;
import org.sengarkuldeep.models.User;

import java.util.Map;

@IntegrationTest(main = Main.class)
public class UserIntegrationTest extends RapidoidIntegrationTest {


    @Test
    public void shouldInsertUser() {
        Map<String, ?> user1 = U.map("name", "Kuldeep");
        User user = Self.post("/users").data(user1).toBean(User.class);
        Assert.assertThat(user.getId(), Is.is(1L));
    }
}
