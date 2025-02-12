public class RoundRobin{
public static void main(String[] args) {
CircularLinkedList cll = new CircularLinkedList();
cll.addProcess(1, 10, 1);
cll.addProcess(2, 5, 2);
cll.addProcess(3, 8, 3);
cll.roundRobin(4);
}
}
class Process {
int pid, burstTime, priority, remainingTime, waitingTime, turnaroundTime;
Process next;
Process(int pid, int burstTime, int priority) {
this.pid = pid;
this.burstTime = burstTime;
this.priority = priority;
this.remainingTime = burstTime;
this.waitingTime = 0;
this.turnaroundTime = 0;
this.next = null;
}
}
class CircularLinkedList {
Process head;
CircularLinkedList() {
head = null;
}
void addProcess(int pid, int burstTime, int priority) {
Process newProcess = new Process(pid, burstTime, priority);
if (head == null) {
head = newProcess;
newProcess.next = head;
} else {
Process temp = head;
while (temp.next != head) {
temp = temp.next;
}
temp.next = newProcess;
newProcess.next = head;
}
}
void removeProcess(int pid) {
if (head == null) return;
Process temp = head, prev = null;
while (true) {
if (temp.pid == pid) {
if (prev != null) {
prev.next = temp.next;
} else {
if (temp.next == head) head = null;
else {
Process last = head;
while (last.next != head) last = last.next;
head = temp.next;
last.next = head;
}
}
break;
}
prev = temp;
temp = temp.next;
if (temp == head) break;
}
}
void roundRobin(int timeQuantum) {
Process temp = head;
int totalWaitingTime = 0, totalTurnaroundTime = 0, totalProcesses = 0;
while (temp != null) {
totalProcesses++;
temp = temp.next;
if (temp == head) break;
}
temp = head;
while (totalProcesses > 0) {
if (temp.remainingTime > timeQuantum) {
temp.remainingTime -= timeQuantum;
totalWaitingTime += temp.waitingTime;
temp = temp.next;
} else {
temp.waitingTime = totalWaitingTime;
totalTurnaroundTime += temp.turnaroundTime;
removeProcess(temp.pid);
totalProcesses--;
temp = temp.next;
}
}
System.out.println("Average Waiting Time: " + (totalWaitingTime / totalProcesses));
System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / totalProcesses));
}
}
