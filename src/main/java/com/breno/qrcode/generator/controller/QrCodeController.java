package com.breno.qrcode.generator.controller;

import com.breno.qrcode.generator.dto.QrCodeGeneratorRequest;
import com.breno.qrcode.generator.dto.QrCodeGeneratorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponse> generate(@RequestBody QrCodeGeneratorRequest request) {
        return null;
    }
}
