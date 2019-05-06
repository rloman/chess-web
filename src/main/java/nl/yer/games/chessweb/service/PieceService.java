package nl.yer.games.chessweb.service;

import nl.yer.games.chessweb.model.Piece;
import nl.yer.games.chessweb.persistence.PieceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PieceService {


    private PieceRepository pieceRepository;

    public PieceService(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public Iterable<Piece> findAll() {
        return pieceRepository.findAll();
    }

	@Transactional
    public Piece save(Piece piece) {

        return this.pieceRepository.save(piece);

    }

    public Optional<Piece> findById(Long aLong) {
        return pieceRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        pieceRepository.deleteById(aLong);
    }
}
