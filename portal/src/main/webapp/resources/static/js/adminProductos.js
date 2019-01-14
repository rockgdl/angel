$(document).ready(function(){
	console.log("listo para el documento de productos");
//	 var $table = $('#tablaItems');
	
 var checkedRows = [];
 
 $("#tablaItems").on("click", function(e, row){
	console.log("click tabla "); 
	  var $item = $(this).closest("tr")   // Finds the closest row <tr> 
      .find("text-center")     // Gets a descendent with class="nr"
      .text();  
	  console.log($item);
	   checkedRows.push({id: row.id, nombre: row.Producto});
	   console.log(checkedRows);
 });

 $('#tablaItems').on('check.bs.table', function (e, row) {
	 console.log("sobre los check");
   checkedRows.push({id: row.id, nombre: row.Producto});
   
   $('a[id^="edit"]').click(function(){
	   $.each(checkedRows, function(index, value) {
	 //  console.log(value.id, value.nombre);
//		   $("#editventanaModal").modal();
		   $("#txtItemEdit").val(value.nombre.trim());
		   $("#idItemEdit").val(value.id.trim());
		   
	   });
	 });
   $('a[id^="delete"]').click(function(){
	   $.each(checkedRows, function(index, value) {
		   //  console.log(value.id, value.nombre);
		   $("#deleteventanaModal").modal();
		   $("#txtItemDelete").val(value.nombre.trim());
		   $("#idItemdelete").val(value.id.trim());
		   
	   });
   });
   
   
   
//   checkedRows.push({id: row.id, name: row.name, forks: row.forks});
   console.log(checkedRows);
 });

 $('#tablaItems').on('uncheck.bs.table', function (e, row) {
	 console.log("quitando los check");
   $.each(checkedRows, function(index, value) {
     if (value.id === row.id) {
       checkedRows.splice(index,1);
     }
   });
   console.log(checkedRows);
 });

 

// $("#edit1").click(function() {
//	 console.log("click boton");
//  // $("#output").empty();
//   $.each(checkedRows, function(index, value) {
//	   console.log(value.id, value.Nombre);
////     $('#output').append($('<li></li>').text(value.id + " | " + value.name + " | " + value.forks));
//   });
// });
 
 

 
 
});
	
