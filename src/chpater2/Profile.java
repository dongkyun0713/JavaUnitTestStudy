package chpater2;

import java.util.*;

public class Profile {
    private Map<String, Answer> answers = new HashMap<>();
    private int score;
    private String name;

    public String getName() {
        return name;
    }

    public Profile(String name) {
        this.name = name;
    }

    public void add(Answer answer) {
        answers.put(answer.getQuestionText(), answer);
    }

    public boolean matches
}
