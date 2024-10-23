public class Comment extends Post {
//    String commentId;
    String commentContent;
    String answerId;

    Comment(String commentContent, Answer answer) {
        super();
        this.commentContent = commentContent;
        this.answerId = answer.postId;
    }

    void updateComment(String commentContent) {
        this.commentContent = commentContent;
    }

}
