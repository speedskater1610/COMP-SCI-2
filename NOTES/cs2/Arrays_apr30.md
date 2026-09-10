# Arrays

You are wiriting in pen not pencil, so you can not change the size of this array. 
Although you can change the items out, but you cannot change the size after it has been created.

This is the most basic data  structure in most programming languages.

An **Array** is a ordered list of values, of a single type.
The list is ordered starting at **index 0**. 

---

## Array creation

When creating an array we have 2 options, using literal data, or we can *construct* the array based of off size and then put the items in.

#### Literal syntax
```java
String stuff[];
//  or
String[] stuff = { "taxes", "bills", "gambling", "death" };
```

####  Object syntax
```java
String[] things = new String[3]; // {null, null, null}
things[0] = "books"; // {"books", null, null}
```

## Array properties / facts
- Arrays, can store **1** type of data.
- Arrays can not be resized.
- Arrays are indexed starting with index 0.
- The `.length` property holds the number if items in the array.

---

### **Examples**: User created list.
```java
System.out.print("how many items");
int size = reader.nextInt();

reader.nextLine(); // dummy read
String[] list = new String[size];

for (var i = 0; i < list.length; i++) {
    System.out.print("Enter item: ");
    list[i] = reader.nextLine();
}
```
