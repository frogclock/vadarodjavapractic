package p1706;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<Users> users;

    static {
        users = new ArrayList<>();
        users.add(new Users("mordas_i","mordas_i","Igor","Mordas"));
        users.add(new Users("boltach_e","boltach_e","Elena","Boltach"));
        users.add(new Users("parfenets_g","parfenets_g","Galina","Parfenets"));
    }
}
