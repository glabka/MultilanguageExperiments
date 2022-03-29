let my_url = 'http://localhost:1234/myapp/javaserver';
$.get(my_url, function(data) {
$('#header').text(data);
});
