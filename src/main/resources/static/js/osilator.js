var audioCtx = new (window.AudioContext || window.webkitAudioContext)();

// create Oscillator node
var oscillator = audioCtx.createOscillator();
var tone = 200;
oscillator.type = 'square';
oscillator.frequency.setValueAtTime(tone, audioCtx.currentTime); // value in hertz
oscillator.connect(audioCtx.destination);
oscillator.start(0);


document.getElementById('osc');