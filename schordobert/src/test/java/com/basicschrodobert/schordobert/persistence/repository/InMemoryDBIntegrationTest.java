package com.basicschrodobert.schordobert.persistence.repository;

import com.basicschrodobert.schordobert.config.CharacterJpaConfig;
import com.basicschrodobert.schordobert.model.RpCharacter;
import com.basicschrodobert.schordobert.repository.RpCharacterRepository;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {CharacterJpaConfig.class},
        loader = AnnotationConfigContextLoader.class
)
@Transactional
public class InMemoryDBIntegrationTest {

    @Resource
    private RpCharacterRepository rpCharacterRepository;

    @Test
    public void givenCharacter_whenSave_thenGetOk(){
        RpCharacter character = new RpCharacter("Janne", 1);
        rpCharacterRepository.save(character);

        RpCharacter foundCharacter = rpCharacterRepository.findById(1L).get();
        assertEquals("Janne", foundCharacter.getName());
    }
}
