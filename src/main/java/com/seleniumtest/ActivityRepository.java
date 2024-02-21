package com.seleniumtest;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity,Long> {
    Boolean existsByTitle(String title);

    List<Activity> findAllByStatus(RecruitmentStatus status);

}
