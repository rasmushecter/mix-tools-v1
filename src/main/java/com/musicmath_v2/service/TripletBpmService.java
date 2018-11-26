package com.musicmath_v2.service;

import com.musicmath_v2.domain.TripletBpmEntity;
import com.musicmath_v2.repository.TripletBpmRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TripletBpmService implements TripletBpmRepo {

    TripletBpmEntity t = new TripletBpmEntity();


    public void tripletBpm(double bpm){

        double result1;
        result1 = 240000/bpm*0.667;
        t.setWholeNote(result1);

        double result2;
        result2 = 120000/bpm*0.667;
        t.setHalfNote(result2);

        double result3;
        result3 = 60000/bpm*0.667;
        t.setFourthNote(result3);

        double result4;
        result4 = 30000/bpm*0.667;
        t.setEightNote(result4);

        double result5;
        result5 = 15000/bpm*0.667;
        t.setSixteenNote(result5);

        double result6;
        result6 = 7500/bpm*0.667;
        t.setThertyTwoNote(result6);

        double result7;
        result7 = 3750/bpm*0.667;
        t.setSixtyfourNote(result7);
    }

    public ArrayList<TripletBpmEntity> getAll(){

        ArrayList<TripletBpmEntity> tripletList = new ArrayList<>();

        tripletList.add(new TripletBpmEntity(t.getWholeNote(),t.getHalfNote(),t.getFourthNote(),t.getEightNote(),t.getSixteenNote(),t.getThertyTwoNote(),t.getSixtyfourNote()));

        return tripletList;
    }

}
