var clsStopwatch = function() {

    var startAt = 0;
    this.timer;

    this.update = function() {
        $time.innerHTML = formatTime(x.time());
    };

    this.toggle = function() {
        if (!this.timer) {
            this.timer = setInterval(this.update, 1000);
        } else {
            clearInterval(this.timer);
            this.timer = null;
        }
    };

    this.reset = function() {
        startAt = 0;
        var h = prompt("Часы:");
        var m = prompt("Минуты:");
        var s = prompt("Секунды:");
        h = h * 60 * 60; m = m * 60; s *= 1; s += 1;
        startAt = h + m + s;
    };

    this.time = function() {
        return startAt ? startAt -= 1 : 0;
    };
};

var x = new clsStopwatch();
var $time = document.getElementById('time');


function pad(num, size) {
    var s = "0000" + num;
    return s.substr(s.length - size);
}

function formatTime(time) {
    var h = m = s = 0;
    var newTime = '';

    h = Math.floor( time / (60 * 60) );
    time = time % (60 * 60);
    m = Math.floor( time / 60 );
    time = time % 60;
    s = Math.floor( time );

    newTime = pad(h, 2) + ':' + pad(m, 2) + ':' + pad(s, 2);
    console.log(newTime);
    return newTime;
}

x.update();

function toggle() {
    x.toggle();
}

function reset() {
    if (x.timer) {
        x.toggle();
    }
    x.reset();
    x.update();
}

