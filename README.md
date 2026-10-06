Word counting and word length (734-739)

program734: Splits the string into words and prints the number of words.

program735: Prints the word count, then each word with its length (e.g., name:4).

program736: Finds the largest word using >, so if several words tie, the first one wins. Prints the word count, the word, and its length.

program737: Same as 736 but uses >=, so if several words tie, the last one wins.

program738: Finds the maximum length, then prints all words with that length. This is the complete answer to "largest word" when there are ties.

program739: Finds the largest word by comparing against a temp word, starting with the first word. It prints the word count, the largest word, and its length.

Case conversion (740-743)

program740: Cleans the string and converts it to lowercase.

program741: Lowercases the string, converts it to a char array, and prints each character on a separate line. This is a stepping stone for 742.

program742: Capitalizes the first letter of each word, except the very first one. For my name is amit it gives my Name Is Amit. It works by finding each space and subtracting 32 (the ASCII gap between lowercase and uppercase) from the next character.

program743: The complete version of 742. It also capitalizes the first character, so my NAme is AmIt becomes My Name Is Amit.

Reversing (744-748)

program744: Reverses the whole string using StringBuffer.reverse(). my name is amit becomes tima si eman ym.

program745: Reverses each word individually and prints each on its own line.

program746: Reverses each word but joins them without spaces, giving ymemansitima. It is an incomplete version of 747.

program747: Reverses each word and joins them with spaces, giving ym eman si tima.

program748: The same as 747, but the logic is moved into a WordReverse() method of a separate StringX class. This is the cleaner, object-oriented version.

Word frequency and replacement (749-751)

program749: Counts how many times the word name appears (for the sample input, 3).

program750: Counts how many times the word india appears. It is the same logic as 749 with a different word.

program751: Replaces every india with bharat by building a new string word by word. india is my country i live in india becomes bharat is my country i live in bharat.

Letter frequency (752-753)

program752: Counts how often each letter a to z appears, using a 26-element array where index 0 is a and index 25 is z (Arr[i] - 97). It prints only the counts, with no letter labels.

program753: The improved version of 752. It prints each letter with its count (e.g., a : 3).

Letter frequency (754-755)

program754: The improved version of 753. It also converts the input to lowercase first, so uppercase letters are counted. It 

prints only letters that actually appear (frequency > 0), e.g. a : 3, instead of all 26.

program755: Finds the most frequently occurring letter. It builds the same 26-element frequency array, then scans it for the 

highest count and prints the letter and count. It uses >, so if two letters tie, the alphabetically first one wins.

Anagram check using frequency arrays (756-760)

program756: A skeleton. CheckAnagram() simply returns true, so it always prints "Strings are anagram". It sets up the input and 

output structure for the later versions.

program757: The first working version. It cleans both strings (trim, collapse spaces, lowercase) and counts letters of each into 

two arrays, Frequency1 and Frequency2. If every count matches, the strings are anagrams. Non-letters such as spaces are ignored, 

so dormitory and dirty room correctly match.

program758: Same as 757 with an early length check (str1.length() != str2.length() returns false). The check runs before the 

cleanup, which causes a problem (see below).

program759: Same as 758, but the two counting loops are merged into one loop that fills both arrays together.

program760: Uses a single array instead of two. Letters from the first string add 1, and letters from the second subtract 1. If 

every entry ends at 0, the strings are anagrams. This is the most memory-efficient of the group.

Anagram check using sorting (761-763)

program761: A demo. It sorts the char array {'d','c','a','b'} with Arrays.sort() and prints abcd. It introduces the idea used in 

762 and 763: two anagrams give the same string when their letters are sorted.

program762: Checks the lengths, converts both strings to char arrays, sorts them, converts them back to strings, and compares 

with equals(). It returns true or false using an if/else.

program763: Same as 762, but returns str1.equals(str2) directly. This is the cleaner version.










