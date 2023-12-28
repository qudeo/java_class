package my.Text_RPG.service;

import my.Text_RPG.dto.CharacterDTO;
import my.Text_RPG.repository.CharacterRepository;

import java.util.ArrayList;
import java.util.List;

public class CharacterService {
CharacterRepository characterRepository = new CharacterRepository();

    public void status() {
        List<CharacterDTO> characterDTOList = characterRepository.attack();

    }
}
