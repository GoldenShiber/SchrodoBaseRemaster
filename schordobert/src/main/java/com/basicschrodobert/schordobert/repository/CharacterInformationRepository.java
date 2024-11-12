package com.basicschrodobert.schordobert.repository;


import com.basicschrodobert.schordobert.model.CharacterInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterInformationRepository extends JpaRepository<CharacterInformation, Long> {
}
