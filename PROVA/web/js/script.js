var elementos = [	{id: 0, descricao: 'Espresso'},
							{id: 1, descricao: 'Capuccino'},
							{id: 2, descricao: 'Mocca'},
							{id: 3, descricao: 'Café au lait'}]


function mostraID(){							
		/*Pega o elemento selecionado na combo e armazena em X*/
		var x =	document.getElementById("combo");
		/*Pega o indice do elemento*/
		var i = x.selectedIndex;
		/*Mostra um alerta com o ID do elemento selecionado*/
		window.alert(x.options[i].value);

}