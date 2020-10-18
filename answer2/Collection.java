
import java.util.*;
/**
 *
 * @author Saeed & Maryam
 */
public class Collection {
    private ArrayList<MusicCollection> music;
    
    
    public Collection(){
        music=new ArrayList<MusicCollection>();
    }
    
    
    public MusicCollection find(String word){
        for(MusicCollection map:music){
            if(map.getName().equals(word)){
                return map;
            }
        }
        System.out.println("oooooooooooooo");
        return null;
    }
    
    public void addMusic(MusicCollection word){
        music.add(word);
    }
    
    public void print(){
        for(MusicCollection map:music){
            map.show();
            System.out.println("||||||||||||||||||");
        }
    }
    
    
    
}
