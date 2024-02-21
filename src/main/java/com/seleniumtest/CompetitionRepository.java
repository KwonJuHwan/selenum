package com.seleniumtest;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition,Long> {
    Boolean existsByTitle(String title);
    List<Competition> findAllByStatus(RecruitmentStatus status);
}
