p1=[50,40,30,20,10]
p2=[]

def fb(p1,p2,cont):
    if(len(p1)==0):
        return
    # x é uma lista.
    x=p1[len(p1)-1] 

    del p1[len(p1)-1] 
    print("Recursividade="+str(cont))
    cont+=1
    fb(p1,p2,cont) 
    print("O valor de X é: "+str(x))
    p2.append(x)

cont=0
fb(p1,p2,cont)

print("A lista p1 é: "+ str(p1))

print("A lista p2 é: "+ str(p2))