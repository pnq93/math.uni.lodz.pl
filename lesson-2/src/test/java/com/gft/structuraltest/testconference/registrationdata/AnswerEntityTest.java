package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

import com.gft.structuraltest.testconference.shared.Answer;

public class AnswerEntityTest{
	//0
    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    
    //1
    @Test
    public void shouldReturnTrueWhenComparingToTheSameObject(){
        AnswerEntity an1 = new AnswerEntity();
        assertTrue(an1.equals(an1));
    }
    //2
    @Test
    public void shouldReturnFalseWhenObjectIsNull1(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    //3
    @Test
    public void shouldReturnFalseWhenComparingToOtherObjectClass(){
    	Answer answer = new Answer();
    	AnswerEntity an = new AnswerEntity();
    	assertFalse(an.equals(answer));
    }
    //4
    @Test
    public void shouldReturnFalseWhenAnswerTextIsNotNull(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an2.setAnswerText("cos");
    	assertFalse(an1.equals(an2));
    }
    //5


    @Test
    public void shouldReturnTrueWhenAnswerTextFromFirstObjIsNotEqualToAnswerTextInSecondObj(){
     	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an1.setAnswerText("cos");
    	an2.setAnswerText("cos2");
    	assertFalse(an1.equals(an2));
    }
    //6
    @Test
    public void shouldReturnFalseWhenIdIsNotNull(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an2.setId(1L);
    	assertFalse(an1.equals(an2));
    }
    //7
    @Test
    public void shouldReturnFalseWhenQuestionIsNotNull(){
    	QuestionEntity q1 = new QuestionEntity();
    	QuestionEntity q2 = new QuestionEntity();
    	q2.setQuestionText("COS");
    	assertFalse(q1.equals(q2));
    }

    //8
    @Test
    public void shouldReturnTrueAtTheEndOfMethod(){
    	AnswerEntity an1 = new AnswerEntity();
    	AnswerEntity an2 = new AnswerEntity();
    	an1.setAnswerText("cos");
    	an2.setAnswerText("cos");
    	an1.setId(1L);
    	an2.setId(1L);
    	QuestionEntity question = new QuestionEntity();
    	an1.setQuestion(question);
    	an2.setQuestion(question);
    	assertTrue(an1.equals(an2));
    }

    
}