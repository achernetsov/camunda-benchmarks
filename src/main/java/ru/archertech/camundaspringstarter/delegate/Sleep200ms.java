package ru.archertech.camundaspringstarter.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Sleep200ms implements JavaDelegate {
    private static final Logger log = LoggerFactory.getLogger(Sleep200ms.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Thread.sleep(200);
    }
}
