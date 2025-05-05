// Demonstrates a for loop with complex arithmetic expressions
mint_bool sunny = true;
mint_bool weekend = false;
mint_bool goOut = (sunny and weekend);
sayln(goOut);                     // false

mint_int x = 10;
mint_int y = 20;
mint_int z = 30;

// Chained comparisons
mint_bool check = (x < y and y < z);
sayln(check);                     // true

// String equality
mint_string userInput = "yes";
mint_string expected = "yes";

mint_if (userInput == expected) {
    sayln("Input matches expected");
} mint_else {
    sayln("Input does not match");
}

// Inequality test
mint_if (x != z) {
    sayln("x is not equal to z");
}