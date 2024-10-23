import java.util.UUID;

public class Post {
    String postId;

    Post() {
        postId = UUID.randomUUID().toString();
    }
}
