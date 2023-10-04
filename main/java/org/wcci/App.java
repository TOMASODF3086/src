package org.wcci;

public class App {
    public static void main(String[] args) {
        StringExercises exercises = new StringExercises();
        /*The line below creates a base string that can be inserted instead of typing everything*/
        String baseStr ="WeCanCodeIt";
        System.out.println("String Length" + exercises.length("WeCanCodeIt"));
        System.out.println("All upper case " +  exercises.toUpperCase("WeCanCodeIt"));
        System.out.println("All lower case " + exercises.toLowerCase("WeCanCodeIt"));
        System.out.println("index of "+ exercises.indexOf("WeCanCodeIt", "Code"));
        System.out.println("Trim all " + exercises.trimAllString("    WeCanCodeIt"));  
        System.out.println("Last Letter " + exercises.lastLetter(baseStr));
        System.out.println("First Letter " + exercises.firstLetter(baseStr));
        System.out.println("replace first  " + exercises.replaceFirst("aaccaa", "aa", "bb"));
        System.out.println("Contains Code? " + exercises.contains(baseStr, "Code"));
        System.out.println("Contains Can't? " + exercises.contains(baseStr, "Can't"));
        
    }
        
}



