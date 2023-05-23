package org.java.emplotest;

import org.java.emplo.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class EmployeeTest {
    
    @Test
    public void testValidEmployee() throws Exception {
        String nome = "Antonio";
        String cognome = "Novelli";
        LocalDate dataDiNascita = LocalDate.of(1990, 5, 10);
        String ruolo = "employee";
        
        Employee employee = new Employee(nome, cognome, dataDiNascita, ruolo);
        
        assertEquals(nome, employee.getNome());
        assertEquals(cognome, employee.getCognome());
        assertEquals(dataDiNascita, employee.getDataDiNascita());
        assertEquals(ruolo, employee.getRuolo());
    }
    
    @Test
    public void testEmptyNome() {
        String nome = "";
        String cognome = "Martinez";
        LocalDate dataDiNascita = LocalDate.of(1985, 3, 15);
        String ruolo = "employee";
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(nome, cognome, dataDiNascita, ruolo);
        });
    }
    
    @Test
    public void testEmptyCognome() {
        String nome = "Gigi";
        String cognome = "";
        LocalDate dataDiNascita = LocalDate.of(1992, 8, 20);
        String ruolo = "boss";
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(nome, cognome, dataDiNascita, ruolo);
        });
    }
    
    @Test
    public void testDataDiNascitaFutura() {
        String nome = "Romelu";
        String cognome = "Lukaku";
        LocalDate dataDiNascita = LocalDate.now().plusYears(1);
        String ruolo = "employee";
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(nome, cognome, dataDiNascita, ruolo);
        });
    }
    
    @Test
    public void testInvalidRuolo() {
        String nome = "Mark";
        String cognome = "Lenders";
        LocalDate dataDiNascita = LocalDate.of(1988, 10, 5);
        String ruolo = "Capo supremo";
        
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(nome, cognome, dataDiNascita, ruolo);
        });
    }
}
