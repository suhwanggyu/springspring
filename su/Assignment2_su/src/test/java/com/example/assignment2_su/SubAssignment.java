package com.example.assignment2_su;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;

public class SubAssignment {
    @Configuration
    static class Beacon {
        @Bean
        public Beacon whoAmI() {
            return new Beacon();
        }
    }

    @Test
    public void singletonTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Beacon.class);
        Beacon b1 = ac.getBean("whoAmI", Beacon.class);

        Beacon b2 = ac.getBean("whoAmI", Beacon.class);

        assertThat(b1).isSameAs(b2);


    }



}
