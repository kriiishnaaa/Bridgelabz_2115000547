import java.util.*;
public class CircularBuffer {
public static void main(String[] args) {
CircularBuffer cb = new CircularBuffer(5);
cb.enqueue(10);
cb.enqueue(20);
cb.enqueue(30);
cb.enqueue(40);
cb.enqueue(50);
cb.display();
cb.enqueue(60);
cb.display();
cb.dequeue();
cb.display();
}
private int[] buffer;
private int front, rear, size, capacity;
public CircularBuffer(int capacity) {
this.capacity = capacity;
this.buffer = new int[capacity];
this.front = 0;
this.rear = 0;
this.size = 0;
}
public void enqueue(int value) {
buffer[rear] = value;
rear = (rear + 1) % capacity;
if (size < capacity) {
size++;
} else {
front = (front + 1) % capacity;
}
}
public int dequeue() {
if (size == 0) throw new IllegalStateException("Buffer is empty");
int value = buffer[front];
front = (front + 1) % capacity;
size--;
return value;
}
public void display() {
System.out.print("Buffer: ");
for (int i = 0; i < size; i++) {
System.out.print(buffer[(front + i) % capacity] + " ");
}
System.out.println();
}
}
