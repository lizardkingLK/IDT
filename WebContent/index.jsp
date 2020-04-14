<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
	<link rel="stylesheet" href="./css/style.css">

	<!-- DropZone -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/5.7.0/dropzone-amd-module.js" integrity="sha256-AMRpKEj1J26PHZHs6p+Ds+BEluRn7wz2FfArNF5a138=" crossorigin="anonymous"></script>
	
	<style>
		input[type="file"] {
			background-color: black;
			display: inline-block;
			opacity: 3;
		}

		input[type="file"]:focus,
		input[type="file"]{
			background-color: #f2f2f2;
		}
	</style>
	
    <title>Home</title>
  </head>
  <body>
    
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	  </button>

	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<a class="navbar-brand" href="#">CDE IT Solutions</a>
		</ul>
		
		<div class="my-2 my-lg-0">
		  <ul class="navbar-nav mr-auto">
			  <li class="nav-item active">
				<a class="nav-link" href="#">Home</a>
			  </li>
			  <div>

			  </div>
			  <li class="nav-item">
			</ul>
		</div>
	  </div>
	</nav>
	
	<div class="container">
	<h1>Home</h1>
	
		<div class="card" style="height: 80vh;">
		  <div class="card-body">
			<form action="saveSourceCode" class="dropzone inputfile" id="my-awesome-dropzone" method="POST" enctype="multipart/form-data">
				<small class="card-title" style="position: absolute; top: 20%; left: 45%;">Drop code here</small>
				<input id="my-awesome-dropzone-file" type="file" name="sourcecode" class="btn btn-light" style="height: 30vh; width: 100%;" size="50" />
			
			<!-- WEIGHT MODALS (start) -->
			<!-- Button trigger modal -->
			<button type="button" class="btn btn-sm btn-outline-dark mt-2 float-right" data-toggle="modal" data-target="#staticBackdrop">
			  Customize Weight
			</button>
			<div class="clearfix"></div>
			
			<!-- Modal -->
			<div class="modal fade" id="staticBackdrop" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
			  <div class="modal-dialog" role="document">
				<div class="modal-content">
				  <div class="modal-header">
					<h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					  <span aria-hidden="true">&times;</span>
					</button>
				  </div>
				  <div class="modal-body">
					<table class="table">
					  <thead>
						<tr>
						  <th scope="col">#</th>
						  <th scope="col">First</th>
						  <th scope="col">Last</th>
						  <th scope="col">Handle</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <th scope="row">1</th>
						  <td>Mark</td>
						  <td>Otto</td>
						  <td>
							<select class="form-control form-control-sm">
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <th scope="row">2</th>
						  <td>Jacob</td>
						  <td>Thornton</td>
						  <td>
							<select class="form-control form-control-sm">
							  	<option selected>1</option>
								<option>2</option>
								<option>3</option>
							  </select>
						  </td>
						</tr>
						<tr>
						  <th scope="row">3</th>
						  <td>Larry</td>
						  <td>the Bird</td>
						  <td>@twitter</td>
						</tr>
					  </tbody>
					</table>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
					
					<table class="table">
					  <thead>
						<tr>
						  <th scope="col">#</th>
						  <th scope="col">First</th>
						  <th scope="col">Last</th>
						  <th scope="col">Handle</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <th scope="row">1</th>
						  <td>Mark</td>
						  <td>Otto</td>
						  <td>@mdo</td>
						</tr>
						<tr>
						  <th scope="row">2</th>
						  <td>Jacob</td>
						  <td>Thornton</td>
						  <td>@fat</td>
						</tr>
						<tr>
						  <th scope="row">3</th>
						  <td>Larry</td>
						  <td>the Bird</td>
						  <td>@twitter</td>
						</tr>
					  </tbody>
					</table>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
					
					<table class="table">
					  <thead>
						<tr>
						  <th scope="col">#</th>
						  <th scope="col">First</th>
						  <th scope="col">Last</th>
						  <th scope="col">Handle</th>
						</tr>
					  </thead>
					  <tbody>
						<tr>
						  <th scope="row">1</th>
						  <td>Mark</td>
						  <td>Otto</td>
						  <td>@mdo</td>
						</tr>
						<tr>
						  <th scope="row">2</th>
						  <td>Jacob</td>
						  <td>Thornton</td>
						  <td>@fat</td>
						</tr>
						<tr>
						  <th scope="row">3</th>
						  <td>Larry</td>
						  <td>the Bird</td>
						  <td>@twitter</td>
						</tr>
					  </tbody>
					</table>
				  </div>
				  <div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Understood</button>
				  </div>
				</div>
			  </div>
			</div>			
			<!-- WEIGHT MODALS (end) -->
			
			<div class="dropdown">
			  <select class="custom-select" id="languageSelect" style="width: 15vw;" required>
				<option selected value="0">Choose language</option>
				<option value="1">JAVA</option>
				<option value="2">C++</option>
				</select>
				
			</div>
			
				<input type="submit" id="uploadCodeBtn" class="btn btn-sm btn-outline-dark mt-2" style="display:inline-block; width:15vw;" value="Upload" />
		  
		  	</form>
		  </div>
		</div>
	</div>
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  
  	<!-- My script #1 -->
  	<script src="./js/checkUploadValidity.js"></script>
  </body>
</html>