package nl.yer.games.chessweb.model;

import nl.yer.games.chessweb.model.enums.Genre;

import javax.persistence.*;

@Entity
public class Piece {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int points;

    @Enumerated(value=EnumType.STRING)
    private Genre genre;

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
