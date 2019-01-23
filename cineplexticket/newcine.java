
package cineplexticket;


public class newcine {
public String NewMovieName;
public String ReleaseDate;
public byte[] NewMovieImage;
public String NewMovieType; 
public newcine(String NewMovieName,String ReleaseDate,byte[] NewMovieImage,String NewMovieType)
{
    this.NewMovieName=NewMovieName;
    this.ReleaseDate=ReleaseDate;
    this.NewMovieImage=NewMovieImage;
    this.NewMovieType=NewMovieType;
}
public String getNewMovieName()
{
    return NewMovieName;
}
public String getReleaseDate()
{
    return ReleaseDate;
}
public byte[] getNewMovieImage()
{
   return NewMovieImage;
}
public String getNewMovieType()
{
    return NewMovieType;
}
}


