package com.basicschrodobert.schordobert;

import com.basicschrodobert.schordobert.config.CharacterJpaConfig;
import com.basicschrodobert.schordobert.model.CharacterInformation;
import com.basicschrodobert.schordobert.model.RpCharacter;
import com.basicschrodobert.schordobert.races.Race;
import com.basicschrodobert.schordobert.repository.CharacterInformationRepository;
import com.basicschrodobert.schordobert.repository.RpCharacterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.context.jdbc.Sql.ExecutionPhase.BEFORE_TEST_CLASS;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SchordobertApplication.class, CharacterJpaConfig.class})
//@Sql(scripts = {"/character_schema.sql"}, executionPhase = BEFORE_TEST_CLASS)
public class CharacterInformationIntegrationTest {

    @Autowired
    private CharacterInformationRepository characterInformationRepository;

    @Test
    public void givenRepository_WhenSaveAndRetrieveEntity(){
        CharacterInformation characterInformation = characterInformationRepository.save(new CharacterInformation.CharacterInformationBuilder(1L, Race.HUMAN)
                .setAge(10).setHeight(100).setWeight(45).build());
        CharacterInformation foundInformation = characterInformationRepository.getReferenceById(1L);

        assertNotNull(foundInformation);
        assertEquals(foundInformation.getCharId(), characterInformation.getCharId());
    }

}
