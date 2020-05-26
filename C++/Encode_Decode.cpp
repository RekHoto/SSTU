#include <stdio.h>
#include <stdlib.h>

void encode(FILE *f1, FILE *f2, FILE *res) {
    int bufferLength = 1;
    char buffer[bufferLength];
    char buffer1[bufferLength];
    char byte;
    char bits[8];
    int cnt = 0;
    int flag = 1;

    while (fread(buffer, sizeof(char), 1, f1)) {
        if (buffer[0] == '\n') {
            if (cnt % 8 == 0) {
                if (fread(buffer1, sizeof(char), 1, f2) == 1) {
                    byte = buffer1[0];
                    for (int i = 7; i >= 0; --i) {
                        bits[i] = (byte & (1 << i)) ? '1' : '0';
                    }
                } else {
                    flag = 0;
                    cnt++;
                    fputc('.', res);
                }
            }
            if (flag == 1) {
                if (bits[cnt % 8] == '1') {
                    fputc(' ', res);
                }
                cnt++;
            }
        }
        fputc(buffer[0], res);
    }
}

void decode(FILE *decode_res, FILE *res) {

    int bufferLength = 1;
    char buffer1[bufferLength];
    char prev;
    char bits[9];
    int x;
    int cnt = 0;

    while (prev != '.') {
        fread(buffer1, sizeof(char), 1, res);
        if (buffer1[0] == '\n') {
            if (prev == ' ') {
                bits[7 - cnt % 8] = '1';
            } else {
                bits[7 - cnt % 8] = '0';
            }
            cnt++;
            if ((cnt % 8 == 0) && (cnt > 0)) {
                x = strtol(bits, (char **)NULL, 2);
                fputc((char)x, decode_res);
            }
        } else {
            prev = buffer1[0];
        }
    }
}

int main() {
    FILE *f1, *f2, *res, *decode_res;
    f1 = fopen("f1.txt", "r");
    f2 = fopen("f2.txt", "r");
    res = fopen("res.txt", "w");
    decode_res = fopen("decode_res.txt", "w");

    if (f1 == NULL) {
        return 1;
    }
    encode(f1, f2, res);
    fclose(res);
    res = fopen("res.txt", "r");
    decode(decode_res, res);
    fclose(res);fclose(res);

    return 0;
}
