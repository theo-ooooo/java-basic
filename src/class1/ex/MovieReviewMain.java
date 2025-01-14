package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview insection = new MovieReview();
        insection.setTitle("인셉션");
        insection.setReview("인생은 무한 루프");

        MovieReview about = new MovieReview();
        about.setTitle("어바웃 타임");
        about.setReview("인생 시간 영화!");

        insection.MovieReviewPrint();
        about.MovieReviewPrint();
    }
}
