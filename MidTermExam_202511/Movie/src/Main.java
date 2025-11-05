public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];

        movies[0] = new Movie("Inception", "Christopher Nolan", 8.8);
        movies[1] = new Movie("The Shawshank Redemption", "Frank Darabont", 9.3);
        movies[2] = new Movie("The Room", "Tommy Wiseau", 3.7);
        movies[3] = new Movie("Parasite", "Bong Joon-ho", 8.5);
        movies[4] = new Movie("Terminator", "Unknown", 5.5);


        System.out.println("All Movies: ");
        for (Movie m:movies) {
            m.displayMovieInfo();
        }

        System.out.println("Recommended Movies: ");
        for (Movie movie:movies) {
            if(movie.isRecommended()){
                movie.displayMovieInfo();
            }
        }
    }
}