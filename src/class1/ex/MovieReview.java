package class1.ex;

public class MovieReview {
     String title;
     String review;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void MovieReviewPrint() {
        System.out.println("영화 제목: " + title + " 리뷰:" + review);
    }
}
