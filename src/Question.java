import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Question {
    String questionContent;
    String questionId;
    HashMap<String, Answer> answerList;

    Question(String questionContent) {
        this.questionContent = questionContent;
        questionId = "ques:" + UUID.randomUUID().toString();
    }

    void addAnswer(Answer answer) {
        answerList.put(answer.answerId, answer);
    }

    void deleteAnswer(String answerId) {
        answerList.remove(answerId);
    }

}
