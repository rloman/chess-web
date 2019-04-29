package nl.yer.games.chessweb.api;

import nl.yer.games.chessweb.model.Piece;
import nl.yer.games.chessweb.service.PieceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pieces")
public class PieceController {

    private PieceService pieceService;

    public PieceController(PieceService pieceService) {
        this.pieceService = pieceService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Piece>> list() {
        return ResponseEntity.ok(this.pieceService.findAll());
    }
}
