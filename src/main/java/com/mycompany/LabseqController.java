package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabseqController {

    private final LabseqService labseqService;

    @Autowired
    public LabseqController(LabseqService labseqService) {
        this.labseqService = labseqService;
    }

    @GetMapping("/labseq/{n}")
    public ResponseEntity<?> getLabseq(@PathVariable long n) {
        try {
            long result = labseqService.calculate(n);
            return ResponseEntity.ok(result);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (StackOverflowError e) {
            return ResponseEntity.status(500).body("Calculation error: Stack overflow occurred. Input may be too large.");
        }
    }
}
