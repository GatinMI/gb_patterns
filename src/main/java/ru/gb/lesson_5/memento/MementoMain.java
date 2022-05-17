package ru.gb.lesson_5.memento;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class MementoMain {

    public static void main(String[] args) {

        Map<LocalDateTime, BranchSnapshot> commits = new HashMap<>();

        Branch branch = new Branch();
        branch.setCode("helloWorld()");
        BranchSnapshot commit = branch.commit();
        LocalDateTime neededCommit = commit.getUpdated();
        commits.put(commit.getUpdated(), commit);

        branch.setCode("throw new Something()");
        commit = branch.commit();
        commits.put(commit.getUpdated(), commit);


        System.out.println(branch.getCode());
        branch.reset(commits.get(neededCommit));

        System.out.println(branch.getCode());
    }
}
