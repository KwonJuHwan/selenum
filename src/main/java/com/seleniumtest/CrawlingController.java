package com.seleniumtest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CrawlingController {

    private final CrawlingService crawlingService;

    @GetMapping("api/activity/init")
    public void activityInit() throws InterruptedException {
        crawlingService.initActivity();
    }
    @GetMapping("api/activity/new")
    public void activityNew() throws InterruptedException {
        crawlingService.updateNewActivity();
    }
    @GetMapping("api/activity/done")
    public void activityDone() throws InterruptedException {
        crawlingService.updateDoneActivity();
    }

    @GetMapping("api/competition/init")
    public void competitionInit() throws InterruptedException {
        crawlingService.initCompetition();
    }

    @GetMapping("api/competition/new")
    public void competitionNew() throws InterruptedException {
        crawlingService.updateNewCompetition();
    }
    @GetMapping("api/competition/done")
    public void competitionDone() throws InterruptedException {
        crawlingService.updateDoneCompetition();
    }





}
