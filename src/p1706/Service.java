package p1706;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public void auth(String login, String password) {
        List<Users> user = UserRepository.users;
        List<String> logins = new ArrayList<>();
        for (Users us : user) {
            logins.add(us.getLogin());
        }
        if (!logins.contains(login)) {
            throw new UserNotFoundException();
        }
    }
}
