jugadores = ["Messi", "Suarez", "Pique", "Iniesta", "Rakitic", "Busquets", "Alba", "Digne", "Umtiti", "Ter Stegen", "Cillessen"]
camisas = [10, 9, 3, 8, 4, 5, 18, 2, 23, 1, 13]

#crear una funcion para relacionar cada jugadoir con su dorsal e imprimirlo
def relacionar_jugador_camisa(jugadores, camisas):
    print("---------------------Jugadores convocados------------------------")
    for jugador, camisa in zip(jugadores, camisas):
        print(jugador, camisa)

relacionar_jugador_camisa(jugadores, camisas)