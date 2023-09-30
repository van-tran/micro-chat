package com.example.chat.problem;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class RuntimeProblem extends AbstractThrowableProblem {

    public RuntimeProblem(String message){
        super(DEFAULT_TYPE, "Internal error", Status.INTERNAL_SERVER_ERROR, message);
    }

}
