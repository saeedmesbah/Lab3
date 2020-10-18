import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<MusicPlayer> files;
    // A player for the music files.
    private String name;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection(String name)
    {
        this.name=name;
        files=new ArrayList<MusicPlayer>();
    }
    
    public String getName(){
        return name;
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(MusicPlayer music)
    {
        files.add(music);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        files.get(index).getInfo();
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(MusicPlayer music: files){
            music.getInfo();
            System.out.println("|||||||||||||");
        }
        
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(String index)
    {
        Iterator<MusicPlayer> it=files.iterator();
        while(it.hasNext()){
            if(it.next().getName().equals(index)){
                it.remove();
            }
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        files.get(index).startPlaying(files.get(index).getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        for(MusicPlayer music:files){
            music.stop();
        }
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if(index<0 || index>files.size()){
            System.out.println("invalid index for collection");
            return false;
        }
        else{
            return true;
        }
       
    }
    
    public void show(){
        System.out.println("Name: "+name);
        
        for(MusicPlayer map:files){
            map.getInfo();
            System.out.println("------------");
        }
    }
    
    public MusicPlayer findMucis(String name){
        for(MusicPlayer map:files){
            if(map.getName().equals(name)){
                return map;
            }
        }
        System.out.println("Music not found");
        return null;
    }
}