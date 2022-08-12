package io.github.rodrigoqueiroz01.service;

import io.github.rodrigoqueiroz01.model.ClientModel;
import io.github.rodrigoqueiroz01.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.persistence.NoResultException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ClientService {

    public static final String MSG_VALIDATION = "Cliente inválido.";

    private final ClientRepository clientRepository;

    public ClientModel create(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    public ClientModel readById(UUID id) {
        return clientRepository.findById(id)
<<<<<<< HEAD
                .orElseThrow(() -> new NoResultException(MSG_VALIDATION));
=======
                .orElseThrow(() -> new NoResultException("Cliente inválido."));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
    }

    public List<ClientModel> readAll() {
        return clientRepository.findAll();
    }

    public ClientModel update(ClientModel clientModel, UUID id) {
        clientRepository.findById(id)
<<<<<<< HEAD
                .orElseThrow(() -> new NoResultException(MSG_VALIDATION));
=======
                .orElseThrow(() -> new NoResultException("Cliente inválido."));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        clientModel.setId(id);
        return clientModel;
    }

    public UUID delete(UUID id) {
        var clientModel = clientRepository.findById(id)
<<<<<<< HEAD
                .orElseThrow(() -> new NoResultException(MSG_VALIDATION));
=======
                .orElseThrow(() -> new NoResultException("Cliente inválido."));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        clientRepository.delete(clientModel);
        return id;
    }

}
