package fr.ape.test.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import fr.ape.test.ejb.EjbRestWithInjection;
import fr.ape.test.ejb.EjbRestWithoutInjection;

@ApplicationPath("/")
public class ApplicationConfig extends Application {
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(EjbRestWithInjection.class, EjbRestWithoutInjection.class));
    }

}