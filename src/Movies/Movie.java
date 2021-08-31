package Movies;

import java.io.Serializable;

public class Movie {

    public Object getCategory;
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
