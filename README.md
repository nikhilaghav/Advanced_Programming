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








