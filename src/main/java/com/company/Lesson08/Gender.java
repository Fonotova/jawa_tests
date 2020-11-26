package com.company.Lesson08;

public enum  Gender {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        if (this == MALE)
            return "мужчина";
        else
            return "женщина";

    }}
