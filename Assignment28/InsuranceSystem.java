import java.util.*;
import java.time.*;
class Policy implements Comparable<Policy>{
String policyNumber, policyholderName, coverageType;
LocalDate expiryDate;
double premiumAmount;
public Policy(String policyNumber,String policyholderName,LocalDate expiryDate,String coverageType,double premiumAmount){
this.policyNumber=policyNumber;
this.policyholderName=policyholderName;
this.expiryDate=expiryDate;
this.coverageType=coverageType;
this.premiumAmount=premiumAmount;
}
public int compareTo(Policy p){
return this.expiryDate.compareTo(p.expiryDate);
}
public boolean equals(Object o){
if(this==o)return true;
if(o==null||getClass()!=o.getClass())return false;
Policy policy=(Policy)o;
return policyNumber.equals(policy.policyNumber);
}
public int hashCode(){
return Objects.hash(policyNumber);
}
public String toString(){
return policyNumber+" | "+policyholderName+" | "+expiryDate+" | "+coverageType+" | "+premiumAmount;
}
}

public class InsuranceSystem{
public static void main(String[]args){
Set<Policy>hashSet=new HashSet<>();
Set<Policy>linkedHashSet=new LinkedHashSet<>();
Set<Policy>treeSet=new TreeSet<>();

addPolicy(hashSet,linkedHashSet,treeSet,new Policy("P123","Alice",LocalDate.of(2025,5,20),"Health",5000));
addPolicy(hashSet,linkedHashSet,treeSet,new Policy("P456","Bob",LocalDate.of(2024,3,15),"Auto",3000));
addPolicy(hashSet,linkedHashSet,treeSet,new Policy("P789","Charlie",LocalDate.of(2024,4,10),"Home",7000));
addPolicy(hashSet,linkedHashSet,treeSet,new Policy("P101","David",LocalDate.of(2024,2,25),"Health",4000));

System.out.println("All Unique Policies:");
display(hashSet);

System.out.println("Policies Expiring Soon:");
display(getExpiringSoon(treeSet));

System.out.println("Policies of Type 'Health':");
display(getPoliciesByCoverage(hashSet,"Health"));

System.out.println("Duplicate Policies:");
display(getDuplicatePolicies(hashSet));
}
static void addPolicy(Set<Policy>hs,Set<Policy>lhs,Set<Policy>ts,Policy p){
hs.add(p);
lhs.add(p);
ts.add(p);
}
static void display(Set<Policy>policies){
for(Policy p:policies)System.out.println(p);
System.out.println();
}
static Set<Policy>getExpiringSoon(Set<Policy>policies){
Set<Policy>expiring=new HashSet<>();
LocalDate now=LocalDate.now();
for(Policy p:policies)if(p.expiryDate.isBefore(now.plusDays(30)))expiring.add(p);
return expiring;
}
static Set<Policy>getPoliciesByCoverage(Set<Policy>policies,String coverageType){
Set<Policy>filtered=new HashSet<>();
for(Policy p:policies)if(p.coverageType.equalsIgnoreCase(coverageType))filtered.add(p);
return filtered;
}
static Set<Policy>getDuplicatePolicies(Set<Policy>policies){
Set<String>seen=new HashSet<>();
Set<Policy>duplicates=new HashSet<>();
for(Policy p:policies)if(!seen.add(p.policyNumber))duplicates.add(p);
return duplicates;
}
}
