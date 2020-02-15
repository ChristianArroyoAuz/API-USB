# API-USB
 El proyecto JUSB fue creado en junio de 2000. Su objetivo era proporcionar un conjunto de APIs de software libre de Java para acceder a los dispositivos USB en Linux.
La API se distribuye bajo la GPL Reducida, lo que significa que se puede utilizar en propiedad, as� como los proyectos de software libre.
La API proporciona acceso a m�ltiples subprocesos f�sicos de dispositivos USB, y soporta tanto dispositivos nativos y remotos.
Los dispositivos con m�ltiples interfaces pueden acceder a varias aplicaciones (o los controladores de dispositivo) de forma simult�nea, con cada aplicaci�n
(o el controlador de dispositivo), alegando una interfaz diferente. La API soporta transferencias de control, y las transferencias de interrupci�n, las transferencias is�cronas 
no se admiten porque estos se utilizan para los medios de informaci�n (por ejemplo, audio y v�deo) que ya est�n bien soportados por la API JMF con respecto a otros controladores 
de dispositivos estandarizados.