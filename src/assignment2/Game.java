
package assignment2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class Game {
    private String name;
    private String platform;
    private String genre;
    private String size;
    private LocalDate launchDate;
    private String availability;

    public Game(String name, String platform, String genre, String size, LocalDate launchDate, String availability) {
        setName(name);
        setPlatform (platform);
        setGenre(genre);
        setSize(size);
        setLaunchDate (launchDate);
        setAvailability(availability);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
        else
            throw new IllegalArgumentException("Name of the game cannot be empty");
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        if(!platform.isEmpty())
            this.platform = platform;
        else
            throw new IllegalArgumentException("Platform cannot be empty. For example like PC,mobile,Web browser etc ");
            
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if(!genre.isEmpty())
            this.genre = genre;
        else
            throw new IllegalArgumentException("Genre of the game cannot be empty");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!size.isEmpty())
            this.size = size;   
        else
            throw new IllegalArgumentException("size cannot be empty and must be integer");
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        int gamedate = Period.between(launchDate, LocalDate.now()).getYears();
       if(launchDate.isAfter(LocalDate.of(1990, Month.MARCH, 1))&&
               launchDate.isBefore(LocalDate.now()))
         this.launchDate = launchDate;
               
           else
            throw new IllegalArgumentException("launch date must be greater than 1990 ");
        
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        if(!availability.isEmpty())
            this.availability = availability;
        else
            throw new IllegalArgumentException("Availability ");
    }
    
    
    

    
    
}
