import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Answer extends Post {
//    String answerId;
    String questionId;
    String answerContent;
    HashMap<String, Comment> commentList;
    Answer(String answerContent, Question question) {
        super();
        this.answerContent = answerContent;
        this.questionId = question.questionId;
//        this.answerId = "Ans" + UUID.randomUUID().toString();
        commentList = new HashMap<>();
    }

    void updateAnswer(String answerContent) {
        this.answerContent = answerContent;
    }

    void deleteComment(Comment comment) {
        commentList.remove(comment.commentId);
    }

    void addComment(Comment comment) {
        commentList.put(comment.commentId, comment);
    }
}
