package nl.yer.games.chessweb.api;

import nl.yer.games.chessweb.model.Piece;
import nl.yer.games.chessweb.service.PieceService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("{id}")
    public Piece get(@PathVariable long id) {

        Optional<Piece> optionalResult = this.pieceService.findById(id);
        if(optionalResult.isPresent()) {
            Piece result = optionalResult.get();

            return result;
        }
        else {
            return null; // TODO refactor later to ResponseEntity
        }
    }

    @PutMapping("{id}")
    public Piece update(@PathVariable long id, @RequestBody Piece input) {

        // fetch the piece by id
        Optional<Piece> optionalTarget = this.pieceService.findById(id);
        if(optionalTarget.isPresent()) {
            Piece target = optionalTarget.get();

            // set the values to target from input
            target.setName(input.getName());

            // save target
            return this.pieceService.save(target);
        }

        else {
            return null; // pretty bad!
        }

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id) {

        Optional<Piece> optionalResult = this.pieceService.findById(id);
        if(optionalResult.isPresent()) {

           this.pieceService.deleteById(id);
        }
    }

}
