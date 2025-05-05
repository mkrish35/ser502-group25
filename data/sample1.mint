// Demonstrates arithmetic, logical expressions, if-else, and for loop constructs
mint_int x = 10;
mint_int y = 5;

// Simple arithmetic
sayln(x + y);          // 15
sayln(x - y);          // 5
sayln(x * y);          // 50
sayln(x / y);          // 2
sayln(x % y);          // 0

// Logical expressions
mint_bool a = true;
mint_bool b = false;

sayln(a);              // true
sayln(b);              // false
sayln(a and b);        // false
sayln(a or b);         // true
sayln(not a);          // false

// If-else block
mint_if (x > y) {
    sayln("x is greater than y");
} mint_else {
    sayln("x is not greater");
}

// For loop
mint_int i = 0;
mint_for (i = 0; i < 3; i = i + 1) {
    say("loop: ");
    sayln(i);          // 0, 1, 2
}