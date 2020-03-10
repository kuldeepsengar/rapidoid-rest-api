package org.sengarkuldeep;

import org.rapidoid.jpa.JPA;
import org.rapidoid.setup.App;
import org.rapidoid.setup.On;
import org.sengarkuldeep.models.User;

import javax.validation.Valid;

public class Main {
    public static void main(String[] args) {
        App.bootstrap(args).jpa(); // bootstrap JPA
        On.port(8080);
        On.post("/users").json(
                (@Valid User user) -> JPA.insert(user)
        );

    }
}
