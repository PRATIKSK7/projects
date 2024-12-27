import java.util.Arrays; 
public class StableMarriage { 
public static void stableMarriage(int[][] menPreferences, int[][] womenPreferences) { 
int n = menPreferences.length; 
int[] womenPartner = new int[n]; 
boolean[] freeMen = new boolean[n]; 
Arrays.fill(womenPartner, -1);  
int freeCount = n;  
while (freeCount > 0) { 
int man = -1; 
for (int i = 0; i < n; i++) { 
if (!freeMen[i]) { 
man = i; 
break; 
} 
} 
for (int i = 0; i < n && !freeMen[man]; i++) { 
int woman = menPreferences[man][i]; 
if (womenPartner[woman] == -1) { 
womenPartner[woman] = man; 

freeMen[man] = true; 
freeCount--; 
} else { 
int currentPartner = womenPartner[woman]; 
if (prefersNewPartner(woman, man, currentPartner, womenPreferences)) { 
womenPartner[woman] = man; 
freeMen[man] = true; 
freeMen[currentPartner] = false; 
} 
} 
} 
} 
System.out.println("Stable pairings:"); 
for (int woman = 0; woman < n; woman++) { 
System.out.println("Woman " + woman + " is paired with Man " + womenPartner[woman]); 
} 
} 
private static boolean prefersNewPartner(int woman, int newMan, int currentMan, int[][] 
womenPreferences) { 
for (int man : womenPreferences[woman]) { 
if (man == newMan) return true; 
if (man == currentMan) return false; 
} 
return false; 
} 
public static void main(String[] args) { 
int[][] menPreferences = { 
{0, 1, 2, 3}, 
{1, 0, 3, 2}, 

{2, 3, 0, 1}, 
{0, 3, 1, 2} 
}; 
int[][] womenPreferences = { 
{0, 1, 2, 3}, 
{1, 2, 3, 0}, 
{2, 3, 0, 1}, 
{3, 0, 1, 2} 
}; 
stableMarriage(menPreferences, womenPreferences); 
} 
}