import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class sss {
    //$2a$10$gLvD9Qf5muDAwQf3bvlXJuT.VVjnsJ7iEhKRo8VlgMhGoX7o5nZ8i
    //$2a$10$CDTS6FidZuI2UwJfuHmV1.NiPkQ2wLP6GZJQFXwKszfaVNTIzY1FO
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("wx123"));
    }
}
