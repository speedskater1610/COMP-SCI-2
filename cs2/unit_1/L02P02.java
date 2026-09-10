/*
Write a program that displays the members of your family that live in your house.  Be sure to include any pets that you may have.  All output should be written in one output statement, but each family member should appear on their own line.
*/

public class L02P02 {
    public static void main(String[] args) {
        String[] family_members = {
            "Russel Einsla",  
            "Brian Einsla", 
            "Melinda Einsla", 
            "Grace Einsla", 
            "Robin (dog)"
        };
        
        for (String family_member : family_members) {
            System.out.println(family_member);
        }
    }
}
