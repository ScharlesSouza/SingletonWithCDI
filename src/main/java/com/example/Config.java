package com.example;

import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Config {
    @ConfigProperty(name="formatoRelatorios")
    private String formatoRelatorios;
    @ConfigProperty(name="tipoGraficos")
    private String tipoGraficos;

    public String getFormatoRelatorios() {
        return formatoRelatorios;
    }

    public void setFormatoRelatorios(String formatoRelatorios) {
        this.formatoRelatorios = formatoRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
}
