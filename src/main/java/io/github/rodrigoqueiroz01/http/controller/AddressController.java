package io.github.rodrigoqueiroz01.http.controller;

import io.github.rodrigoqueiroz01.http.dto.request.AddressRequest;
import io.github.rodrigoqueiroz01.http.dto.response.AddressResponse;
import io.github.rodrigoqueiroz01.http.mapper.AddressMapper;
import io.github.rodrigoqueiroz01.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
import java.util.UUID;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
@Validated
public class AddressController {

    private final AddressService addressService;

    @PostMapping
<<<<<<< HEAD
    public ResponseEntity<AddressResponse> save(@Valid @RequestBody AddressRequest addressRequest) {
        return ResponseEntity.ok()
                .body(AddressMapper.toResponse(addressService.save(AddressMapper.toModel(addressRequest))));
    }

    @GetMapping("/{addressId}")
    public ResponseEntity<AddressResponse> findById(@PathVariable String addressId) {
        return ResponseEntity.ok()
                .body(AddressMapper.toResponse(addressService.findById(UUID.fromString(addressId))));
    }

    @GetMapping("/all")
    public ResponseEntity<List<AddressResponse>> findAll() {
        return ResponseEntity.ok()
                .body(AddressMapper.toResponseList(addressService.findAll()));
    }

    @PutMapping("/{addressId}")
    public ResponseEntity<AddressResponse> update(@Valid @RequestBody AddressRequest addressRequest, @PathVariable String addressId) {
        return ResponseEntity.ok()
                .body(AddressMapper.toResponse(addressService.update(AddressMapper.toModel(addressRequest), UUID.fromString(addressId))));
    }

    @DeleteMapping("/{addressId}")
    public ResponseEntity<UUID> delete(@PathVariable String addressId) {
        return ResponseEntity.ok()
                .body(addressService.delete(UUID.fromString(addressId)));
=======
    public ResponseEntity<AddressResponse> create(@RequestBody AddressRequest addressRequest) {
        return ResponseEntity.ok()
                .body(AddressMapper.toResponse(addressService.create()))
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
    }

}
