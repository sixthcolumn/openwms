/**
* OpenWMS Site Javascripts
*/

$(function(){
    // Watch for images with play on hover
    $('img.playOnHover').each(function(){
	var img = $(this);
	
	img.hover(function(){
	    var src = $(this).attr('src');
	    console.log("HOVER img.src="+ src);
	    $(this).attr('src', src.replace('.png', '.gif'));
	}, function(){
	    var src = $(this).attr('src');
	    console.log("UNhover img.src="+ src);
	    $(this).attr('src', src.replace('.gif', '.png'));
	});

	console.log("img.playOnHover> ", (img[0]));
    });
});
