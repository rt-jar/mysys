var tabArray=[""];

/*Add tab function
 * content : which you want to show
 * functionName:pass function whicj you want to execute
 * */
$.fn.addTab= function(name,content,functionName){
	 var nextTab = $('#tabs li').length+1;

	    // create the tab
	    $('<li><a class="nav-link" href="#'+name+nextTab+'" data-toggle="tab"><button class="close closeTab" type="button" >�</button> '+name+'</a></li>').appendTo('#tabs');

	    // create the tab content
	    $('<div class="tab-pane" id="'+name+nextTab+'">test</div>').appendTo('.tab-content');
	    $("#"+name+nextTab).load(content);

	    // make the new tab active
	    $('#tabs a:last').tab('show');
	    
	    functionName();
	    registerCloseEvent();
		
	};
	
	//this method will register event on close icon on the tab..
	function registerCloseEvent() {	
		$(".closeTab").click(function () {
	
		    //there are multiple elements which has .closeTab icon so close the tab whose close icon is clicked
		    var tabContentId = $(this).parent().attr("href");
		    $(this).parent().parent().remove(); //remove li of tab
		    $('#myTab a:last').tab('show'); // Select first tab
		    $(tabContentId).remove(); //remove respective tab content
	
		});
	}
	
	// call close Tab event for default tab 
	registerCloseEvent();
$("#navSideBar a").click(function(e){
	
	var name=$(this).attr("name");
	var url="homePage";
	
	if(name == 'addRole'){
		url="/admin/addRole";
	}else if( name == 'addUser'){
		url="/admin/addUser";
	}
	
	function fun1(){
		
	};
	
	$(this).addTab(name,url,fun1);
	
	
}
);
	
	

