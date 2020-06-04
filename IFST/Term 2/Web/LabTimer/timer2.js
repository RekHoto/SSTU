var timerCls = {

    startAt: 0,
    timer: null,

    update: function() {
        $time.innerHTML = formatTime(timerCls.time());
    },

    toggle: function() {
        if (!this.timer) {
            this.timer = setInterval(this.update, 1000);
        } else {
            clearInterval(this.timer);
            this.timer = null;
        }
    },

    reset: function() {
        this.startAt = 0;
        var h = prompt("Часы:");
        var m = prompt("Минуты:");
        var s = prompt("Секунды:");
        h = h * 60 * 60; m = m * 60; s *= 1; s += 1;
        this.startAt = h + m + s;
    },

    time: function() {
        return this.startAt ? this.startAt -= 1 : 0;
    }
};

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

timerCls.update();

function toggle() {
    timerCls.toggle();
}

function reset() {
    if (timerCls.timer) {
        timerCls.toggle();
    }
    timerCls.reset();
    timerCls.update();
}

