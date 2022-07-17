# Califica3-Grupo5
# EvaluacionGrupal2
Integrantes:  
  - Gladys Alesandra Yagi Vásquez
  - Italo Enrique Silva Guanilo
  - Renato Sebastian Perez Ruiz   
--------------------------------------------------
**Pregunta 1**  
Salida:  
![img_1.png](img/img_1.png)    
Explicación:     
Lo primero que se realiza es la creación de un objeto de la clase Empleado con los atributos de firstName Jessica, lastName Abejita y experience de 7.5.
Luego se hace un llamado al método showEmpDetail() de la clase Cliente, pasándole como atributo el objeto creado con anterioridad.
![img_3.png](img/img_3.png)
![img_6.png](img/img_6.png)     
Este método, lo primero que hace es invocar al método displayEmpDetail() de la clase Empleado, el cual nos imprime los nombres y los años de experiencia del empleado. 
![img_4.png](img/img_4.png)
Se genera un Id para imprimirlo con el método invocado generateEmpId() de la clase Empleado. Este Id es creado mediante la generación de un número entero random entre 0 y 1000, y la primera letra del nombre del empleado.       
![img_2.png](img/img_2.png)     
Luego, evalúa si los años de experiencia del empleado son suficientes para ser considerado un senior(los años de experiencia deben ser mayores a 5) con el método checkSeniority() de la clase Empleado, caso contrario es un Junior, luego lo imprime.
![img_7.png](img/img_7.png)     
Se realiza el mismo procedimiento para la creación del objeto de la clase Empleado con los atributos de nombre Chalito, apellido Smart y experiencia de 3.2.        
![img_8.png](img/img_8.png)
**Pregunta 2**     
Este diseño tiene el principal problema de que la clase Cliente contiene un método que debería pertenecer a la clase Empleado (showEmpDetail()); ya que lo único que este método hace es que por medio del atributo de tipo Empleado que recibe, llama a métodos de la clase Empleado. 

**Pregunta 3**     
Se modificó el método showEmpDetail() de la clase Cliente para llamar a los métodos de las clases creadas GeneratorIDEmpleado(método generateEmpId()) y SeniorityChecker(método checkSeniority()).      
![img_9.png](img/img_9.png)     
En las clases creadas, los métodos creados son de tipo estático para no tener que crear un nuevo objeto de cada una de las clases.
![img_10.png](img/img_10.png)       
![img_11.png](img/img_11.png)       
**Pregunta 4**    
Empleado.java       
Tenemos una clase que instancia un objeto con los atributos de firstName, lastName y experience. También cuenta con un método que imprime los atributos del objeto.
Esta clase cumple con el principio ya que todo lo que contiene solo tiene que ver con su propia clase en sí.        
GeneradorIdEmpleado.java       
Esta clase solo contiene un método para crear un Id a partir del atributo firstName de un objeto Empleado.      
SeniorityChecker.java       
Esta clase solo contiene un método para verificar si el atributo de experience del objeto Empleado se considera un junior o senior.     
Cliente.java     
Esta clase tiene como responsabilidad englobar a las clases Empleado, GeneradorIdEmpleado y SeniorityChecker; mediante la creación de objetos de tipo Empleado y empleando su propio método showEmpDetail para los métodos de cada clase englobada.     
Cada una de las clases tiene una única responsabilidad.

**Pregunta 5**  
Como nos dice el enunciado previo a la pregunta,el método displayResult() nos muestra los detalles necesarios de un estudiante; sin embargo, en la clase Estudiante tenemos el metodo sobreescrito toString() el cual nos muestra los detalles del estudiante, por lo que sería innecesario implementar el método en la clase Estudiante.
Para el método evaluateDistintion() podemos observar que la clase DistintionDecider tenemos una lista de String para los departamentos, por lo que si se desea añadir este método en la clase Estudiante se deberia tambien definir estas listas, pero al hacer esto en cada llamada se crearia una nueva lista.  
  
**Pregunta 6**  
Resultados:  
![img_5.png](img/img_5.png)  
Explicación:  
![img_14.png](img/img_14.png)
Primero a través de la clase Cliente se crea una lista de tipo Estudiante que llama a la funcion enrollStudents() que crea y agrega objetos de tipo de Estudiante devolviendo la lista con los objetos añadidos  
![img_12.png](img/img_12.png)  
Luego imprimimos los atributos de cada objeto de la lista de tipo Estudiante, ademas verificamos que objetos tienen distinciones mediante el método evaluateDistinction() de la clase DistintionDecider, el cual nos dice que dependiendo del departamento pertenezca y ademas supere un score minimo este imprime que el estudiante recibió una distinción  
![img_13.png](img/img_13.png)  
  
**Pregunta 7**
  
El problema que se tiene principalmente es cuando se llama a la clase DistintionDecider, su método para verficar si se obtiene una distinción, genera dos listas de los departamentos a los que pertenecen cada uno; esto nos genera un problema si deseamos añadir mas departamentos ya que tendriamos que estar haciendo varias comprobaciones para cada una de ellas, lo mejor sería generar subclases de la clase Estudiante, el cual ya tenga n método que diga si el estudiante merece una distinción.  
  
**Pregunta 8**  
  
Generamos la interfaz DistintionDecider con el método evaluationDistinction() el cual es abstacto por pertenecer a la interfaz
![img_15.png](img/img_15.png)  
  
**Pregunta 9**  
  
Para las clases ArtsDistinctionDecider y ScienceDistinctionDecider que implementan la interfaz sobreescribimos el método evaluateDistinction() verificando que cumpla el score mínimo para que pueda obtener la distinción   
![img_16.png](img/img_16.png)  
![img_17.png](img/img_17.png)  
  
**Pregunta 10**  
  
Salida:  
![img_18.png](img/img_18.png) 
Explicación:  
Estudiante.java  
La calse abstacta solo declara nuestros parametors que usaremos para definir cualquier objeto de este tipo(name, regName,score)  
ArteEstudiante.java y CienciaEstudiante.java  
Ambas clases extienden de la clase abstracta Estudiante y son dos tipos de esta.  
DistintionDecider.java  
Es una interfaz que declara el metodo que usaran as clases que implementaran.  
ScienceDistinctionDecider.java y ArtsDistinctionDecider.java  
Clases que implementan la interfaz DistintionDecider y nos evalua si el estudiante de su departamento obtienen una distionción 
Cliente.java  
![img_19.png](img/img_19.png) 
El método main() nos creara dos listas de alumnos de los departamentos de Ciencia y Arte mediante los métodos enrollScienceStudents() y enrollArtsStudents() respectivamente. Ambos métodos nos crean y agregan objetos de tipo Estudiante a cada una de las listas.
Luego imprimiremos ambas listas de los departamentos, posteriormente las listas de estudiantes de los departamentos de ciencia y artes llamaran a las clases ScienceDistinctionDecider y ArtsDistinctionDecider respectivamente para poder determnar a aquellos estudiantes que hayan obtenido distincion en esos departamentos.  
  
**Pregunta 11**  
  
Las ventajas de este tipo de diseño son:  
- Si necesitamos crear un estudiante directamente lo haremos en las listas de cada departamento(Ciencia o Artes) así evitandonos una comprobación extra.  
- Si deseamos agregar un nuevo departamento con su respectiva verificación lo que debemos hacer es crear una nueva lista en la clase Cliente con los respectivos estudiantes,
y para la verificación se crearía una nueva clase que extienda de la interfaz DistintionDecider generando una forma simplificada de declaración.  

**Pregunta 12**  
Salida:  

![img_20.png](img/img_20.png)

Explicación:
En la clase Cliente, creamos dos usuarios que están registrados, "Abejita" y "Chalito", y una instancia de la clase PaymentHelper, 'helper'.
![img_21.png](img/img_21.png)

Añadimos los usuarios a la lista de 'helper' y usamos su método showPreviousPayments(), el cual, de dicha lista de usuarios, llama al método previousPaymentInfo() de cada usuario para mostrar los detalles de sus últimos pagos realizados.
![img_22.png](img/img_22.png)
![img_23.png](img/img_23.png)

Luego, de manera similar, llamamos al método processNewPayments(), el cual, itera la lista de usuarios y hace llamada al método newPayment() de cada usuario para mostrar las solicitudes de pago actuales.
![img_24.png](img/img_24.png)  

**Pregunta 13**  
Implementación de la clase GuestUserPayment:

![img_25.png](img/img_25.png)  

**Pregunta 14**  
![img_26.png](img/img_26.png)  

Se encuentra la excepción UnsupportedOperationException() debido al método previousPaymentInfo() de la nueva clase GuestUserPayment. Esto debido a que un usuario invitado no tiene un historial de pagos. Esto se podría solucionar con un if-else en el método showPreviousPayments() de la clase PaymentHelper el cual solo hará llamado al método previousPaymentInfo() para los usuarios que estén registrados.

**Pregunta 15**  

Si quisieramos añadir más tipos de clientes, para la solución dada en la pregunta anterior, se tendría que estar añadiendo más clausulas if-else para cada nuevo tipo de cliente.

**Pregunta 16**  

Interfaces:  
![img_27.png](img/img_27.png)  

Usuarios:
![img_28.png](img/img_28.png)  

Clase PaymentHelper:  
![img_29.png](img/img_29.png)

Clase Cliente:  
![img_30.png](img/img_30.png)

**Pregunta 17**

Se han separado los métodos que antes estaban en Payment por dos nuevas interfaces, PreviousPayment y NewPayment, con esto podemos definir que tipo de usuario debería poder usar dichos métodos implementando las adecuadas interfaces. Así cada usuario registrado podrá ver su historial de pagos realizados y realizar nuevas operaciones, mientras que el usuario invitado solo podrá realizar nuevas operaciones.

**Pregunta 18**  

Método estático para las nuevas solicitudes de pago:  
![img_31.png](img/img_31.png)  

Uso del método estático en la clase Cliente:  
![img_32.png](img/img_32.png)  

Resultados:  
![img_33.png](img/img_33.png)