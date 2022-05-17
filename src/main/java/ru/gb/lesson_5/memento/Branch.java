package ru.gb.lesson_5.memento;

import java.time.LocalDateTime;


public class Branch {
   private String code;
   private LocalDateTime lastUpdated;

   public String getCode() {
        return code;
   }

    public void setCode(String code) {
        this.code = code;
        lastUpdated = LocalDateTime.now();
    }

    public BranchSnapshot commit() {
        return new BranchSnapshot(code, lastUpdated);
    }

    public void reset(BranchSnapshot snapshot) {
        this.code = snapshot.getCode();
        this.lastUpdated = snapshot.getUpdated();
    }
}
