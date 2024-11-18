package com.basicschrodobert.schordobert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.basicschrodobert.schordobert.model.RpCharacter;
import com.basicschrodobert.schordobert.repository.RpCharacterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.basicschrodobert.schordobert.config.CharacterJpaConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SchordobertApplication.class, CharacterJpaConfig.class})
//@Sql(scripts = {"/character_schema.sql"}, executionPhase = BEFORE_TEST_CLASS)
public class RpCharacterIntegrationTest {

    @Autowired
    private RpCharacterRepository rpCharacterRepository;

    @Test
    public void givenRepository_WhenSaveAndRetrieveEntity(){
        RpCharacter rpCharacter = rpCharacterRepository.save(new RpCharacter("kalle", 1L));
        RpCharacter foundCharacter = rpCharacterRepository.getReferenceById(1L);

        assertNotNull(foundCharacter);
        assertEquals(foundCharacter.getId(), rpCharacter.getId());
    }

}
