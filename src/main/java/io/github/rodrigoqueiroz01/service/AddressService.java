package io.github.rodrigoqueiroz01.service;

import io.github.rodrigoqueiroz01.model.AddresModel;
import io.github.rodrigoqueiroz01.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
=======

>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
import javax.persistence.NoResultException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AddressService {

<<<<<<< HEAD
    public static final String MSG_INVALIDATION = "Endereço inválido.";

    private final AddressRepository addressRepository;

    public AddresModel save(AddresModel addresModel) {
        return addressRepository.save(addresModel);
    }

    public AddresModel findById(UUID id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new NoResultException(MSG_INVALIDATION));
    }

    public List<AddresModel> findAll() {
=======
    private final AddressRepository addressRepository;

    public AddresModel create(AddresModel addresModel) {
        return addressRepository.save(addresModel);
    }

    public AddresModel readById(UUID id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new NoResultException("Endereço inválido."));
    }

    public List<AddresModel> readAll() {
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        return addressRepository.findAll();
    }

    public AddresModel update(AddresModel addresModel, UUID id) {
        addressRepository.findById(id)
<<<<<<< HEAD
                .orElseThrow(() -> new NoResultException(MSG_INVALIDATION));
=======
                .orElseThrow(() -> new NoResultException("Endereço inválido."));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        addresModel.setId(id);
        return addresModel;
    }

    public UUID delete(UUID id) {
        var addresModel = addressRepository.findById(id)
<<<<<<< HEAD
                .orElseThrow(() -> new NoResultException(MSG_INVALIDATION));
=======
                .orElseThrow(() -> new NoResultException("Endereço inválido."));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        addressRepository.delete(addresModel);
        return id;
    }

}
