public class movieTest
{
public static void main(String[]args)
{
    movie myMovie = new movie();
    movieItem movie1 = new movieItem("Top Boy","Daniel Sordo");
    movieItem movie2 = new movieItem("World Rally Championship", "Kalle Radovan ");
    movieItem movie3 = new movieItem("Harry Potter","JJ");

    myMovie.addMovieItem(movie1);
    myMovie.addMovieItem(movie2);
    myMovie.addMovieItem(movie3);

    myMovie.printMovieItems();
}
}
