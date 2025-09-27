package com.xworkz.institute.xworkz;


import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.exception.*;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.validator.TraineeValidator;

public class XworkzImpl implements Xworkz {

    public XworkzImpl(int size) {
        trainees = new Trainee[size];
    }

    TraineeValidator validator = new TraineeValidator();
    public Trainee[] trainees;
    int index;

    @Override
    public boolean addTrainee(Trainee trainee) {
        boolean isTraineeAdded = false;
        try {
                if (validator.isTrainneInfoValidated(trainee)) {
                    trainees[index++] = trainee;
                    isTraineeAdded = true;
                }
            else System.out.println("invalid trainee");
            if (isTraineeAdded == false) {
                TraineeNotAddedException traineeNotAddedException = new TraineeNotAddedException("Trainee not added");
                throw traineeNotAddedException;
            }
        } catch (TraineeNotAddedException e) {
            e.printStackTrace();
        }
        return isTraineeAdded;
    }

    @Override
    public void getAllTraineeInfo() {
        System.out.println("the trainee details are :");
        for (Trainee trainee : trainees) {
            System.out.println("the id of the trainee is  " + trainee.getId());
            System.out.println("the name of the trainee is  " + trainee.getName());
            System.out.println("the class taken of the trainee is  " + trainee.getNoOfClassesTaken());
            System.out.println("the phone no of the trainee is  " + trainee.getPhoneNumber());
            System.out.println("the subject of the trainee is  " + trainee.getSubject());
            System.out.println("----------------------------------------------");

        }
    }

    @Override
    public Subject getSubjectNameByTraineeId(int traineeId) {
        Subject sub = null;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        sub = trainee.getSubject();
                    }
                }
            } else System.out.println("enter valid ID");
            if (sub == null) {
                SubjectNotFoundException subjectNotFoundException = new SubjectNotFoundException("Subject not found");
                throw subjectNotFoundException;
            }
        } catch (SubjectNotFoundException e) {
            e.printStackTrace();
        }
        return sub;
    }

    @Override
    public Subject getSubjectByTraineeName(String traineeName) {
        Subject sub = null;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        sub = trainee.getSubject();
                    }
                }
            } else System.out.println("enter valid name");
            if (sub == null) {
                SubjectNotFoundException subjectNotFoundException = new SubjectNotFoundException("Subject not found");
                throw subjectNotFoundException;
            }
        } catch (SubjectNotFoundException e) {
            e.printStackTrace();
        }
        return sub;
    }

    @Override
    public long getPhoneNumberByTraineeId(int traineeId) {
        long phone = 0;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        phone = trainee.getPhoneNumber();
                    }
                }
            } else System.out.println("enter valid ID");
            if (phone == 0) {
                PhNoNotFoundException phNoNotFoundException = new PhNoNotFoundException("phone number not found");
                throw phNoNotFoundException;

            }
        } catch (PhNoNotFoundException e) {
            e.printStackTrace();
        }
        return phone;
    }

    @Override
    public long getPhoneNumberByName(String traineeName) {
        long phone = 0;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        phone = trainee.getPhoneNumber();
                    }
                }
            } else System.out.println("enter valid name");
            if (phone == 0) {
                PhNoNotFoundException phNoNotFoundException = new PhNoNotFoundException("phone number not found");
                throw phNoNotFoundException;

            }
        } catch (PhNoNotFoundException e) {
            e.printStackTrace();
        }
        return phone;
    }

    @Override
    public int getNoOfClassesTakenByTraineeId(int traineeId) {

        int classes = 0;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        classes = trainee.getNoOfClassesTaken();
                    }
                }
            } else System.out.println("enter valid ID");
            if (classes == 0) {
                NoOfClassesNotFoundException noOfClassesNotFoundException = new NoOfClassesNotFoundException("no of classes detailsnot found");
                throw noOfClassesNotFoundException;

            }
        } catch (NoOfClassesNotFoundException e) {
            e.printStackTrace();
        }
        return classes;
    }

    @Override
    public int getNoOfClassesTakenByName(String traineeName) {
        int classes = 0;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        classes = trainee.getNoOfClassesTaken();
                    }
                }
            } else System.out.println("enter valid name");
            if (classes == 0) {
                NoOfClassesNotFoundException noOfClassesNotFoundException = new NoOfClassesNotFoundException("no of classes detailsnot found");
                throw noOfClassesNotFoundException;

            }
        } catch (NoOfClassesNotFoundException e) {
            e.printStackTrace();
        }
        return classes;
    }

    @Override
    public int getTraineeIdByName(String traineeName) {
        int id = 0;
        try {
            if (traineeName != null) {
                for (Trainee trainee : trainees) {
                    if (trainee.getName().equals(traineeName)) {
                        id = trainee.getId();
                    }
                }
            } else System.out.println("enter valid name");
            if (id == 0) {
                IdNotFoundException idNotFoundException = new IdNotFoundException("id not found");
                throw idNotFoundException;
            }
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getTraineeNameById(int traineeId) {
        String name = null;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        name = trainee.getName();
                    }
                }
            } else System.out.println("enter valid ID");
            if (name == null) {
                TraineeNameNotFoundException traineeNameNotFoundException = new TraineeNameNotFoundException("name not found");
                throw traineeNameNotFoundException;
            }
        } catch (TraineeNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public boolean updateTraineeNameById(int traineeId, String newName) {
        boolean isUpdated = false;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setName(newName);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateTraineeNameNotDoneException updateTraineeNameNotDoneException = new UpdateTraineeNameNotDoneException("Trainee name not updated");
                throw updateTraineeNameNotDoneException;
            }
        } catch (UpdateTraineeNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateSubjectByTraineeId(int traineeId, Subject newSubject) {
        boolean isUpdated = false;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setSubject(newSubject);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateSubjectNotDoneException updateSubjectNotDoneException = new UpdateSubjectNotDoneException("Subject not updated");
                throw updateSubjectNotDoneException;
            }
        } catch (UpdateSubjectNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePhoneNumberByTraineeId(int traineeId, long newPhoneNumber) {
        boolean isUpdated = false;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setPhoneNumber(newPhoneNumber);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdatePhNoNotDoneException updatePhNoNotDoneException = new UpdatePhNoNotDoneException("ph no not updated");
                throw updatePhNoNotDoneException;
            }
        } catch (UpdatePhNoNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateNoOfClassesTakenByTraineeId(int traineeId, int newNoOfClasses) {
        boolean isUpdated = false;
        try {
            if (traineeId != 0) {
                for (Trainee trainee : trainees) {
                    if (trainee.getId() == traineeId) {
                        trainee.setNoOfClassesTaken(newNoOfClasses);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateNoOfClassesNotDoneException updateNoOfClassesNotDoneException = new UpdateNoOfClassesNotDoneException("noof classes not updated");
                throw updateNoOfClassesNotDoneException;
            }
        } catch (UpdateNoOfClassesNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public Trainee getTraineeDetailsbyId(int id) {
        Trainee trainee = null;
        try {
            if (id != 0) {
                for (Trainee trainee1 : trainees) {
                    if (trainee1.getId() == id) {
                        trainee = trainee1;
                    }
                }
            } else if (trainee == null) {
                TraineeDetailsNotFoundException traineeDetailsNotFoundException = new TraineeDetailsNotFoundException("Trainee details not found");
                throw traineeDetailsNotFoundException;
            }
        } catch (TraineeDetailsNotFoundException e) {
            e.printStackTrace();
        }
        return trainee;
    }

    @Override
    public void fetchTraineeDetails(Trainee trainee) {
        try {
            System.out.println("the id of the trainee is  " + trainee.getId());
            System.out.println("the name of the trainee is  " + trainee.getName());
            System.out.println("the class taken of the trainee is  " + trainee.getNoOfClassesTaken());
            System.out.println("the phone no of the trainee is  " + trainee.getPhoneNumber());
            System.out.println("the subject of the trainee is  " + trainee.getSubject());
            System.out.println("----------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int size() {
        return trainees.length;
    }
}