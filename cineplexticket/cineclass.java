
package cineplexticket;


public class cineclass {

    public String MovieId;
    public String Moviename;
    public String Showtime;
    public String Date;
    public String TypeOfMovie;
    public String Type;
    public  int Price;
    public  String VAT;
    public byte[] Image;
    public  int HallNo;
    public int TotalSeat;
    public cineclass(String MovieId,String Moviename,String Showtime,String Date,String TypeOfMovie,String Type,int Price,String VAT,byte[] Image,int HallNo,int TotalSeat)
    {
        this.MovieId=MovieId;
        this.Moviename=Moviename;
        this.Showtime=Showtime;
        this.Date=Date;
        this.TypeOfMovie=TypeOfMovie;
        this.Type=Type;
        this.Price=Price;
        this.VAT=VAT;
        this.Image=Image;
        this.HallNo=HallNo;
        this.TotalSeat=TotalSeat;
      
    }
    
    public String getMovieId()
    {
        return MovieId;
    }
    
    public String getMoviename()
    {
        return Moviename;
    }
    
    public String getShowtime()
    {
        return Showtime;
    }
    
    public String getDate()
    {
        return Date;
    }
      public String getTypeOfMovie()
    {
        return TypeOfMovie;
    }
        public String getType()
    {
        return Type;
    }
    public int getPrice()
    {
        return Price;
    }
      public String getVAT()
    {
        return VAT;
    }
    public byte[] getImage()
    {
        return Image;
    }

     public int getHallNo()
    {
        return HallNo;
    }
      public int  getTotalSeat()
    {
        return TotalSeat;
    }
}
