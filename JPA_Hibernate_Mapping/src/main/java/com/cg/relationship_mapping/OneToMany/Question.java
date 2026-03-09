package com.cg.relationship_mapping.OneToMany;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;

    private String questionName;
    private String level;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answer;


    public Question() {}

    public Question(String questionName, String level) {
        super();
        this.questionName = questionName;
        this.level = level;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}
