package com.gsta.ems.mock.util;


import lombok.Getter;
import lombok.Setter;

import java.util.Random;


/**
 * @param
 * @param
 */
@Getter
@Setter
public class Simulation {

    private static final double FAEV_MEAN = 0.2585972151524138;
    private static final double FAEV_STD = 3.236455096941297;

    private static final double FREV_MEAN = 0.01333333333333334;
    private static final double FREV_STD = 0.4755172622173318;

    private static final double BREV_MEAN = 0.24672901665989444;
    private static final double BREV_STD = 2.179365026625058;

    private static final double PA_MEAN = 1.0584810796507207E-4;
    private static final double PA_STD = 0.03248959462355279;

    private static final double PB_MEAN = 2.604166666666396E-5;
    private static final double PB_STD = 0.029791405034985716;

    private static final double PC_MEAN = 0.001285140562249;
    private static final double PC_STD = 0.12450529129544982;

    private static final double QA_MEAN = 4.3715846994535665E-4;
    private static final double QA_STD = 0.09404128820037949;

    private static final double QB_MEAN = 6.269592476489055E-5;
    private static final double QB_STD = 0.07279675216685474;

    private static final double QC_MEAN = 4.866180048661767E-5;
    private static final double QC_STD = 0.04744376828670289;

    private static final double SA_MEAN = 5.172413793103493E-4;
    private static final double SA_STD = 0.12787226714483507;

    private static final double SB_MEAN = 1.6043685326953128E-19;
    private static final double SB_STD = 0.08176317870107759;

    private static final double SC_MEAN = 6.41797031688715E-5;
    private static final double SC_STD = 0.05408805365933103;

    private static final double PFA_MEAN = -6.814814814814797E-4;
    private static final double PFA_STD = 0.045208249784028355;

    private static final double PFB_MEAN = 1.7698343504794683E-4;
    private static final double PFB_STD = 0.13381779266534163;

    private static final double PFC_MEAN = 0.0011323529411764698;
    private static final double PFC_STD = 0.12107046232716047;

    private static Random r = new Random();

    private static int faveCount = 0;

    private static int brevCount = 0;

    private static int paCount = 0;

    private static int pbCount = 0;

    private static int pcCount = 0;

    private static int qaCount = 0;

    private static int qbCount = 0;

    private static int qcCount = 0;

    private static int saCount = 0;

    private static int sbCount = 0;

    private static int scCount = 0;

    private static int pfaCount = 0;

    private static int pfbCount = 0;

    private static int pfcCount = 0;

    public static double getFaevNum(){
        if(faveCount >= 8){
            double num = Math.abs(r.nextGaussian() * Math.sqrt(FAEV_STD) + FAEV_MEAN);
            faveCount = 0;
            return num;
        }else {
            faveCount++;
            return 0.0;
        }
    }

    public static double getBrevNum(){
        if(brevCount >= 5){
            double num = Math.abs(r.nextGaussian() * Math.sqrt(FREV_STD) + FREV_MEAN);
            brevCount = 0;
            return num;
        }else {
            brevCount++;
            return 0.0;
        }
    };

    public static double getFrevNum(){
        return Math.abs(r.nextGaussian() * Math.sqrt(BREV_STD) + BREV_MEAN);
    };

    public static double getPaNum(){
        if(paCount >= 6){
            double num = r.nextGaussian() * Math.sqrt(PA_STD) + PA_MEAN;
            paCount = 0;
            return num;
        }else{
            paCount++;
            return 0.0;
        }
    };

    public static double getPbNum(){
        if(pbCount >= 6){
            double num = r.nextGaussian() * Math.sqrt(PB_STD) + PB_MEAN;
            pbCount = 0;
            return num;
        }else{
            pbCount++;
            return 0.0;
        }
    };

    public static double getPcNum(){
        if(pcCount >= 6){
            double num = r.nextGaussian() * Math.sqrt(PC_STD) + PC_MEAN;
            pcCount = 0;
            return num;
        }else{
            pcCount++;
            return 0.0;
        }
    };

    public static double getQaNum(){
        if(qaCount >= 3){
            double num = r.nextGaussian() * Math.sqrt(QA_STD) + QA_MEAN;
            qaCount = 0;
            return num;
        }else{
            qaCount++;
            return 0.0;
        }

    };

    public static double getQbNum(){
        if(qbCount >= 5){
            double num = r.nextGaussian() * Math.sqrt(QB_STD) + QB_MEAN;
            qbCount = 0;
            return num;
        }else{
            qbCount++;
            return 0.0;
        }
    };

    public static double getQcNum(){
        if(qcCount >= 3){
            double num = r.nextGaussian() * Math.sqrt(QC_STD) + QC_MEAN;
            qbCount = 0;
            return num;
        }else{
            qbCount++;
            return 0.0;
        }
    };

    public static double getSaNum(){
        if(saCount >= 7){
            double num = r.nextGaussian() * Math.sqrt(SA_STD) + SA_MEAN;
            saCount = 0;
            return num;
        }else{
            saCount++;
            return 0.0;
        }
    };

    public static double getSbNum(){
        if(sbCount >= 8){
            double num = r.nextGaussian() * Math.sqrt(SB_STD) + SB_MEAN;
            sbCount = 0;
            return num;
        }else{
            sbCount++;
            return 0.0;
        }
    };

    public static double getScNum(){
        if(scCount >= 7){
            double num = r.nextGaussian() * Math.sqrt(SC_STD) + SC_MEAN;
            scCount = 0;
            return num;
        }else{
            scCount++;
            return 0.0;
        }

    };

    public static double getPfaNum(){
        if(pfaCount >= 9){
            double num = r.nextGaussian() * Math.sqrt(PFA_STD) + PFA_MEAN;
            pfaCount = 0;
            return num;
        }else{
            pfaCount++;
            return 0.0;
        }

    };

    public static double getPfbNum(){
        if(pfbCount >= 10){
            double num = r.nextGaussian() * Math.sqrt(PFB_STD) + PFB_MEAN;
            pfbCount = 0;
            return num;
        }else{
            pfbCount++;
            return 0.0;
        }

    };

    public static double getPfcNum(){
        if(pfcCount >= 10){
            double num = r.nextGaussian() * Math.sqrt(PFC_STD) + PFC_MEAN;
            pfcCount = 0;
            return num;
        }else{
            pfcCount++;
            return 0.0;
        }

    };

}
