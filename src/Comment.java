public class Comment {
    String commentId;
    String commentContent;
    String answerId;

    Comment(String commentContent, Answer answer) {
        this.commentContent = commentContent;
        this.answerId = answer.answerId;
    }

    void updateComment(String commentContent) {
        this.commentContent = commentContent;
    }

}
