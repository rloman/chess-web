package nl.yer.games.chessweb.api;

import nl.yer.games.chessweb.model.Piece;
import nl.yer.games.chessweb.service.PieceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pieces")
public class PieceController {

    private PieceService pieceService;

    public PieceController(PieceService pieceService) {
        this.pieceService = pieceService;
    }

    @GetMapping
    public Iterable<Piece> list() {

        Iterable<Piece> result = this.pieceService.findAll();

        return result;
    }

    @PostMapping
    public Piece create(@RequestBody Piece piece) {

        return this.pieceService.save(piece);

    }

}
