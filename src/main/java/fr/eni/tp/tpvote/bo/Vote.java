package fr.eni.tp.tpvote.bo;

import java.time.LocalDate;


public class Vote {
    private int id;
    private String name;
    private LocalDate ddn;
    private Candidat candidatForVote;

    public Vote() {
    }

    public Vote(String name, LocalDate ddn, Candidat candidatForVote) {
        this.name = name;
        this.ddn = ddn;
        this.candidatForVote = candidatForVote;
    }

    public Vote(int id, String name, LocalDate ddn, Candidat candidatForVote) {
        this.id = id;
        this.name = name;
        this.ddn = ddn;
        this.candidatForVote = candidatForVote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    public void setDdn(LocalDate ddn) {
        this.ddn = ddn;
    }

    public Candidat getCandidatForVote() {
        return candidatForVote;
    }

    public void setCandidatForVote(Candidat candidatForVote) {
        this.candidatForVote = candidatForVote;
    }

//    @Override
//    public String toString() {
//        return candidatForVote.toString(); // renvoie la représentation en chaîne de l'enum
//    }
}
