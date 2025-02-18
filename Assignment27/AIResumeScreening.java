import java.util.*;
class AIResumeScreening {
public static void processMultipleResumes(List<? extends JobRole> jobRoles) {
for (JobRole role : jobRoles) {
System.out.println("Screening candidate: " + role.getCandidateName());
role.displayRoleRequirements();
}
}
public static void main(String[] args) {
Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice", 5));
Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob", 3));
Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie", 7));
seResume.processResume();
dsResume.processResume();
pmResume.processResume();
List<JobRole> candidates = new ArrayList<>();
candidates.add(new SoftwareEngineer("David", 4));
candidates.add(new DataScientist("Eve", 6));
candidates.add(new ProductManager("Frank", 8));
processMultipleResumes(candidates);
}
}
abstract class JobRole {
private String candidateName;
private int experienceYears;
public JobRole(String candidateName, int experienceYears) {
this.candidateName = candidateName;
this.experienceYears = experienceYears;
}
public String getCandidateName() {
return candidateName;
}
public int getExperienceYears() {
return experienceYears;
}
public abstract void displayRoleRequirements();
}
class SoftwareEngineer extends JobRole {
public SoftwareEngineer(String candidateName, int experienceYears) {
super(candidateName, experienceYears);
}
public void displayRoleRequirements() {
System.out.println(getCandidateName() + " must have strong programming skills.");
}
}
class DataScientist extends JobRole {
public DataScientist(String candidateName, int experienceYears) {
super(candidateName, experienceYears);
}
public void displayRoleRequirements() {
System.out.println(getCandidateName() + " must be skilled in data analysis and machine learning.");
}
}
class ProductManager extends JobRole {
public ProductManager(String candidateName, int experienceYears) {
super(candidateName, experienceYears);
}
public void displayRoleRequirements() {
System.out.println(getCandidateName() + " must excel in leadership and strategic planning.");
}
}
class Resume<T extends JobRole> {
private T jobRole;
public Resume(T jobRole) {
this.jobRole = jobRole;
}
public void processResume() {
System.out.println("Processing resume for " + jobRole.getCandidateName());
jobRole.displayRoleRequirements();
}
}
