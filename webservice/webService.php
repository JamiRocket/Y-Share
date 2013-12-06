<?php
	include("../BDD/PdoClass.php");

	$pdoc = new PdoClass();
	$method = $_ENV['REQUEST_METHOD'];
	$reqUri = $_ENV['REQUEST_URI'];
	
	print $method;

	switch($method)
	{
		case "GET":
			if($_GET['idPage'] == "profil")
			{
				echo $_GET['idProfil'];
				return json_encode($pdoc->recupInfoProfil($_GET['idProfil']));
			}
			break;

		case "PUT":
			echo "Gestion PUT";
			break;
			
		case "POST":
			echo "Gestion POST";
			break;

		case "DELETE":
			echo "Gestion DELETE";
			break;
	}
?>
