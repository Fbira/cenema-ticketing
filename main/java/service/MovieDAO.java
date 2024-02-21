package service;

import pojo.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
	public static int save(Movie movie){  
        int status=0;  
        
        try{  
            Connection conn = DBService.openConnection();  
            PreparedStatement ps = conn.prepareStatement(  
                         "insert into movies(movie_name, movie_description, cover_image, video_url, date, start_time, duration_in_minute) values (?,?,?,?,?,?,?)");  
            
            ps.setString(1, movie.getMovie_name());
            ps.setString(2, movie.getMovie_description());
            ps.setString(3, movie.getCover_image());
            ps.setString(4, movie.getVideo_url());
            ps.setString(5, movie.getDate());
            ps.setString(6, movie.getStart_time());
            ps.setInt(7, movie.getDuration_in_minute());
            
            status = ps.executeUpdate();  
            conn.close();
            
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
	
	public static int update(Movie movie) {
	    int status = 0;

	    try {
	        Connection conn = DBService.openConnection();

	        PreparedStatement ps = conn.prepareStatement(
	                "UPDATE movies SET movie_name=?, movie_description=?, cover_image=?, video_url=?, date=?, start_time=?, duration_in_minute=? WHERE id=?");

	        ps.setString(1, movie.getMovie_name());
	        ps.setString(2, movie.getMovie_description());
	        ps.setString(3, movie.getCover_image());
	        ps.setString(4, movie.getVideo_url());
	        ps.setString(5, movie.getDate());
	        ps.setString(6, movie.getStart_time());
	        ps.setInt(7, movie.getDuration_in_minute());
	        ps.setInt(8, movie.getId());

	        status = ps.executeUpdate();
	        conn.close();

	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	    return status;
	}
	
	public static int delete(int movieId) {
	    int status = 0;

	    try {
	        Connection conn = DBService.openConnection();

	        PreparedStatement ps = conn.prepareStatement("DELETE FROM movies WHERE id=?");
	        ps.setInt(1, movieId);

	        status = ps.executeUpdate();
	        conn.close();

	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	    return status;
	}
	
	
	public static Movie getMovieById(int movieId) {
	    Movie movie = null;

	    try {
	        // Establish Connection
	        Connection conn = DBService.openConnection();

	        PreparedStatement ps = conn.prepareStatement("SELECT * FROM movies WHERE id=?");
	        ps.setInt(1, movieId);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            movie = new Movie();
	            movie.setId(rs.getInt("id"));
	            movie.setMovie_name(rs.getString("movie_name"));
	            movie.setMovie_description(rs.getString("movie_description"));
	            movie.setCover_image(rs.getString("cover_image"));
	            movie.setVideo_url(rs.getString("video_url"));
	            movie.setDate(rs.getString("date"));
	            movie.setStart_time(rs.getString("start_time"));
	            movie.setDuration_in_minute(rs.getInt("duration_in_minute"));
	        }

	        conn.close();

	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	    return movie;
	}
	
	public static List<Movie> getAllMovies() {
	    List<Movie> movieList = new ArrayList<>();

	    try {
	        Connection conn = DBService.openConnection();

	        PreparedStatement ps = conn.prepareStatement("SELECT * FROM movies");
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Movie movie = new Movie();
	            movie.setId(rs.getInt("id"));
	            movie.setMovie_name(rs.getString("movie_name"));
	            movie.setMovie_description(rs.getString("movie_description"));
	            movie.setCover_image(rs.getString("cover_image"));
	            movie.setVideo_url(rs.getString("video_url"));
	            movie.setDate(rs.getString("date"));
	            movie.setStart_time(rs.getString("start_time"));
	            movie.setDuration_in_minute(rs.getInt("duration_in_minute"));

	            movieList.add(movie);
	        }

	        conn.close();

	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	    return movieList;
	}
	
	
}

