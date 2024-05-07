package projects.zuka.persistence;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLInsert;

@Entity
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(length = 2000)
    private String description;
    private String image;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public String getImage() {
        return image;
    }


}
