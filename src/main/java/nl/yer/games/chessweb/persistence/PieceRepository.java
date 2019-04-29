package nl.yer.games.chessweb.persistence;

import nl.yer.games.chessweb.model.Piece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieceRepository extends CrudRepository <Piece, Long>{


}
