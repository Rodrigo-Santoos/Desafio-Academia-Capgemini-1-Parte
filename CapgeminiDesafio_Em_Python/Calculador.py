# Funçao para calcular as visualizaçoes
def my_function(views):   
    # A cada 100 pessoas que visualizam o anúncio 12 clicam nele.
    cliq = float(views) / 100 * 12    
    # A cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais.
    compart = float(cliq) / 20 * 3    
    # Cada compartilhamento nas redes sociais gera 40 novas visualizações.
    totViews = float(compart) * 40  
    # Total de visualizações do ciclo
    return totViews

# Valor a ser investido
Valor  = float( input("Favor informar o valor investido em reais (R$): ") )

# 30 pessoas visualizam o anúncio original
qtdValor  = float(Valor * 30)

# Valoriza 0 1ª Ciclo
result = float(qtdValor)
Total = float(result)

# repeticao de 4 Ciclo
for x in range(4):
    result = float(my_function(result))
    print("visualizações: {0}".format(result))
    Total = float(Total) + float(result) 

# Total de visualizações somando os Ciclos
print("Valor investido (R$): {0}".format(Valor) + " gerando o total de visualizações: {0}".format(Total))