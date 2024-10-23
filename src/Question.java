import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Question extends Post {
    String questionContent;
//    String questionId;
    HashMap<String, Answer> answerList;

    Question(String questionContent) {
        super();
        this.questionContent = questionContent;
//        questionId = "ques:" + UUID.randomUUID().toString();
    }

    void addAnswer(Answer answer) {
        answerList.put(answer.postId, answer);
    }

    void deleteAnswer(String answerId) {
        answerList.remove(answerId);
    }

}
