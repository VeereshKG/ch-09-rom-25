package com.xworkz.institute.xworkz;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;

public interface Xworkz {

    int size();

    boolean addTrainee(Trainee trainee);


    void getAllTraineeInfo();

    Subject getSubjectNameByTraineeId(int traineeId);
    long getPhoneNumberByTraineeId(int traineeId);
    Subject getSubjectByTraineeName(String traineeName);

    int getNoOfClassesTakenByTraineeId(int traineeId);
    long getPhoneNumberByName(String traineeName);
    String getTraineeNameById(int traineeId);
    int getTraineeIdByName(String traineeName);
    int getNoOfClassesTakenByName(String traineeName);
    boolean updatePhoneNumberByTraineeId(int traineeId, long newPhoneNumber);
    boolean updateSubjectByTraineeId(int traineeId, Subject newSubject);
    boolean updateTraineeNameById(int traineeId, String newName);

    boolean updateNoOfClassesTakenByTraineeId(int traineeId, int newNoOfClasses);
    Trainee getTraineeDetailsbyId(int id);
    void fetchTraineeDetails(Trainee trainee);
}
