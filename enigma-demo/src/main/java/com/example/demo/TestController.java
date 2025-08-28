package com.example.demo;

import io.isotope.enigma.client.CryptoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private CryptoClient cryptoClient;

    @PostMapping(value = "encrypt/{key}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> encrypt(@PathVariable String key, @RequestBody Map<String, String> body) {
        return ResponseEntity.ok(cryptoClient.encryptMap(body, key));
    }

    @PostMapping(value = "decrypt", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> decrypt(@RequestBody Map<String, String> body) {
        return ResponseEntity.ok(cryptoClient.decryptMap(body));
    }
}
