import java.util.*;
public class SocialMediaConnections{
public static void main(String[] args) {
SocialMedia sm = new SocialMedia();
sm.addUser(1, "Alice", 25);
sm.addUser(2, "Bob", 30);
sm.addUser(3, "Charlie", 22);
sm.addFriend(1, 2);
sm.addFriend(1, 3);
sm.displayFriends(1);
sm.findMutualFriends(1, 2);
sm.removeFriend(1, 2);
sm.displayFriends(1);
System.out.println("Bob's friends count: " + sm.countFriends(2));
}
}
class User {
int userId;
String name;
int age;
FriendNode friendsList;
User next;
User(int userId, String name, int age) {
this.userId = userId;
this.name = name;
this.age = age;
this.friendsList = null;
this.next = null;
}
}
class FriendNode {
int friendId;
FriendNode next;
FriendNode(int friendId) {
this.friendId = friendId;
this.next = null;
}
}
class SocialMedia {
User head;
SocialMedia() {
head = null;
}
void addUser(int userId, String name, int age) {
User newUser = new User(userId, name, age);
if (head == null) {
head = newUser;
} else {
User temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newUser;
}
}
void addFriend(int userId1, int userId2) {
User user1 = findUserById(userId1);
User user2 = findUserById(userId2);
if (user1 != null && user2 != null) {
FriendNode friend1 = new FriendNode(userId2);
friend1.next = user1.friendsList;
user1.friendsList = friend1;
FriendNode friend2 = new FriendNode(userId1);
friend2.next = user2.friendsList;
user2.friendsList = friend2;
}
}
void removeFriend(int userId1, int userId2) {
User user1 = findUserById(userId1);
User user2 = findUserById(userId2);
if (user1 != null && user2 != null) {
removeFriendFromList(user1, userId2);
removeFriendFromList(user2, userId1);
}
}
void removeFriendFromList(User user, int friendId) {
FriendNode temp = user.friendsList, prev = null;
while (temp != null && temp.friendId != friendId) {
prev = temp;
temp = temp.next;
}
if (temp != null) {
if (prev != null) {
prev.next = temp.next;
} else {
user.friendsList = temp.next;
}
}
}
User findUserById(int userId) {
User temp = head;
while (temp != null) {
if (temp.userId == userId) return temp;
temp = temp.next;
}
return null;
}
User findUserByName(String name) {
User temp = head;
while (temp != null) {
if (temp.name.equals(name)) return temp;
temp = temp.next;
}
return null;
}
void displayFriends(int userId) {
User user = findUserById(userId);
if (user != null) {
FriendNode temp = user.friendsList;
while (temp != null) {
System.out.print(temp.friendId + " ");
temp = temp.next;
}
System.out.println();
}
}
void findMutualFriends(int userId1, int userId2) {
User user1 = findUserById(userId1);
User user2 = findUserById(userId2);
if (user1 != null && user2 != null) {
Set<Integer> friends1 = new HashSet<>();
FriendNode temp = user1.friendsList;
while (temp != null) {
friends1.add(temp.friendId);
temp = temp.next;
}
temp = user2.friendsList;
while (temp != null) {
if (friends1.contains(temp.friendId)) {
System.out.print(temp.friendId + " ");
}
temp = temp.next;
}
System.out.println();
}
}
int countFriends(int userId) {
User user = findUserById(userId);
int count = 0;
if (user != null) {
FriendNode temp = user.friendsList;
while (temp != null) {
count++;
temp = temp.next;
}
}
return count;
}
}
