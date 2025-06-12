/**
* Документация к коду. script.js - код, обуспечивающий взаимодействие webView, содержащего svg карту
* и методов из java. Он обрабатывает нажатия на карту, вызывает некоторые методы класса CurrentMapGame
*/

function flash(element, counter){   //функция для моргания правильного региона карты красным цветом, если ответ пользователя был неверным.
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


document.querySelectorAll('#regions path').forEach(function(path) {   //установка слушателя кликов всех регионов карты
    console.log(path.id);
    const array = ["BY-HM", "SJ", "LI", "JE", "IM", "GG", "FO", "AX", "MT", "MC", "SM", "GI", "VA"]
    let clicked = false;
    path.addEventListener('click', function(event) {
        if(!clicked && !array.includes(event.target.id)){
            var result = Android.check(event.target.id); //вызов проверки ответа пользователя
            if (result) {
                event.target.style.fill = '#337CD3'; // окрашиваем регион в синий, если ответ был верным
                clicked = true; // флаг, чтобы на регион больше нельзя было нажать
            } else {
                var currentRegion = Android.getCurrentRegion(); // получаем регион, на который на самом деле требовалось нажать, если ответ неверный
                var correctPath = document.getElementById(currentRegion);
                flash(correctPath, 3);
                correctPath.style.fill = '#da0019'
                correctPath.setAttribute('fill', '#ff0000');
                Android.showIncorrectToast(event.target.id); // вызываем метод для показа Toast с неправильным ответом
            }
            Android.nextGame();
        }
    }, );
});