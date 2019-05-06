package nl.yer.games.chessweb.persistence;

import nl.yer.games.chessweb.model.Piece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PieceRepository extends CrudRepository <Piece, Long> {

    Piece findByName(String name);
    List<Piece> findAllByPoints(int points);


}
