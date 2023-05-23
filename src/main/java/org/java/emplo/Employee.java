package org.java.emplo;

import java.time.LocalDate;

public class Employee {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private String ruolo;

    public Employee(String nome, String cognome, LocalDate dataDiNascita, String ruolo) throws Exception {
        if (nome.isEmpty() || cognome.isEmpty()) {
            throw new IllegalArgumentException("Questi due campi, Nome e Cognome, non possono essere vuoti");
        }
        if (dataDiNascita.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La data di nascita deve essere nel passato");
        }
        if (!ruolo.equals("employee") && !ruolo.equals("boss")) {
            throw new IllegalArgumentException("Ruolo non valido");
        }

        setNome(cognome);
        setCognome(cognome);
        setDataDiNascita(dataDiNascita);
        setRuolo(ruolo);
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
}
