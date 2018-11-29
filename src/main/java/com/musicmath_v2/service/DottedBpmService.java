package com.musicmath_v2.service;

import com.musicmath_v2.domain.DottedBpmEntity;
import com.musicmath_v2.repository.DottedBpmRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DottedBpmService implements DottedBpmRepo {

    private DottedBpmEntity d = new DottedBpmEntity();


    public void dottedBpm(double bpm){

        double result1;
        result1 = 240000/bpm*1.5 ;
        d.setWholeNote(result1);

        double result2;
        result2 = 120000/bpm*1.5 ;
        d.setHalfNote(result2);

        double result3;
        result3 = 60000/bpm*1.5 ;
        d.setFourthNote(result3);

        double result4;
        result4 = 30000/bpm*1.5 ;
        d.setEightNote(result4);

        double result5;
        result5 = 15000/bpm*1.5 ;
        d.setSixteenNote(result5);

        double result6;
        result6 = 7500/bpm*1.5 ;
        d.setThertyTwoNote(result6);

        double result7;
        result7 = 3750/bpm*1.5 ;
        d.setSixtyfourNote(result7);
    }

    public ArrayList<DottedBpmEntity> getAll(){

        ArrayList<DottedBpmEntity> dottedList = new ArrayList<>();

        dottedList.add(new DottedBpmEntity(d.getWholeNote(),d.getHalfNote(),d.getFourthNote(),d.getEightNote(),d.getSixteenNote(),d.getThertyTwoNote(),d.getSixtyfourNote()));

        return dottedList;
    }
}
