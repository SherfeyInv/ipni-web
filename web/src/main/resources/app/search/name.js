
define(function(require) {
  var Handlebars = require('handlebars');
  var nameTmpl = require('./tmpl/name.hbs');

  var setName = function(url) {
    $.getJSON(API_BASE  + url + "?callback=?", function(json) {
      $('#c-page-body').replaceWith(nameTmpl(json));
    });
    $(".container").addClass("name-page")
  }

  return {
    setName : setName
  }
});
