// Demonstrates while loop along with break and continue statements
mint_int i = 0;

mint_while (i < 5) {
    i = i + 1;
    mint_if (i == 2) {
        mint_continue;
    }
    mint_if (i == 4) {
        mint_break;
    }
    say("value: ");
    sayln(i);
}
