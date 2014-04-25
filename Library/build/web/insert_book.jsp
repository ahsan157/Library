<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Insert Book</title>
  <meta name="author" content="Jake Rocheleau">
  <link rel="stylesheet" type="text/css" media="all" href="jquery/styles.css">
  
</head>

<body>
	<div id="wrapper">
            <center><h2>Insert Book Details</h2></center>
		
		<div id="form-container">
			<form action="insert_book" method="post" enctype="multipart/form-data">
				
				
				<div class="row">
					<label >Book ID &rarr;</label>
					<input type="text" name="book_id" class="reg-input tiny" autocomplete="off" tabindex="1">
				</div>
                                
                                
                                <div class="row">
					<label>Book Name: &rarr;</label>
					<input type="text"  name="book_name" class="reg-input tiny" autocomplete="off" tabindex="2">
				</div>
				
				<div class="row">
					<label for="email">Writer Name:  &rarr;</label>
					<input type="text"name="writter_name" class="reg-input" autocomplete="off" tabindex="3">
				</div>
				
				<div class="row">
					<label>Upload Book: &rarr;</label>
                                        <input  type="file" name="file"  class="reg-input" autocomplete="off" tabindex="4">
				</div>
				
				
                            <center><input type="submit" value="Update" name="submit" id="submit" class="sub-btn" tabindex="11"></center>
			</form>
		</div>
	</div>

</body>
</html>



















