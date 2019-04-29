package nl.yer.games.chessweb.service;

import nl.yer.games.chessweb.model.Piece;
import nl.yer.games.chessweb.persistence.PieceRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class PieceService {


    private PieceRepository pieceRepository;


    public PieceService(PieceRepository pieceRepository) {
        this.pieceRepository = pieceRepository;
    }

    public Piece save(Piece piece) {
        return this.pieceRepository.save(piece);
    }

    public Optional<Piece> findById(Long aLong) {
        return pieceRepository.findById(aLong);
    }

    public Iterable<Piece> findAll() {
        return pieceRepository.findAll();
    }

    public void deleteById(Long aLong) {
        pieceRepository.deleteById(aLong);
    }
}
