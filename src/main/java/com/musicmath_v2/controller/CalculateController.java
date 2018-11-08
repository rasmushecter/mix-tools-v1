package com.musicmath_v2.controller;


import com.musicmath_v2.repository.RevRepo;
import com.musicmath_v2.service.RevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class CalculateController {

    @Autowired
    RevRepo rR;

    @GetMapping("/calculateBpm")
    public String getCalculateBpm()
    {

        return "calculateBpm";
    }

    @PostMapping("/calculateBpm")
    public String calculateBpmResult(@RequestParam("bpm")  double bpm)
    {

                rR.revBpm(bpm);
                return "redirect:/calculateBpmResult";
    }

    @GetMapping("/calculateBpmResult")
    public String printCalculateResult(Model model)
    {
        model.addAttribute("arrayOfRevtimes",rR.getAll());
        return "calculateBpmResult";
    }
}
