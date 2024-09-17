public class movieItem
{
    private final String Title;
    private final String Author;

    protected movieItem(String Title, String Author)
    {
        this.Title = Title;
        this.Author = Author;
    }
    public String getTitle()
    {
        return Title;
    }
    public String getAuthor()
    {
        return Author;
    }
    void printDetails()
    {
        System.out.println("Title:" + Title);
        System.out.println("Author:" + Author);
    }


}
