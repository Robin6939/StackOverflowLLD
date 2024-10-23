import java.awt.desktop.QuitEvent;
import java.util.HashMap;

public class Driver {
    Driver instance;
    HashMap<String, Post> postMap;

    private Driver() {
        postMap = new HashMap<>();
    }

    Driver getInstance() {
        if(instance == null) {
            return new Driver();
        }
        return null;
    }

    void addQuestion(String questionContent) {
        Post question = new Question(questionContent);
        postMap.put(question.postId, question);
    }
}
