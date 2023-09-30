package com.example.chat.problem;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class ForbiddenProblem extends AbstractThrowableProblem {

    public ForbiddenProblem(String message){
        super(DEFAULT_TYPE, "Forbidden", Status.FORBIDDEN, message);
    }

}
