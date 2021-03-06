package com.yong.Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
    static ArrayList<Record> recordList = new ArrayList<>();
    static int studentCOUNT = 100;

    public static void main(String[] args){
        for(int i = 0; i < studentCOUNT; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.print(String.format("%d번째 학생의 이름을 입력하세요 : ", i + 1));
            String studentName = scanner.next();

            System.out.print("국어점수를 입력하세요 : ");
            int scoreKOR = scanner.nextInt();

            System.out.print("수학점수를 입력하세요 : ");
            int scoreMATH = scanner.nextInt();

            System.out.print("영어점수를 입력하세요 : ");
            int scoreENGLISH = scanner.nextInt();

            System.out.print("과학점수를 입력하세요 : ");
            int scoreSCIENCE = scanner.nextInt();

            Record student = new Record(studentName, scoreKOR, scoreMATH, scoreENGLISH, scoreSCIENCE);

            recordList.add(student);
        }

        System.out.println("______________________________________");
        System.out.println("|  성명  | 국어 | 수학 | 영어 | 과학 | 총점 |");
        for(Record recordData : recordList){
            System.out.printf("| %3s | %3d | %3d | %3d | %3d | %3d |\n", recordData.getStudentName(), recordData.getScoreKorean(), recordData.getScoreMath(), recordData.getScoreEnglish(), recordData.getScoreScience(), recordData.getScoreSum());
        }
        System.out.println("______________________________________");
    }
}