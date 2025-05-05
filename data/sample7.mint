// Demonstrates usage of string concatenation using the '+' operator
mint_int i = 1;

// Loop with step of 2
mint_for (i = 1; i <= 5; i = i + 2) {
    say("i = ");
    sayln(i);
    
    // Inline ternary expression
    mint_string parity = (i % 2 == 0) ? "even" : "odd";
    sayln("Number is " + parity);
}

// Post-loop use of i
say("Final i: ");
sayln(i);           // 7