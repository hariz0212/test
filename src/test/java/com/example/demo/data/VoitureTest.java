package com.example.demo.data;

import org.junit.jupiter.api.BeforeEach; // Correction de l'import
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*; // Pour les assertions comme assertEquals

@SpringBootTest
public class VoitureTest {

    private Voiture v; // On déclare la variable ici pour qu'elle soit accessible partout

    @BeforeEach // Majuscule ici
    void initCar(){
        // On initialise l'objet avant chaque test
        v = new Voiture("peugeot", 2500);
    }

    @Test
    void creerVoiture(){
        // On vérifie que l'objet a bien été créé avec les bonnes valeurs
        assertNotNull(v, "La voiture ne devrait pas être nulle");
        assertEquals("peugeot", v.getMarque());
        assertEquals(2500, v.getPrix());
    }

    @Test
    void getId() {
        assertNotNull(v.getId());
        assertEquals(v.getId(),0);
    }

    @Test
    void setId() {
        v.setId(1);
        assertNotNull(v.getId());
        assertEquals(v.getId(),1);
    }

    @Test
    void getMarque() {

        assertEquals(v.getMarque(),"peugeot");
    }

    @Test
    void setMarque() {
        v.setMarque("bmw");
        assertEquals(v.getMarque(),"bmw");
    }

    @Test
    void getPrix() {
        assertEquals(v.getPrix(),2500);
    }

    @Test
    void setPrix() {
        v.setPrix(2000);
        assertEquals(v.getPrix(),2000);
    }

    @Test
    void testToString() {
        assertEquals(v.toString(),"Car{" +
                "marque='peugeot'" +
                ", prix=2500"+
                ", id=0"+
                "}");
    }
}