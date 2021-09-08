Algoritmo Calculo_Bandido
	Definir pagoMinimoAnterior, interesAcumulado, multaPorPagoMenorAlMinimo Como Real
	Definir saldoActual, pagoMinimoActual, pagoParaNoGenerarIntereses Como Real
	Escribir "Introduzca el valor del saldo anterior del cliente: "
	Leer saldoAnterior
	Escribir "Introduzca el monto total de las compras que realizó: "
	Leer montoTotalComprasRealizadas
	Escribir "Introduzca el valor del pago que realizó en el corte anterior: "
	Leer pagoCorteAnterior
	pagoMinimoAnterior = saldoAnterior * 0.15
	Si pagoCorteAnterior > pagoMinimoAnterior Entonces
		interesAcumulado = 0
		multaPorPagoMenorAlMinimo = 0
	SiNo
		interesAcumulado = saldoAnterior * 0.12
		multaPorPagoMenorAlMinimo = 200;
	Fin Si
	saldoActual = saldoAnterior + montoTotalComprasRealizadas + interesAcumulado + multaPorPagoMenorAlMinimo - pagoCorteAnterior;
	pagoMinimoActual = saldoActual * 0.15
	pagoParaNoGenerarIntereses = saldoActual * 0.85
	Escribir "Valor de pago minimo: ", pagoMinimoActual;
	Escribir "Valor de pago para no generar intereses: ", pagoParaNoGenerarIntereses;
	Escribir "Valor de saldo actual: ", saldoActual;

FinAlgoritmo
