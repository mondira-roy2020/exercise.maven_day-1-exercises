package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if (score >= 90 && score<=100) {
            return true;
        }
        return false;
    }

    public Boolean isGradeB(Double score) {
        if (score >= 80 && score<=89) {
            return true;
        }
        return false;
    }

    public Boolean isGradeC(Double score) {
        if (score >= 70 && score<=79) {
            return true;
        }
        return false;
    }

    public Boolean isGradeD(Double score) {
        if (score >= 65 && score <= 69) {
            return true;
        }
        return false;
    }

    public Boolean isGradeF(Double score) {
        if (score > 64 ) {
            return true;
        }
        return false;
    }

    public Character getGrade(Double score) {
        if(isGradeA(score)){
            return 'A';
        } else if(isGradeB(score)) {
            return 'B';
        } else if(isGradeC(score))  {
            return 'C';
        } else if(isGradeD(score))  {
            return 'D';
        }
            return 'F';
    }
}
