var table = document.querySelector('#value');
var table2 = document.querySelector('#result'); // Initialize array
var tds = table.querySelectorAll("td");
var tds2 = table2.querySelectorAll("td");
var elem = document.querySelector('#elem');
var gen = document.querySelector('#generate');
var calc = document.querySelector('#calculate');
gen.addEventListener('click', function(){ fillTable(table) })
calc.addEventListener('click', function(){ showProd() })
var ac = 0;
var ac2 = 0;


fillTable(table);
secondTable(table2);

function fillTable(table) {
    ac = 0;
    var arr = []; // Initialize array
    fillArray(arr);
    table.innerHTML = "";
    for (var i = 0; i < 3; i++) {
        var tr = document.createElement('tr');
        for (var j = 0; j < 3; j++) {
            var td=document.createElement('td');
            td.innerHTML = arr[3 * i + j];
            td.addEventListener('click', function() {
                ac = check(table, this, 2, ac, 'active');
            });
            tr.appendChild(td);
        }
        table.appendChild(tr);
    }
}

function testUnique(arr, x) {
    var n = arr.length;
    for (var i = 0; i < n; i++) {
            if (arr[i] == x) return false;
    }
    return true;
}

function fillArray(arr) {
    var flag = false;
    for (var i = 0 ; i < 9; i++) {
    while (flag != true) {
            var num = (Math.random() * 1000 | 0) / 100;
            flag = testUnique(arr, num);
        }
        arr[i] = num;
        flag = false;
    }
}

function check(t, el, n, ac, cl) {

    if (el.classList.contains(cl))  {
        if (ac == 2) {
            t.querySelector("td.act").classList.remove("act");
        }
        el.classList.remove(cl);
        ac--;
    } else if (ac < n) {
        el.classList.add(cl);
        ac++;
        if (ac == 2) {
            el.classList.add("act");
        }
    }
    return ac;
}

function secondTable(table) {
    for (var i = 0; i < 3; i++) {
        var tr = document.createElement('tr');
        for (var j = 0; j < 3; j++) {
            var td=document.createElement('td');
            td.addEventListener('click', function() {
                ac2 = check(table, this, 1, ac2, 'active1');
            });
            tr.appendChild(td);
        }
        table.appendChild(tr);
    }
}
function getActiveCells(table) {
    return table.querySelectorAll("td.active");
}

function getProdOfCells(cells) {
    var prod = 1;
    for (var i = 0; i < cells.length; i++) {
        prod *= Number(cells[i].innerHTML);
    }
    return prod;
}

function showProd() {
    var cells = getActiveCells(table);
    if (cells.length < 2) {
        alert("Select 2 cells");
        return;
    }
    var prod = getProdOfCells(cells).toFixed(2);
    var el = table2.querySelector("td.active1");

    if ((el == null) || (el.innerHTML != '')) {
        alert("Select empty cell");
        return;
    } else {
        el.innerHTML = prod;
    }
}
