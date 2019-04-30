package nl.yer.games.chessweb.service;

import nl.yer.games.chessweb.model.Piece;
import nl.yer.games.chessweb.persistence.PieceRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PieceService {


    private PieceRepository pieceRepository;

    public PieceService(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public Iterable<Piece> findAll() {
        return pieceRepository.findAll();
    }

    public Piece save(Piece piece) {
        return this.pieceRepository.save(piece);
    }
}
