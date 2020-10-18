

/**
 * 
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    private String name;
    private String singer;
    private int year;
    
    /**
     * Constructor for objects of class MusicFilePlayer
     * @param singer
     * @param year 
     */
    public MusicPlayer(String name,String singer,int year)
    {
        this.name=name;
        this.singer=singer;
        this.year=year;
        isPlaying = false;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getSinger(){
        return singer;
    }
    
    public void setSinger(String singer){
        this.singer=singer;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    

    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(String filename)
    {
        System.out.println(filename + " is playing...");
		isPlaying = true;
    }
    
    public void stop()
    {
        isPlaying = false;
    }
    
    public void getInfo(){
        System.out.println("Music: "+name);
        System.out.println("Singer: "+singer);
        System.out.println("Year of publication: "+year);
        
    }
    

}