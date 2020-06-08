var func = [
// 1
function n1() {
    var a = true;
    if (typeof a === "undefined") {
        alert("undefined");
    } else if (typeof a === "boolean"){
        alert("boolean");
    } else if (typeof a === "number"){
        alert("number");
    } else if (typeof a === "string"){
        alert("string");
    } else if (typeof a === "bigint"){
        alert("bigint");
    } else if (typeof a === "symbol"){
        alert("symbol");
    } else if (typeof a === "function") {
        alert("function");
    } else {
        alert("object");
    }
},
// 2
function n2() {

    res.innerHTML = '';

    for (var i = 0; i < 41; i++) {
        console.log(i);
        var p = document.createElement('p');
        p.setAttribute("style", "display: inline;");
        p.innerHTML = i + ' ';
        res.appendChild(p);
    }

    i = 0;
    while (i < 41) {
        console.log(i);
        var p = document.createElement('p');
        p.setAttribute("style", "display: inline;");
        p.innerHTML = i + ' ';
        res.appendChild(p);
        i++;

    }
    i = 0
    do {
        console.log(i);
        var p = document.createElement('p');
        p.setAttribute("style", "display: inline;");
        p.innerHTML = i + ' ';
        res.appendChild(p);
        i++;
    } while (i < 41);
},
// 3
function n3() {

    var p = document.createElement('p');
    p.innerHTML = "текст";
    document.body.appendChild(p);
    setInterval(() => {  n3() }, 20);
},
// 4
function n4() {

    res.innerHTML = '';

    var arr = [];
    for (var i = 0; i < 3; i++) {
        arr[i] = prompt('Введите ' + (i + 1) + ' число');
    }

    for (var i = 0; i < arr.length; i++) {
        for (var j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j + 1]) {
                var swap = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = swap;
            }

        }
    }

    for (var i = 0; i < 3; i++) {
        console.log(arr[i]);
        var p = document.createElement('span');
        p.innerHTML = arr[i] + ' ';
        res.appendChild(p);
    }

},
// 5
function n5() {

    res.innerHTML = '';

    for (var i = 0; i < 16; i++) {
        var p = document.createElement('p')
        if (i % 2 == 1) {
            p.innerHTML = i + " - нечетное";
        } else {
            p.innerHTML = i + " - четное";
        }
        res.appendChild(p);
    }
},
// 6
function n6() {

    var a = prompt('Введите число >5');
    if (a > 5) {
        alert('congratz');
    } else if(a != null) {
        alert('Число < 5');
        n6();
    }
},
// 7
function n7() {

    res.innerHTML = '';

    for (var i = 8; i < 21; i+=2) {
        console.log(i);
        var p = document.createElement('p');
        p.innerHTML = i + ' ';
        res.appendChild(p);
    }
},
// 8
function n8() {

    res.innerHTML = '';

    var sum = 0;
    for (var i = 0; i < 1001; i++) {
        if ((i % 3 == 0) || (i % 5 == 0)) {
            sum += i;
        }
    }
    var p = document.createElement('p')
    p.innerHTML = sum;
    res.appendChild(p);
},
// 9
function n9() {

    var a = prompt('Введите число 99<x<1000');
    if ((a < 100) || (a > 999)) {
        alert('Число не соответствует требованиям');
        return;
    }
    var copyA = a;
    var armN = 0;
    while (copyA > 0) {
        armN += (copyA % 10) ** 3;
        console.log(copyA);
        copyA = ~~(copyA/10);
    }
    if (armN == a) {
        alert('Является числом Армстронга');
    } else {
        alert('Не является числом Армстронга');
    }
},
// 10
function n10() {

    res.innerHTML = '';

    var s = "*"
    for (var i = 0; i < 5; i++) {
        console.log(s);
        var p = document.createElement('p');
        p.innerHTML = s;
        res.appendChild(p);
        s += " *";
    }
}];

var d = document.createElement('div');
d.setAttribute("id", "buttons");
document.body.appendChild(d);

for (var i = 0; i < func.length; i++) {
    var btn = document.createElement('button');
    btn.innerHTML = 'Задание ' + (i + 1);
    if (i == 2) {
        var a = document.createElement('a');
        a.setAttribute("href", "./n3.html");
        btn.innerHTML = "Задание" + (i + 1);
        a.appendChild(btn);
        d.appendChild(a);
        continue;
    }
    btn.addEventListener('click', func[i]);
    d.appendChild(btn);
}

var res = document.createElement('div');
res.setAttribute("id", "result");
document.body.appendChild(res);
