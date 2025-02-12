public class TextEditor{
public static void main(String[] args) {
Editor editor = new Editor(10);
editor.type("Hello");
editor.type("World");
editor.display();
editor.undo();
editor.display();
editor.redo();
editor.display();
}
}
class TextState {
String content;
TextState prev, next;
TextState(String content) {
this.content = content;
this.prev = null;
this.next = null;
}
}
class Editor {
private TextState head, tail, current;
private int historyLimit;
private int size;
Editor(int historyLimit) {
this.historyLimit = historyLimit;
this.size = 0;
this.head = this.tail = this.current = null;
}
void type(String newContent) {
TextState newState = new TextState(newContent);
if (size == historyLimit) {
head = head.next;
head.prev = null;
size--;
}
if (current != null) {
current.next = newState;
newState.prev = current;
current = newState;
} else {
head = tail = current = newState;
}
size++;
}
void undo() {
if (current != null && current.prev != null) {
current = current.prev;
}
}
void redo() {
if (current != null && current.next != null) {
current = current.next;
}
}
void display() {
if (current != null) {
System.out.println(current.content);
} else {
System.out.println("No content.");
}
}
}
