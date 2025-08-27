1.Java does not allow the comparision of a String with a Char. For Exmple: 'A' ,here these single quotes are Character literals and "A" here these double quotes are string literals

```
char upper = 'D';
char lower = (char) (upper + 32); // 'd'
System.out.println(lower);

char lowerChar = 'm';
char upperChar = (char) (lowerChar - 32); // 'M'
System.out.println(upperChar);
```
```
char ch = 'G';
if (ch >= 'A' && ch <= 'Z') {
    System.out.println("Uppercase");
} else if (ch >= 'a' && ch <= 'z') {
    System.out.println("Lowercase");
} else if (ch >= '0' && ch <= '9') {
    System.out.println("Digit");
}
```


In Java, you cannot compare strings using == or !=.

== compares references (memory addresses), not actual content.

To compare the contents of strings, you need .equals().