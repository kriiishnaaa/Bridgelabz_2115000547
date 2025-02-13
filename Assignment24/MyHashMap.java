class MyHashMap {
private static class Entry {
Object key;
Object value;
Entry next;
Entry(Object key,Object value) {
this.key=key;
this.value=value;
this.next=null;
}
}
private static final int SIZE=16;
private Entry[] table;
public MyHashMap() {
table=new Entry[SIZE];
}
private int hash(Object key) {
return key.hashCode()%SIZE;
}
public void put(Object key,Object value) {
int index=hash(key);
Entry newEntry=new Entry(key,value);
if(table[index]==null) {
table[index]=newEntry;
return;
}
Entry current=table[index];
while(current.next!=null) {
if(current.key.equals(key)) {
current.value=value;
return;
}
current=current.next;
}
if(current.key.equals(key)) {
current.value=value;
return;
}
current.next=newEntry;
}
public Object get(Object key) {
int index=hash(key);
Entry current=table[index];
while(current!=null) {
if(current.key.equals(key)) return current.value;
current=current.next;
}
return null;
}
public void remove(Object key) {
int index=hash(key);
Entry current=table[index];
Entry prev=null;
while(current!=null) {
if(current.key.equals(key)) {
if(prev==null) table[index]=current.next;
else prev.next=current.next;
return;
}
prev=current;
current=current.next;
}
}
public static void main(String[] args) {
MyHashMap map=new MyHashMap();
map.put(1,"One");
map.put(2,"Two");
map.put(3,"Three");
System.out.println(map.get(2));
map.remove(2);
System.out.println(map.get(2));
}
}
