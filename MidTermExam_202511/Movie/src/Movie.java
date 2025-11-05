public class Movie {
    private String title;
    private String director;
    double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public boolean isRecommended(){
        return rating >= 7.5 && rating < 10;
    }
    public void displayMovieInfo(){
        System.out.println("Movie: " + title + "directed by " + director + ", Rating: "+ rating +"/10");
    }
}
