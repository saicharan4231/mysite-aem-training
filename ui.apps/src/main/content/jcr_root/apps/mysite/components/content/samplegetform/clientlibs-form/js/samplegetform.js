$(document).ready(function () {
  $("#btn_submit").click(function () {
    // const urlpath =  this.resource.getPath()+".mysite.txt"
    $.ajax({
      url: "/content/mysite/us/en/test-2/jcr:content.mysite.txt",
      type: "GET",
      dataType: "text",
      success: function (response) {
        // var result=  JSON.stringify(response);
        //document.querySelector("#pagetitle").value = response;
        window.alert("Servlet called! \n  " + response);
      },
      error: function (xhr, status, error) {
        window.alert("Error");
        console.error("Error calling servlet:" + error);
      },
    });
  });
});
