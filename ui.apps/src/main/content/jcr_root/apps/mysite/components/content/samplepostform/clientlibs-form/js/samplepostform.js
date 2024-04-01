$(document).ready(function(){
  $('#postbtn_submit').click(function(){
      // Get the value of the input field
      var name = $('#name').val();
      
      var postData = {
          "name": name
      };
      
      // Make the AJAX POST request
      $.ajax({
          url: "/content/mysite/us/en/test-2/jcr:content.mysite.txt",
          type: 'POST',
          data: postData,
          dataType: "text",
          success: function(response) {
              console.log("Success:", response);
              alert("Name submitted successfully!");
          },
          error: function(xhr, status, error) {
              console.error('Error:', error);
              alert("Error submitting name. Please try again later.");
          }
      });
  }); 
});