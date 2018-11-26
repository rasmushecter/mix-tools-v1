package com.musicmath_v2.service;


import com.musicmath_v2.domain.RevEntity;
import com.musicmath_v2.repository.RevRepo;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public class RevService implements RevRepo {

    RevEntity r = new RevEntity();


    public void revBpm(double bpm)
    {


        double result1;
        result1 = 240000/bpm ;
        r.setWholeNote(result1);

        double result2;
        result2 = 120000/bpm ;
        r.setHalfNote(result2);

        double result3;
        result3 = 60000/bpm ;
        r.setFourthNote(result3);

        double result4;
        result4 = 30000/bpm ;
        r.setEightNote(result4);

        double result5;
        result5 = 15000/bpm ;
        r.setSixteenNote(result5);

        double result6;
        result6 = 7500/bpm ;
        r.setThertyTwoNote(result6);

        double result7;
        result7 = 3750/bpm ;
        r.setSixtyfourNote(result7);

    }

    public ArrayList<RevEntity>  getAll()
    {
        ArrayList<RevEntity>revList = new ArrayList<>();


        revList.add(new RevEntity(r.getWholeNote(),r.getHalfNote(),r.getFourthNote(),r.getEightNote(),r.getSixteenNote(),r.getThertyTwoNote(),r.getSixtyfourNote()));
   
        return revList;
    }
}
