  public class Driver{
        private String name;
        private String surname;
        private byte age;
        private byte yearsOfExperience;
        private String drivingLicenseType;
        private String workHistory;

    public Driver(String name, String surname, byte age, byte yearsOfExperience, String drivingLicenseType, String workHistory){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.yearsOfExperience = yearsOfExperience;
            this.drivingLicenseType = drivingLicenseType;
            this.workHistory = workHistory;

    }

    public String getName(){
            return this.name;
    }

    public String getSurname(){
            return this.surname;
    }

    public byte getYearsOfExperience(){
            return (byte)this.yearsOfExperience;
    }

    public String getDrivingLicenseType(){
            return this.drivingLicenseType;
    }

    public String getWorkHistory(){
            return this.workHistory;
    }

    public byte getAge(){
            return (byte)this.age;
    }

}