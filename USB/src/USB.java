import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;
import java.io.*;
import java.util.*;

public class USB {
	private static int i;

	public static void main(String[] args) {
		String[] Opciones = { "Información.", "Ejemplo 1 (USB).", "Ejemplo 2 (USB).", "Salir." };
		while (true) {
			Icon icono = new ImageIcon(
					"C:/Users/Christian Arroyo/Desktop/USB/USB/recursos/puerto.png");
			UIManager.put("OptionPane.messageForeground", Color.black);
			UIManager.put("Panel.background", Color.orange);
			int Caso = JOptionPane.showOptionDialog(null,
					"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
							+ "\n|X|                                                                                        "
							+ "                                        |X|"
							+ "\n|X|                                                      USB."
							+ "                                                                 |X|"
							+ "\n|X|                                                                                        "
							+ "                                        |X|"
							+ "\n|X|                                 Arroyo Auz Christian Xavier."
							+ "                                          |X|"
							+ "\n|X|                                                                                        "
							+ "                                        |X|" + "\n|X|     Opciones:"
							+ "                                                                                                        |X|"
							+ "\n|X|     1. Información."
							+ "                                                                                               |X|"
							+ "\n|X|     2. Ejemplo 1 (USB)."
							+ "                                                                                        |X|"
							+ "\n|X|     3. Ejemplo 2 (USB)."
							+ "                                                                                        |X|"
							+ "\n|X|     4. Salir."
							+ "                                                                                                             |X|"
							+ "\n|X|                                                                                        "
							+ "                                        |X|" + "\n|X|     Seleccione su Opción."
							+ "                                                                                 |X|"
							+ "\n|X|                                                                                        "
							+ "                                        |X|"
							+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|",
					"PROYECTO USB: MANEJO DEL PUERTO USB ------ MENÚ DE OPCIONES", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, icono, Opciones, null);
			switch (Caso) {
			case 0: {

				String[] Opciones2 = { "Siguiente." };
				UIManager.put("OptionPane.messageForeground", Color.white);
				UIManager.put("Panel.background", Color.black);
				int CasoB = JOptionPane.showOptionDialog(null,
						"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
								+ "|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
								+ "|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
								+ "\n|X|                                                               "
								+ "                                                                    "
								+ "                                                                    "
								+ "                                                                    "
								+ "                                                          "
								+ "                                                                 |X|" + "\n|X|"
								+ "                                                                    "
								+ "                                                                    "
								+ "                  LIBRERIAS PARA MANIPULARA EL PUERTO USB. "
								+ "                                                                    "
								+ "                                                          "
								+ "                   |X|"
								+ "\n|X|                                                               "
								+ "                                                                    "
								+ "                                                                    "
								+ "                                                               "
								+ "                                                               "
								+ "                                                                 |X|"
								+ "\n|X|  El puerto USB trae consigo muchas ventajas respecto a los antiguos puertos serie y paralelo las más notables son:"
								+ "                                                         "
								+ "                                                         "
								+ "                                                         " + "|X|"
								+ "\n|X|  * Alta tasa de transferencia (mínimo 100 veces mayor al puerto serie)."
								+ "                                                                "
								+ "                                                                "
								+ "                                                               "
								+ "                                                                 |X|"
								+ "\n|X|  * Hasta 127 dispositivos conectados en un mismo bus"
								+ "                                                                      "
								+ "                                                                      "
								+ "                                                                      "
								+ "                                                                            |X|"
								+ "\n|X|  * Es capaz de alimentar un periférico con 500mA/5V"
								+ "                                                                      "
								+ "                                                                      "
								+ "                                                                      "
								+ "                                                                                |X|"
								+ "\n|X|  * Es Plug And Play y Hot Swapable."
								+ "                                                                      "
								+ "                                                                      "
								+ "                                                                      "
								+ "                                                                      "
								+ "                                           |X|"
								+ "\n|X|  Tambien no se debe dejar de lado que se ha convertido en un Standard en la Industria de"
								+ " Computadoras, por lo que es prácticamente imposible encontrar una PC sin un puerto USB a"
								+ " nuestra disposición.       |X|" + "\n|X|"
								+ "                                                                              "
								+ "                                                                              "
								+ "                                                                              "
								+ "                                                                              "
								+ "                                                                              |X|"
								+ "\n|X|  La API JUSB:"
								+ "                                                                                           "
								+ "                                                                                           "
								+ "                                                                                           "
								+ "                                                                                           "
								+ "|X|"
								+ "\n|X|  El proyecto JUSB fue creado en junio de 2000. Su objetivo era proporcionar un conjunto de APIs de software libre de Java"
								+ " para acceder a los dispositivos USB en Linux. La API se distribuye bajo la GPL             |X|"
								+ "\n|X|  Reducida, lo que significa que se puede utilizar en propiedad, así como los proyectos de software libre. La API proporciona"
								+ " acceso a múltiples subprocesos físicos de dispositivos USB, y soporta tanto             |X|"
								+ "\n|X|  dispositivos nativos y remotos. Los dispositivos con múltiples interfaces puede acceder a varias aplicaciones (o los controladores"
								+ " de dispositivo) de forma simultánea, con cada aplicación (o el controlador   |X|"
								+ "\n|X|  de dispositivo), alegando una interfaz diferente. La API soporta transferencias de control, y las transferencias de interrupción,"
								+ " las transferencias isócronas no se admiten porque estos se utilizan para             |X|"
								+ "\n|X|  los medios de información (por ejemplo, audio y vídeo) que ya están bien soportados por la API JMF con respecto a otros controladores"
								+ " de dispositivos estandarizados . Actualmente, la API funciona en            |X|"
								+ "\n|X|  GNU / Linux, ya sea con el núcleo Linux 2.4 o un puerto nuevo en 2.2.18 del kernel. Por lo tanto, las distribuciones más recientes"
								+ " se admiten, por ejemplo, la API trabaja en Red Hat 7.2 y 9.0                                      |X|"
								+ "\n|X|"
								+ "                                                                              "
								+ "                                                                              "
								+ "                                                                              "
								+ "                                                                              "
								+ "                                                                               |X|"
								+ "\n|X|  La API JUSB incluye los siguientes paquetes:"
								+ "                                                                             "
								+ "                                                                             "
								+ "                                                                             "
								+ "                                                                         |X|"
								+ "\n|X|  * usb.core : Este paquete es parte del núcleo de la API JUSB. Esto permite a las aplicaciones Java para acceder a los dispositivos USB de hosts USB."
								+ "                                                                                                             |X|"
								+ "\n|X|  * usb.linux : Este paquete contiene una implementación de Linux de un usb.core.Host objeto, bootstrapping apoyo, y otras clases de aprovechamiento de Linux de soporte para USB. Esta aplicación"
								+ "                    |X|"
								+ "\n|X|                         tiene acceso a los dispositivos USB a través del sistema de archivos virtual para dispositivos USB."
								+ "                                                                                            "
								+ "                                                                                         |X|"
								+ "\n|X|  * usb.windows : Este paquete tiene una implementación de Windows de un usb.core.Host objeto, bootstrapping apoyo, y otras clases aprovechando el soporte de Windows USB."
								+ "                                                         |X|"
								+ "\n|X|  * usb.remote : Este paquete es una versión remota del usb.core API. Incluye un proxy RMI y una aplicación de demonio, que permiten a las aplicaciones Java para acceder a los dispositivos USB en"
								+ "                     |X|" + "\n|X|                             un ordenador remoto. "
								+ "                                                                                 "
								+ "                                                                                 "
								+ "                                                                                 "
								+ "                                                                              |X|"
								+ "\n|X|  * usb.util : Este paquete proporciona algunas utilidades para descargar firmware para dispositivos USB, volcar el contenido del sistema USB en XML, y convertir un dispositivo USB con un solo volumen"
								+ "             |X|" + "\n|X|                      de E / S en una toma."
								+ "                                                                                    "
								+ "                                                                                    "
								+ "                                                                                   "
								+ "                                                                                |X|"
								+ "\n|X|  * usb.devices : Este paquete opcional recoge el código de Java para acceder a una variedad de dispositivos USB con la API JUSB. Estas API fueron escritos especialmente para simplificar el proceso"
								+ "                 |X|"
								+ "\n|X|                              de acceder a los dispositivos USB designadas y no se puede utilizar para acceder a otros dispositivos."
								+ "                                                                                      "
								+ "                                                                                   |X|"
								+ "\n|X|  * usb.view : Este paquete opcional proporciona un sencillo navegador de árbol USB basadas en Swing. Es un programa muy buen ejemplo que ilustra el uso de la API JUSB Aunque la aplicación de la"
								+ "                   |X|"
								+ "\n|X|                         usb.core.Host varía de sistema operativo a sistema operativo."
								+ "                                                                                     "
								+ "                                                                                    "
								+ "                                                                                 |X|"
								+ "\n|X|                                                               "
								+ "                                                                    "
								+ "                                                                    "
								+ "                                                                    "
								+ "                                                            "
								+ "                                                                 |X|"
								+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X"
								+ "|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
								+ "|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|",
						"PROYECTO USB ------ INFORMACIÓN.", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, Opciones2, null);
				switch (CasoB) {
				case 0: {
					UIManager.put("Panel.background", Color.white);
					UIManager.put("OptionPane.okButtonText", "Siguiente.");
					Icon icono1 = new ImageIcon(
							"C:/Users/Christian Arroyo/Desktop/USB/USB/recursos/Tabla.png");
					JOptionPane.showMessageDialog(null, "", "PROYECTO USB ------ INFORMACIÓN.",
							JOptionPane.INFORMATION_MESSAGE, icono1);
					UIManager.put("OptionPane.okButtonText", "Siguiente.");
					Icon icono2 = new ImageIcon(
							"C:/Users/Christian Arroyo/Desktop/USB/USB/recursos/Tabla1.png");
					JOptionPane.showMessageDialog(null, "", "PROYECTO USB ------ INFORMACIÓN.",
							JOptionPane.INFORMATION_MESSAGE, icono2);
					UIManager.put("OptionPane.okButtonText", "Siguiente.");
					Icon icono3 = new ImageIcon(
							"C:/Users/Christian Arroyo/Desktop/USB/USB/recursos/Tabla2.png");
					JOptionPane.showMessageDialog(null, "", "PROYECTO USB ------ INFORMACIÓN.",
							JOptionPane.INFORMATION_MESSAGE, icono3);
					UIManager.put("OptionPane.okButtonText", "Siguiente.");
					Icon icono4 = new ImageIcon(
							"C:/Users/Christian Arroyo/Desktop/USB/USB/recursos/Tabla3.png");
					JOptionPane.showMessageDialog(null, "", "PROYECTO USB ------ INFORMACIÓN.",
							JOptionPane.INFORMATION_MESSAGE, icono4);
					UIManager.put("OptionPane.okButtonText", "Volver al Menú Principal.");
					Icon icono5 = new ImageIcon(
							"C:/Users/Christian Arroyo/Desktop/USB/USB/recursos/Tabla4.png");
					JOptionPane.showMessageDialog(null, "", "PROYECTO USB ------ INFORMACIÓN.",
							JOptionPane.INFORMATION_MESSAGE, icono5);
					break;

				}
				case -1: {
					System.exit(0);
				}
				default: {

					JOptionPane.showMessageDialog(null, "\n Mil Disculpas." + "\n Ha Ocurrido Un Error."
							+ "\n Cierre el Programa y Vuelva a Intentarlo.");
					break;
				}

				}

				break;
			}
			case 1: {
				String[] Opciones1 = { "Volver al Menú Principal.", "Ver Ejemplo." };
				UIManager.put("OptionPane.messageForeground", Color.green);
				UIManager.put("Panel.background", Color.black);
				int CasoA = JOptionPane.showOptionDialog(null,
						"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|                                                           Detector de Unidades Flash."
								+ "                                         |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X| Mediante el uso de la Librerias nombradas en la ventanade Información"
								+ "                 |X|"
								+ "\n|X| crearemos un programa capaz de Leer y Detectar Memorias Flash.                          |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X| El programa se encargara de Detectar la Unidad Flash y de decirnos el número    |X|"
								+ "\n|X| de elementos que se hallan en la ventana principal."
								+ "                                                        |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|",
						"PROYECTO USB ------ EJEMPLO 1 (USB).", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, Opciones1, null);
				switch (CasoA) {
				case 0: {
					break;
				}
				case 1: {
					String[] Letra = new String[] { "F" };
					File[] Unidades = new File[Letra.length];
					boolean[] EstaUnidad = new boolean[Letra.length];
					for (int i = 0; i < Letra.length; i++) {
						Unidades[i] = new File(Letra[i] + ":/");
						EstaUnidad[i] = Unidades[i].canRead();
						UIManager.put("OptionPane.okButtonText", "Aceptar.");
						JOptionPane.showMessageDialog(null,
								"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
										+ "\n|X|                                                                                        "
										+ "                                        |X|"
										+ "\n|X|                                                                                        "
										+ "                                        |X|"
										+ "\n|X|                                        Detector de Unidades Flash."
										+ "                                   |X|"
										+ "\n|X|                                                                                        "
										+ "                                        |X|"
										+ "\n|x|                        Conecte una Flash en cualquier Puerto USB."
										+ "                      |X|"
										+ "\n|X|                                                                                        "
										+ "                                        |X|"
										+ "\n|x|                                                   ¡ POR FAVOR !"
										+ "                                                   |X|"
										+ "\n|X|                                                                                        "
										+ "                                        |X|"
										+ "\n|X|                           Cuando lo haya hecho presione ACEPTAR."
										+ "                      |X|"
										+ "\n|X|                                                                                        "
										+ "                                        |X|"
										+ "\n|X|                                                                                        "
										+ "                                        |X|"
										+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|",
								"PROYECTO USB ------ EJEMPLO 1 (USB).", JOptionPane.INFORMATION_MESSAGE);
					}

					for (int i = 0; i < Letra.length; i++) {
						boolean Conectado = Unidades[i].canRead();
						if (Conectado != EstaUnidad[i]) {

							if (Conectado) {
								String Flash = Letra[i] + "://";
								File Archivos = new File(Flash);
								String TodosLosArchivos[] = Archivos.list();
								UIManager.put("OptionPane.okButtonText", "Volver al Menú Principal.");
								UIManager.put("OptionPane.messageForeground", Color.green);
								UIManager.put("Panel.background", Color.black);
								JOptionPane.showMessageDialog(null,
										"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X||X|X|" + "\n|X|"
												+ "                                                     "
												+ "                                                  |X|"
												+ "\n|X|                         La Unidad " + Letra[i]
												+ " ha sido conectada." + "                    |X|" + "\n|X|"
												+ "                                                     "
												+ "                                                  |X|"
												+ "\n|X|   El Total de elementos, archivos y/o carpetas es: "
												+ TodosLosArchivos.length + "       |X|" + "\n|X|"
												+ "                                                     "
												+ "                                                  |X|"
												+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X||X|X|");
							} else {
								JOptionPane.showMessageDialog(null,
										"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X||X|X|" + "\n|X|"
												+ "                                                     "
												+ "                                                  |X|"
												+ "\n|X|              La unidad " + Letra[i] + " ha sido desconectada."
												+ "                        |X|" + "\n|X|"
												+ "                                                     "
												+ "                                                  |X|"
												+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X||X|X|");
							}

							EstaUnidad[i] = Conectado;
						}
					}

					break;
				}
				case -1: {
					System.exit(0);
				}
				default: {

					JOptionPane.showMessageDialog(null, "\n Mil Disculpas." + "\n Ha Ocurrido Un Error."
							+ "\n Ciere el Programa y Vuelva a Intentarlo.");
					break;
				}
				}
				break;
			}
			case 2: {
				UIManager.put("OptionPane.messageForeground", Color.yellow);
				UIManager.put("Panel.background", Color.black);
				UIManager.put("OptionPane.okButtonText", "Siguiente.");
				JOptionPane.showMessageDialog(null,
						"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|                                         Lector de Registros de la Unidad Flash."
								+ "                                       |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X| Mediante el uso de la Librerias nombradas en la ventanade Información"
								+ "                 |X|"
								+ "\n|X| crearemos un programa capaz de Leer y Detectar Memorias Flash.                          |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X| El programa Detectara la Unidad Flash y nos dira los registros de elementos         |X|"
								+ "\n|X| que se hallan en la ventana principal, como: Ruta, Nombre, Fecha de                        |X|"
								+ "\n|X| Modificación, etc."
								+ "                                                             "
								+ "                                                          |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|                                                                                        "
								+ "                                                                 |X|"
								+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|",
						"PROYECTO USB ------ EJEMPLO 2 (USB).", JOptionPane.INFORMATION_MESSAGE);
				UIManager.put("OptionPane.okButtonText", "Aceptar.");
				JOptionPane.showMessageDialog(null,
						"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
								+ "\n|X|                                                                                        "
								+ "                                        |X|"
								+ "\n|X|                                                                                        "
								+ "                                        |X|"
								+ "\n|X|                              Lector de Registros de la Unidad Flash."
								+ "                         |X|"
								+ "\n|X|                                                                                        "
								+ "                                        |X|"
								+ "\n|x|                        Conecte una Flash en cualquier Puerto USB."
								+ "                      |X|"
								+ "\n|X|                                                                                        "
								+ "                                        |X|"
								+ "\n|x|                                                   ¡ POR FAVOR !"
								+ "                                                   |X|"
								+ "\n|X|                                                                                        "
								+ "                                        |X|"
								+ "\n|X|                           Cuando lo haya hecho presione ACEPTAR."
								+ "                      |X|"
								+ "\n|X|                                                                                        "
								+ "                                        |X|"
								+ "\n|X|                                                                                        "
								+ "                                        |X|"
								+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|",
						"PROYECTO USB ------ EJEMPLO 2 (USB).", JOptionPane.INFORMATION_MESSAGE);

				String[] Letra = new String[] { "F" };
				File[] Unidades = new File[Letra.length];
				boolean[] EstaUnidad = new boolean[Letra.length];
				for (int i = 0; i < Letra.length; i++) {
					Unidades[i] = new File(Letra[i] + ":/");
					EstaUnidad[i] = Unidades[i].canRead();
				}
				for (int i = 0; i < Letra.length; i++) {
					boolean Conectado = Unidades[i].canRead();
					if (Conectado != EstaUnidad[i]) {
					}
				}

				File directorio = new File(Letra[i] + ":/");
				if ((directorio.exists()) && (directorio.isDirectory())) {
					File[] lista = directorio.listFiles();
					for (int i = 0; i < lista.length; i++) {
						UIManager.put("OptionPane.okButtonText", "Volver al Menú Principal.");
						JOptionPane.showMessageDialog(null,
								"|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|" + "                                                    "
										+ "    La Unidad " + Letra[i] + " esta conectada."
										+ "                                            |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   " + lista[i].getAbsolutePath()
										+ "                                                                                             "
										+ "                          |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   Nombre: " + lista[i].getName()
										+ "                                                                                             "
										+ "             |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   Ruta absoluta " + lista[i].getAbsolutePath()
										+ "                                                                                            "
										+ "|X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   Ruta: " + lista[i].getPath()
										+ "                                                                                             "
										+ "               |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   Padre: " + lista[i].getParent()
										+ "                                                                                             "
										+ "                                        |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   ¿Puedo leerlo? " + lista[i].canRead()
										+ "                                                                                             "
										+ "                    |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   ¿Puedo escribirlo? " + lista[i].canWrite()
										+ "                                                                                             "
										+ "             |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   Tamaño en bytes: " + lista[i].length()
										+ "                                                                                             "
										+ "                    |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|   Fecha de la última modificación: "
										+ new Date(lista[i].lastModified()) + "                                |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|                                                                                        "
										+ "                                                                 |X|"
										+ "\n|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|X|",
								"PROYECTO USB ------ EJEMPLO 2 (USB).", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "El directorio no existe");
				}

				break;
			}
			case 3: {
				System.exit(0);
			}
			case -1: {
				System.exit(0);
			}
			default: {

				JOptionPane.showMessageDialog(null, "\n Mil Disculpas." + "\n Ha Ocurrido Un Error."
						+ "\n Cierre el Programa y Vuelva a Intentarlo.");
				break;
			}
			}
		}
	}
}