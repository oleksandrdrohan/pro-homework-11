$(document).ready(function() {
    $.getJSON('/rate', function(data) {
        $('#rate').text(data.rates.UAH);
        $('#rate1').text(data.rates.USD);
        $('#date').text(data.date);
    });
});