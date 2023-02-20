package com.example.interviewtasks;

public class Main {

    public static void main(String[] args) {
        String s = "abc";

        try {
            int a = s.length();
            int b = Integer.parseInt(s);
        } catch (NullPointerException | NumberFormatException exception) {
            System.out.println("Oops! Something`s wrong with the string");
        } finally {
            System.out.println("Task completed");
        }
    }
}
