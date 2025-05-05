// Demonstrates a combination of arithmetic and logical expressions in conditions
mint_string result = "";
mint_int i = 0;

mint_for (i = 0; i < 4; i = i + 1) {
    result = result + "Hi" + i + " ";
}

say("Final string: ");
sayln(result);
