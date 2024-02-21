package pojo;

public class Movie {
    private String movie_name, movie_description, video_url, cover_image, date, start_time;
    private int id, duration_in_minute;
    
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    
    public String getMovie_name() {
        return movie_name;
    }
    
    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }
    
    public String getMovie_description() {
        return movie_description;
    }
    
    public void setMovie_description(String movie_description) {
        this.movie_description = movie_description;
    }
    
    public String getVideo_url() {
        return video_url;
    }
    
    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }
    
    public String getCover_image() {
        return cover_image;
    }
    
    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getStart_time() {
        return start_time;
    }
    
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }
    
    public int getDuration_in_minute() {
        return duration_in_minute;
    }
    
    public void setDuration_in_minute(int duration_in_minute) {
        this.duration_in_minute = duration_in_minute;
    }
}

