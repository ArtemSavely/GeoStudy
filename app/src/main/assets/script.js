function flash(element, counter){
    if (counter <= 0) return;
    element.style.fill = ''
    element.setAttribute('fill', '');
    setTimeout(() => {
        element.style.fill = '#da0019'
        element.setAttribute('fill', '#da0019');
            setTimeout(() => {
                flash(element, counter - 1);
            }, 500);
    }, 500);
}


document.querySelectorAll('#regions path').forEach(function(path) {
    console.log(path.id);
    const array = ["BY-HM", "SJ", "LI", "JE", "IM", "GG", "FO", "AX", "MT", "MC", "SM", "GI", "VA"]
    let clicked = false;
    path.addEventListener('click', function(event) {
        if(!clicked && !array.includes(event.target.id)){
            var result = Android.check(event.target.id);
            if (result) {
                event.target.style.fill = '#337CD3';
                clicked = true;
            } else {
                var currentRegion = Android.getCurrentRegion();
                console.log(currentRegion)
                var correctPath = document.getElementById(currentRegion);
                flash(correctPath, 3);
                correctPath.style.fill = '#da0019'
                correctPath.setAttribute('fill', '#ff0000');
                Android.showIncorrectToast(event.target.id);
            }
            Android.nextGame();

        }

//        event.target.style.fill = '#ac60f2';
//        event.target.setAttribute('fill', '#ac60f2');
//        console.log(event.target.getAttribute('fill'));
    }, );
});