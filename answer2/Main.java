
import java.util.*;
public class Main {


    public static void main(String[] args) {
        
        
        
        MusicPlayer m1=new MusicPlayer("pop1","pop_singer1",1998);
        MusicPlayer m2=new MusicPlayer("pop2","pop_singer2",2001);
        MusicPlayer m3=new MusicPlayer("pop3","pop_singer3",1850);
        MusicPlayer m4=new MusicPlayer("jazz1","jazz_singer1",2012);
        MusicPlayer m5=new MusicPlayer("jazz2","jazz_singer2",2015);
        MusicPlayer m6=new MusicPlayer("jazz3","jazz_singer3",2020);
        MusicPlayer m7=new MusicPlayer("rock1","rock_singer1",2019);
        MusicPlayer m8=new MusicPlayer("rock2","rock_singer2",2001);
        MusicPlayer m9=new MusicPlayer("rock3","rock_singer3",1999);
        MusicPlayer m10=new MusicPlayer("country1","country_singer1",2018);
        MusicPlayer m11=new MusicPlayer("country2","country_singer2",2014);
        MusicPlayer m12=new MusicPlayer("country3","country_singer3",2015);
        
        MusicCollection pop=new MusicCollection("pop");
        pop.addFile(m1);
        pop.addFile(m2);
        pop.addFile(m3);
        
        MusicCollection jazz=new MusicCollection("jazz");
        jazz.addFile(m4);
        jazz.addFile(m5);
        jazz.addFile(m6);
        
        MusicCollection rock=new MusicCollection("rock");
        rock.addFile(m7);
        rock.addFile(m8);
        rock.addFile(m9);
        
        MusicCollection country=new MusicCollection("country");
        country.addFile(m10);
        country.addFile(m11);
        country.addFile(m12);
        
        MusicCollection liked=new MusicCollection("liked");
        
        Collection collection=new Collection();
        collection.addMusic(pop);
        collection.addMusic(jazz);
        collection.addMusic(rock);
        collection.addMusic(country);
        collection.addMusic(liked);
        
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        Scanner scan3=new Scanner(System.in);
        
        System.out.println("Enter 1 to add music");
        System.out.println("Enter 2 to listen to music");
        System.out.println("Enter 2 to stop listening to music");
        System.out.println("Enter 4 to remove music");
        System.out.println("Enter 5 to see all collections");
        System.out.println("Enter 6 to add music to liked collections");
        System.out.println("Enter 7 to see all liked collections");
        System.out.println("Enter 8 to Exit");
        
        System.out.println("\n---------------------\n");
        
        
        while(true){
            System.out.println("Enter: ");
            int a=scan1.nextInt();
            
            if(a==1){
                String s1,s2,s3;
                int s4;
                System.out.println("Which Collection(Pop-Jazz-Rock-Country) ");
                s1=scan2.nextLine();
                
                System.out.println("Enter Music name: ");
                s2=scan2.nextLine();
                System.out.println("Enter singer name: ");
                s3=scan2.nextLine();
                System.out.println("Enter Year of publication: ");
                s4=scan2.nextInt();
                
                MusicPlayer m=new MusicPlayer(s2,s3,s4);
                collection.find(s1).addFile(m);
                System.out.println("Music added");
                
            }
            
            if(a==2){
                String s1;
                int b;
                System.out.println("Which Collection(Pop-Jazz-Rock-Country) ");
                s1=scan2.nextLine();
                
                System.out.println("Enter number to play music: ");
                b=scan3.nextInt();
                collection.find(s1).startPlaying(b);
            }
            if(a==3){
                pop.stopPlaying();
                jazz.stopPlaying();
                rock.stopPlaying();
                country.stopPlaying();
                System.out.println("player is stopped!");
            }
            
            if(a==4){
                String s1,s2;
                System.out.println("Which Collection(Pop-Jazz-Rock-Country) ");
                s1=scan2.nextLine();
                
                System.out.println("Enter number to remove music: ");
                s2=scan2.nextLine();
                collection.find(s1).removeFile(s2);
                
            }
            
            if(a==5){
                collection.print();
            }
            
            if(a==6){
                String s1,s2;
                System.out.println("Which Collection(Pop-Jazz-Rock-Country) ");
                s1=scan2.nextLine();
                
                System.out.println("Enter Music name: ");
                s2=scan2.nextLine();
                
                liked.addFile(collection.find(s1).findMucis(s2));
                System.out.println("Music added");
                
            }
            if(a==7){
                if(liked==null){
                    System.out.println("Empty");
                }
                else
                    liked.show();
            }
            if(a==8){
                System.out.println("Finish ");
                return;
            }
        
        
        }
        
    }
    
}
