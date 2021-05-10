package kodlamaio.Hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_titles")
public class Title {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;

    public Title() {
    }

    ;

    public Title(int id, String title) {
        super();
        this.id = id;
        this.title = title;
    }
}
