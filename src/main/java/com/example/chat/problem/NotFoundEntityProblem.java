package com.example.chat.problem;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class NotFoundEntityProblem extends AbstractThrowableProblem {
    public NotFoundEntityProblem(Class classOf, Object value){
        super(DEFAULT_TYPE, "Entity not found", Status.NOT_FOUND, String.format("Entity %s not found id %s", classOf.getSimpleName(), value), null);
    }

}
